/*
 * package com.yfanz.crud;
 * 
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.HashMap; import java.util.List; import java.util.Map;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.ResponseStatus; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController public class BooksController { private Map<Long, Book> books
 * = new HashMap<>(); private long currentId = 1;
 * 
 * public BooksController() { init(); }
 * 
 * private void init() { Book book = new Book(); book.setId(currentId);
 * book.setName("book name 1"); book.setAuthor("Tom"); book.setPrice(15.33);
 * books.put(currentId, book); }
 * 
 * @GetMapping("/books") public List<Book> getAllBooks() { Collection<Book>
 * results = books.values(); List<Book> response = new ArrayList<>(results);
 * return response;
 * 
 * }
 * 
 * public Book getBookById(long id) { return null;
 * 
 * }
 * 
 * @PostMapping("/book")
 * 
 * @ResponseStatus public HttpStatus addBook(@RequestBody Book book) {
 * System.out.println(book); book.setId(++currentId);
 * 
 * books.put(book.getId(), book);
 * 
 * return HttpStatus.OK; }
 * 
 * @DeleteMapping("/book/{id}") public void deleteBookById(@PathVariable("id")
 * long id) { books.remove(id); }
 * 
 * public void deleteBooks() {
 * 
 * }
 * 
 * @PutMapping("/book") public void updateBook(@RequestBody Book book) {
 * 
 * books.put(book.getId(), book);
 * 
 * } }
 */