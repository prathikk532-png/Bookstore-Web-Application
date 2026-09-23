package com.bookstore.api;
import com.bookstore.entity.*; import com.bookstore.repository.UserRepository; import com.bookstore.security.JwtService; import com.bookstore.service.BookService; import org.springframework.http.*; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api") public class ApiController {private final BookService books;private final UserRepository users;private final PasswordEncoder enc;private final JwtService jwt;public ApiController(BookService b,UserRepository u,PasswordEncoder e,JwtService j){books=b;users=u;enc=e;jwt=j;}
 @GetMapping("/books") public List<Book> books(@RequestParam(required=false)String q,@RequestParam(required=false)String category){return books.all(q,category);}
 @GetMapping("/stats") public Map<String,Object> stats(){return Map.of("books",books.count(),"lowStock",books.lowStock(),"timestamp",new Date().toString());}
 @PostMapping("/auth/login") public Map<String,String> login(@RequestParam String username,@RequestParam String password){User u=users.findByUsername(username).orElseThrow();if(!enc.matches(password,u.getPassword()))throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Invalid credentials");return Map.of("token",jwt.generate(username),"role",u.getRole().name());}
}
