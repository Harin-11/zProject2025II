package com.example.service;

import com.example.model.Autor;
import com.example.model.Categoria;
import com.example.model.Libro;
import com.example.repository.AutorRepository;
import com.example.repository.CategoriaRepository;
import com.example.repository.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LibroService {
    private final LibroRepository libroRepository;
    private final AutorRepository autorRepository;
    private final CategoriaRepository categoriaRepository;

    public LibroService(LibroRepository libroRepository, AutorRepository autorRepository, CategoriaRepository categoriaRepository) {
        this.libroRepository = libroRepository;
        this.autorRepository = autorRepository;
        this.categoriaRepository = categoriaRepository;
    }
    public List<Libro> Listar(){
        return libroRepository.findAll();
    }
    public Libro guardar(Libro libro){
        // Si viene con IDs, buscar las entidades completas
        if (libro.getAutor() != null && libro.getAutor().getId() != null) {
            Autor autor = autorRepository.findById(libro.getAutor().getId()).orElse(null);
            libro.setAutor(autor);
        }
        if (libro.getCategoria() != null && libro.getCategoria().getId() != null) {
            Categoria categoria = categoriaRepository.findById(libro.getCategoria().getId()).orElse(null);
            libro.setCategoria(categoria);
        }
        return libroRepository.save(libro);
    }

    public Libro editar(Long id, Libro libroActualizado) {
        Libro libro = libroRepository.findById(id).orElseThrow();
        libro.setTitulo(libroActualizado.getTitulo());
        libro.setAñoPublicacion(libroActualizado.getAñoPublicacion());
        
        // Buscar las entidades completas de autor y categoría
        if (libroActualizado.getAutor() != null && libroActualizado.getAutor().getId() != null) {
            Autor autor = autorRepository.findById(libroActualizado.getAutor().getId()).orElse(null);
            libro.setAutor(autor);
        } else {
            libro.setAutor(null);
        }
        
        if (libroActualizado.getCategoria() != null && libroActualizado.getCategoria().getId() != null) {
            Categoria categoria = categoriaRepository.findById(libroActualizado.getCategoria().getId()).orElse(null);
            libro.setCategoria(categoria);
        } else {
            libro.setCategoria(null);
        }
        
        return libroRepository.save(libro);
    }

    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }
}
