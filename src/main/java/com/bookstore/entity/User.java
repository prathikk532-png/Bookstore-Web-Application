package com.bookstore.entity;
import jakarta.persistence.*;
@Entity @Table(name="users")
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(unique=true,nullable=false) private String username;
 @Column(nullable=false) private String password;
 @Column(unique=true,nullable=false) private String email;
 @Enumerated(EnumType.STRING) private Role role=Role.USER;
 public User(){} public User(String u,String p,String e,Role r){username=u;password=p;email=e;role=r;}
 public Long getId(){return id;} public String getUsername(){return username;} public void setUsername(String v){username=v;} public String getPassword(){return password;} public void setPassword(String v){password=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public Role getRole(){return role;} public void setRole(Role v){role=v;}
}
