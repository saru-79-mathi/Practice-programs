package com.daythree.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daythree.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
