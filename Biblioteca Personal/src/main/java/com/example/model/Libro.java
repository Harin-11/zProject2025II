package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer añoPublicacion;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

	public Libro() {
		
	}

	public Libro(Long id, String titulo, Integer añoPublicacion, Autor autor, Categoria categoria) {
		
		this.id = id;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.autor = autor;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(Integer añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
}
