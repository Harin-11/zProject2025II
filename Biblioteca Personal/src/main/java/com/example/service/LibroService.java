package com.example.service;

import com.example.model.Libro;
import com.example.repository.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LibroService implements LibroRepository {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    public List<Libro> Listar(){
        return libroRepository.findAll();
    }
    public Libro guardar(Libro libro){
        return libroRepository.save(libro);
    }

    public Libro editar(Long id, Libro LibroActualizado) {
        Libro libro = libroRepository.findById(id).orElseThrow();
        libro.setTitulo(libroActualizado.getTitulo());
        libro.setAñoPublicacion(libroActualizado.getAñoPublicacion());
        libro.setAutor(libroActualizado.getAutor());
        libro.setCategoria(libroActualizado.getCategoria());
        return libroRepository.save(libro);

    }

    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }
}
