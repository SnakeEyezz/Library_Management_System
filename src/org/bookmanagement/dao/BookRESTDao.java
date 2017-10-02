package org.bookmanagement.dao;

import org.bookmanagement.model.BookREST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRESTDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addBookREST(BookREST bookREST) {
		
		
		
	}

	/*public void updateBook(Book book) {
		
		sessionFactory.getCurrentSession().update(book);
	}

	@SuppressWarnings("unchecked")
	public List<Book> listBook() {
		
		return sessionFactory.getCurrentSession().createQuery("from Book").list();
	}

	@SuppressWarnings("unchecked")
	public Book getBookById(int bookId) {
		
		Session session = sessionFactory.getCurrentSession();
		List<Book> list = session.createQuery("from Book b where b.id= :bookId")
								 .setParameter("bookId", bookId).list();
		return  list.size()>0 ? (Book)list.get(0): null;
	}
	
	public void removeBook(int bookId) {
		
		Book book = (Book) sessionFactory.getCurrentSession().load(Book.class, bookId);
		sessionFactory.getCurrentSession().delete(book);
	}*/

}