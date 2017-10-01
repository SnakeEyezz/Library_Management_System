package org.bookmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private int id;
	@Column(name = "BOOK_NAME")
	private String name;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "PRICE")
	private float price;
	@Column(name = "QUANTITY")
	private int quantity;

	public Book() {

	}	
	
	public Book(int id, String name, String author, float price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}