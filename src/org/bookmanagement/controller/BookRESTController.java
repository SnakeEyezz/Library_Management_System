package org.bookmanagement.controller;

import java.util.List;

import org.bookmanagement.dto.BookDTO;
import org.bookmanagement.service.BookRESTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	
	@RequestMapping(value = "/books/search", method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookDTO> getBookList(@RequestBody BookDTO bookDTO){
		
		System.out.println(bookDTO.getReplacedOn());
		return bookRESTService.searchBook(bookDTO);
		
	}
	
}