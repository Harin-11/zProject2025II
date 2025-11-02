package com.example.service;

import com.example.model.Autor;
import com.example.repository.AutorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> obtenerAutorPorId(Long id) {
        return autorRepository.findById(id);
    }
     
    public Autor guardarAutor(Autor autor) {
        return autorRepository.save(autor);
    }
    
    public Autor actualizarAutor(Long id, Autor autorActualizado) {
        return autorRepository.findById(id)
                .map(autor -> {
                    autor.setNombre(autorActualizado.getNombre());
                    return autorRepository.save(autor);
                })
                .orElse(null);
    }
    
    public void eliminarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
