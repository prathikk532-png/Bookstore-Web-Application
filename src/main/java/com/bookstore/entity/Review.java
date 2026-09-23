package com.bookstore.entity;
import jakarta.persistence.*;
@Entity @Table(name="reviews")
public class Review { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Book book; @ManyToOne(optional=false) private User user; @Min(1) @Max(5) private int rating; @Column(length=1000) private String comment; public Review(){} public Review(Book b,User u,int r,String c){book=b;user=u;rating=r;comment=c;} public Long getId(){return id;} public Book getBook(){return book;} public User getUser(){return user;} public int getRating(){return rating;} public void setRating(int v){rating=v;} public String getComment(){return comment;} public void setComment(String v){comment=v;} }
