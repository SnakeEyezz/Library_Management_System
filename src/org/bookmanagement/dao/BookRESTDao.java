package org.bookmanagement.dao;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.bookmanagement.dto.BookDTO;
import org.bookmanagement.mapper.BookRESTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class BookRESTDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addBookDTO(BookDTO bookDTO) {
		
		String strsql = "call LMS_K_BOOK_DTO.p_add_book(?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(strsql, new Object[]{bookDTO.getBookName(),
												  bookDTO.getAuthor(),
												  bookDTO.getPrice(),
												  bookDTO.getQuantity(),
												  bookDTO.getPublishedOn(),
												  bookDTO.getPurchasedOn(),
												  bookDTO.getReplacedOn()});
		
	}

	@SuppressWarnings("unchecked")
	public List<BookDTO> searchBook(BookDTO bookDTO) {
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
		simpleJdbcCall.withCatalogName("LMS_K_BOOK_DTO")
					  .withProcedureName("p_get_book_list")
					  .withoutProcedureColumnMetaDataAccess();
		
		simpleJdbcCall.declareParameters(new SqlParameter("in_book_id", Types.INTEGER),
										 new SqlParameter("in_book_name", Types.VARCHAR),
										 new SqlParameter("in_author", Types.VARCHAR),
										 new SqlParameter("in_price", Types.FLOAT),
										 new SqlParameter("in_quantity", Types.INTEGER),
										 new SqlParameter("in_published_on", Types.DATE),
										 new SqlParameter("in_purchased_on", Types.DATE),
										 new SqlParameter("in_replaced_on", Types.DATE),
										 new SqlOutParameter ("out_result_set", OracleTypes.CURSOR, new BookRESTMapper()));
		
		MapSqlParameterSource param = new MapSqlParameterSource();
	    param.addValue("in_book_id", bookDTO.getBookId())
	    	 .addValue("in_book_name", bookDTO.getBookName())
	    	 .addValue("in_author", bookDTO.getAuthor())
	    	 .addValue("in_price", bookDTO.getPrice())
	    	 .addValue("in_quantity", bookDTO.getQuantity())
	    	 .addValue("in_published_on", bookDTO.getPublishedOn())
	    	 .addValue("in_purchased_on", bookDTO.getPurchasedOn())
	    	 .addValue("in_replaced_on", bookDTO.getReplacedOn());
		
		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(param);
		
		List<BookDTO> bookList = (List<BookDTO>) simpleJdbcCallResult.get("out_result_set");
		
		return bookList;
	}

}