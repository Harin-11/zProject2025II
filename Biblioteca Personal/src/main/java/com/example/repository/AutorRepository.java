package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
