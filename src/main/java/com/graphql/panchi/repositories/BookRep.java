package com.graphql.panchi.repositories;


import com.graphql.panchi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRep extends JpaRepository<Book, Integer> {
}