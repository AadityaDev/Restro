package com.musejam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.musejam.app.model.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Integer>{

}