package com.simba.elasticsearchspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.simba.elasticsearchspringbootexample")
public class ElasticsearchSpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchSpringbootExampleApplication.class, args);
	}

}
