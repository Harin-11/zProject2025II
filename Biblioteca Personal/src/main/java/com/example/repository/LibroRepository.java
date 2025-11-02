package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
