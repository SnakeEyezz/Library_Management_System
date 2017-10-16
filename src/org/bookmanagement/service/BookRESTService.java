package org.bookmanagement.service;

import java.util.List;

import org.bookmanagement.dao.BookRESTDao;
import org.bookmanagement.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookRESTService {
	
	@Autowired
	BookRESTDao bookRESTDao;
	
	@Transactional
	public void addBookDTO(BookDTO bookDTO) {
		
		bookRESTDao.addBookDTO(bookDTO);
	}
	
	@Transactional
	public List<BookDTO> searchBook(BookDTO bookDTO){
		
		return bookRESTDao.searchBook(bookDTO);
		
	}

}