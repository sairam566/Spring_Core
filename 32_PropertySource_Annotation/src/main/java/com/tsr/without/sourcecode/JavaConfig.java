package com.tsr.without.sourcecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/tsr/without/sourcecode/book.properties")
public class JavaConfig {
	
	@Autowired
	private Environment env;
	
	//Approach-1 
	@Bean(name = "HLDDesign")
	public Book book1() {
		Book book = new Book(Integer.parseInt(env.getProperty("book.isbn")), env.getProperty("book.title"));
		book.setAuthor(env.getProperty("book.author"));
		book.setPublisher(env.getProperty("book.publisher"));
		book.setPrice(Double.parseDouble(env.getProperty("book.price")));
		return book;
	}
	
	//Approach-2
	@Bean(name = "LLDDesign")
	public Book book2(@Value("${book.isbn}") int isbn,
			@Value("${book.title}") String title,
			@Value("${book.author}") String author,
			@Value("${book.publisher}") String publisher,
			@Value("${book.price}") double price){
		Book book = new Book(isbn,title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);
		return book;
	}
}
