package com.example.springelasticsearchsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.springelasticsearchsample.repository")
public class ElasticsearchConfig {

//  @Bean
//  public RestClient getRestClient() {
//    final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//    credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("", ""));
//    return RestClient.builder(new HttpHost("localhost", 9200))
//        .setHttpClientConfigCallback(httpClientBuilder -> {
//          httpClientBuilder.disableAuthCaching();
//          httpClientBuilder.setDefaultHeaders(List.of(
//              new BasicHeader(
//                  HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON)));
//          httpClientBuilder.addInterceptorLast((HttpResponseInterceptor)
//              (response, context) ->
//                  response.addHeader("X-Elastic-Product", "Elasticsearch"));
//          return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//        }).build();
//  }
//
//  @Bean
//  public ElasticsearchTransport getElasticsearchTransport() {
//    return new RestClientTransport(getRestClient(), new JacksonJsonpMapper());
//  }
//
//  @Bean
//  public ElasticsearchClient getElasticsearchClient() {
//    return new ElasticsearchClient(getElasticsearchTransport());
//  }
}
