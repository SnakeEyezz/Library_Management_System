package org.bookmanagement.controller;

import org.bookmanagement.dto.BookDTO;
import org.bookmanagement.service.BookRESTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRESTController {
	
	@Autowired 
	private BookRESTService bookRESTService;
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public boolean addBook(@RequestBody BookDTO bookDTO){
		
		bookRESTService.addBookDTO(bookDTO);
		
		return true;
	}
	
	/*@RequestMapping(value = "/books", method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> getBookList(){
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.addAll(bookRESTService.listBook());
		
		return bookList;
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET, 
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> getBook(@PathVariable("id") int id){
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(bookRESTService.getBookById(id));
		
		return bookList;
	}
	

	
	@RequestMapping(value = "/books/{id}", method= RequestMethod.PUT)
	public boolean updateBook(@PathVariable("id") int id, @RequestBody Book book){
		
		bookRESTService.updateBook(book);
		
		return true;
	}
	
	@RequestMapping(value = "/books/{id}", method= RequestMethod.DELETE)
	public boolean removeBook(@PathVariable("id") int id){
		
		bookRESTService.removeBook(id);
		
		return true;
	}*/
	
}
