package com.library;

import com.library.annotations.Value;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        InputStream is = App.class
                .getResourceAsStream("/application.properties");
        properties.load(is);

//        System.out.println(properties.getProperty("filepath"));
//
//        Reflections reflections = new Reflections("com.library",
//                new FieldAnnotationsScanner());
//        Set<Field> fieldsAnnotatedWith = reflections
//                .getFieldsAnnotatedWith(Value.class);
//        for (Field field : fieldsAnnotatedWith) {
//            System.out.println(field.getName());
//        }

        MyFileReader myFileReader = new MyFileReader();
        Field[] declaredFields = myFileReader.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Value.class)) {
                field.setAccessible(true);
                String annotationValue = field
                        .getAnnotation(Value.class)
                        .value();
                field.set(myFileReader, properties.getProperty(annotationValue));
            }
        }

        myFileReader.printFilePath();

    }
}

class MyFileReader {
    @Value(value = "filepath")
    String filePath;

    public void printFilePath() {
        System.out.println(filePath);
    }
}
