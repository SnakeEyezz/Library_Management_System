package org.bookmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_REST")
public class BookREST {
	
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
	
	@Column(name = "PUBLISHED_ON")
	private Date publishedOn;
	
	@Column(name = "PURCHASED_ON")
	private Date purchasedOn;

	public BookREST() {

	}	
	
	public BookREST(int id, String name, String author, float price, int quantity, Date publishedOn, Date purchasedOn) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.publishedOn = publishedOn;
		this.purchasedOn = purchasedOn;
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
	public Date getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}

	public Date getPurchasedOn() {
		return purchasedOn;
	}

	public void setPurchasedOn(Date purchasedOn) {
		this.purchasedOn = purchasedOn;
	}

}