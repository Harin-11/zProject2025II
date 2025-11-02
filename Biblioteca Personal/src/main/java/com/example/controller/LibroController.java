package com.example.controller;
import com.example.model.Libro;
import com.example.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/libros")
public class LibroController extends LibroRepository {
    private final LibroService libroService;

    public LibroController(LibroService libroService) {
    this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> listar() {
    return libroService.Listar();
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
    return libroService.guardar(libro);
    }

    @PutMapping("/{id}")
    public Libro editar(@PathVariable Long id, @RequestBody Libro  libro) {
    return libroService.editar(id, libro);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroService.eliminar(id);
    }
}
