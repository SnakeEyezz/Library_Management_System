package org.bookmanagement.dao;

import java.util.List;

import org.bookmanagement.model.Book;

public interface BookDao {
	
	public void addBook(Book book);
	public void updateBook(Book book);
	public List<Book> listBook();
	public Book getBookById(int bookId);
	public void removeBook(int bookId);

}
