package org.bookmanagement.controller;

import java.util.Map;

import org.bookmanagement.model.Book;
import org.bookmanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
	public ModelAndView listBooks(Map<String, Object> map){
		
		map.put("bookList", bookService.listBook());
		
		return new ModelAndView("bookList");
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBookForm(){
		
		ModelAndView model = new ModelAndView("addBook");
		return model;
	}
	
	@RequestMapping(value = "/addBookDetails", method = RequestMethod.POST)
	public ModelAndView bookAddition(@ModelAttribute("book") Book book, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("addBook");
			return model1;
		}
		
		bookService.addBook(book);
		
		ModelAndView model = new ModelAndView("successfulAddition");
		return model;
	}
	
	@RequestMapping(value = "/edit/{bookId}", method = RequestMethod.GET)
	public ModelAndView editBookForm(@PathVariable("bookId") Integer bookId){
		
		Book book = (Book) bookService.getBookById(bookId);
		
		ModelAndView model = new ModelAndView("editBook");
		model.addObject(book);
		return model;
	}
	
	@RequestMapping(value = "/editBookDetails", method = RequestMethod.POST)
	public ModelAndView bookEdit(@ModelAttribute("book") Book book, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("editBook");
			return model1;
		}
		
		bookService.updateBook(book);
		
		ModelAndView model = new ModelAndView("successfulEdit");
		return model;
	}
	
	@RequestMapping("/delete/{bookId}")
	public ModelAndView deleteBook(@PathVariable("bookId") Integer bookId){
		
		bookService.removeBook(bookId);
		
		ModelAndView model = new ModelAndView("successfulDelete");
		return model;
	}

}
