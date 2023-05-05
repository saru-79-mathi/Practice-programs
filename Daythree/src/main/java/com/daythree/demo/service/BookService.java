package com.daythree.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daythree.demo.model.Book;
import com.daythree.demo.repository.BookRepository;


@Service
public class BookService {

	@Autowired
	BookRepository BookService;
	
	public List<Book> getAllStudents()
	{
		List<Book>studentList=BookService.findAll();
		return studentList;
	}
	public Book saveBook(Book b) {
		return BookService.save(b);
	}

}
