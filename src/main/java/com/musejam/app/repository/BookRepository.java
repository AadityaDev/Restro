package com.musejam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.musejam.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}