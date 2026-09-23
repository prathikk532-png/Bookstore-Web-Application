package com.bookstore.repository; import com.bookstore.entity.Book; import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface BookRepository extends JpaRepository<Book,Long>{ List<Book> findByNameContainingIgnoreCaseOrAuthorContainingIgnoreCase(String n,String a); List<Book> findByCategoryIgnoreCase(String c); long countByStockLessThan(int n); }
