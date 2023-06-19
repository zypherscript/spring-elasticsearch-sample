package com.example.springelasticsearchsample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
@Data
public class Book {

  @Id
  private String id;
  private String title;
  private String author;
}
