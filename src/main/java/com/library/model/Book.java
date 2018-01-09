package com.library.model;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Book {
    private String id;
    private String bookName;
    private String author;
    private Integer issueYear;

}
