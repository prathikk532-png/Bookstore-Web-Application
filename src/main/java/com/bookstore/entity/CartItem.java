package com.bookstore.entity;
import jakarta.persistence.*;
@Entity @Table(name="cart_items", uniqueConstraints=@UniqueConstraint(columnNames={"user_id","book_id"}))
public class CartItem { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private User user; @ManyToOne(optional=false) private Book book; private int quantity; public CartItem(){} public CartItem(User u,Book b,int q){user=u;book=b;quantity=q;} public Long getId(){return id;} public User getUser(){return user;} public Book getBook(){return book;} public int getQuantity(){return quantity;} public void setQuantity(int q){quantity=q;} }
