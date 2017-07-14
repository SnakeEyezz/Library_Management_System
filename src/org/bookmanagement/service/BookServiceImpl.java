package org.bookmanagement.service;

import java.util.List;

import org.bookmanagement.dao.BookDao;
import org.bookmanagement.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Transactional
	public void addBook(Book book) {
		
		bookDao.addBook(book);
	}

	@Transactional
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
	}

}