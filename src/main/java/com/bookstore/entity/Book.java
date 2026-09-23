package com.bookstore.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="books")
public class Book {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @NotBlank private String author;
 @NotBlank private String category;
 @NotBlank @Column(length=1000) private String description;
 @Positive private double price;
 @Min(0) private int stock;
 private String imageUrl;
 public Book(){}
 public Book(String name,String author,String category,String description,double price,int stock,String imageUrl){this.name=name;this.author=author;this.category=category;this.description=description;this.price=price;this.stock=stock;this.imageUrl=imageUrl;}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getName(){return name;} public void setName(String v){name=v;} public String getAuthor(){return author;} public void setAuthor(String v){author=v;}
 public String getCategory(){return category;} public void setCategory(String v){category=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public double getPrice(){return price;} public void setPrice(double v){price=v;} public int getStock(){return stock;} public void setStock(int v){stock=v;}
 public String getImageUrl(){return imageUrl;} public void setImageUrl(String v){imageUrl=v;}
}
