package com.example.springelasticsearchsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringElasticsearchSampleApplication {

	@Bean
	@ServiceConnection
	ElasticsearchContainer elasticsearchContainer() {
		return new ElasticsearchContainer("docker.elastic.co/elasticsearch/elasticsearch:7.17.10");
	}

	public static void main(String[] args) {
		SpringApplication.from(SpringElasticsearchSampleApplication::main).with(TestSpringElasticsearchSampleApplication.class).run(args);
	}

}
