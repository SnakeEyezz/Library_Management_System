package org.bookmanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.bookmanagement.dto.BookDTO;
import org.springframework.jdbc.core.RowMapper;


public class BookRESTMapper implements RowMapper<BookDTO>{

	@Override
	public BookDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		BookDTO bookDTO = new BookDTO();
		
		bookDTO.setBookId(resultSet.getInt("BOOK_ID"));
		bookDTO.setBookName(resultSet.getString("BOOK_NAME"));
		bookDTO.setAuthor(resultSet.getString("AUTHOR"));
		bookDTO.setPrice(resultSet.getFloat("PRICE"));
		bookDTO.setQuantity(resultSet.getInt("QUANTITY"));
		bookDTO.setPublishedOn(resultSet.getDate("PUBLISHED_ON"));
		bookDTO.setPurchasedOn(resultSet.getDate("PURCHASED_ON"));
		bookDTO.setReplacedOn(resultSet.getDate("REPLACED_ON"));

		return bookDTO;
	}

}
