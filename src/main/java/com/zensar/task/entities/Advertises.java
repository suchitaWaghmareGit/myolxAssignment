package com.zensar.task.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "advertiseTB")
public class Advertises {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	
	@JoinColumn(name="category_id")
	@OneToOne(cascade={CascadeType.ALL})
	private Categories category_id;
	
	private double price;
	private String description;
	
	@JoinColumn(name="user_id")
	@OneToOne(cascade={CascadeType.ALL})
	private Users user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Categories getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Categories category_id) {
		this.category_id = category_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", category_id=" + category_id + ", price=" + price
				+ ", description=" + description + ", user_id=" + user_id + "]";
	}
	public Advertises(int id, String title, Categories category_id, double price, String description, Users user_id) {
		super();
		this.id = id;
		this.title = title;
		this.category_id = category_id;
		this.price = price;
		this.description = description;
		this.user_id = user_id;
	}
	public Advertises() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
