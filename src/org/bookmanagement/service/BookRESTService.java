package org.bookmanagement.service;

import java.util.List;

import org.bookmanagement.dao.BookRESTDao;
import org.bookmanagement.model.Book;
import org.bookmanagement.model.BookREST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookRESTService {
	
	@Autowired
	BookRESTDao bookRESTDao;
	
	@Transactional
	public void addBookREST(BookREST bookREST) {
		
		bookRESTDao.addBookREST(bookREST);
	}

	/*@Transactional
	public void updateBook(Book book) {
		
		bookDao.updateBook(book);
	}

	@Transactional
	public List<Book> listBook() {
		
		return bookDao.listBook();
	}

	@Transactional
	public Book getBookById(int bookId) {
		
		return bookDao.getBookById(bookId);
	}

	@Transactional
	public void removeBook(int bookId) {
		
		bookDao.removeBook(bookId);
	}*/

}