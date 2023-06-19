package com.example.springelasticsearchsample;

import com.example.springelasticsearchsample.model.Book;
import com.example.springelasticsearchsample.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SpringElasticsearchSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringElasticsearchSampleApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(BookRepository bookRepository) {
    return args -> {
      bookRepository.deleteAll();
      var book = new Book();
      book.setTitle("title");
      book.setAuthor("author");
      bookRepository.save(book);

      bookRepository.findAll().forEach(b -> log.info(b.toString()));
    };
  }
}
