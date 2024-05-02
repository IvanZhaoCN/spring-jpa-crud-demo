package com.yfanz.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController2 {
	@Autowired
	BookRepository bookRepository;
	

	@GetMapping("/book")
	public List<Book> getAllBooks() {

		return bookRepository.findAll();

	}

	public Book getBookById(long id) {
		return null;

	}

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		
		return bookRepository.save(book);
	}

	@DeleteMapping("/book/{id}")
	public void deleteBookById(@PathVariable("id") long id) {
		bookRepository.deleteById(id);
		return;
	}

	public void deleteBooks() {

	}

	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book) {

		return bookRepository.save(book);
	}
}
