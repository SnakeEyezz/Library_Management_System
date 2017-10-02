package org.bookmanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bookmanagement.dto.BookDTO;
import org.springframework.jdbc.core.RowMapper;

public class BookRESTMapper implements RowMapper<BookDTO>{

	@Override
	public BookDTO mapRow(ResultSet resulSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
