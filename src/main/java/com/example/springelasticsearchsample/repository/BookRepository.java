package com.example.springelasticsearchsample.repository;

import com.example.springelasticsearchsample.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {

}
