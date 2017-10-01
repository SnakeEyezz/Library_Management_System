package org.bookmanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bookmanagement.model.BookREST;
import org.springframework.jdbc.core.RowMapper;

public class BookRESTMapper implements RowMapper<BookREST>{

	@Override
	public BookREST mapRow(ResultSet resulSet, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
