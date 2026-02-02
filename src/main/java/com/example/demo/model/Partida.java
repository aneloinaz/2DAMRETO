package com.example.demo.model;

// Importaciones necesarias
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

// Marca la clase como una entidad JPA (tabla en la base de datos)
@Entity
public class Partida {

    // Clave primaria de la entidad
    @Id
    // Generación automática del ID (autoincrement en la BD)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Duración de la partida (por ejemplo, en minutos)
    private int duracion;

    // Fecha y hora de creación de la partida
    // Se inicializa automáticamente al crear el objeto
    private LocalDateTime fecha = LocalDateTime.now();

    // Relación Muchos a Muchos con Jugador
    // Se implementa mediante la entidad intermedia JugadorPartida
    // mappedBy indica que la relación está mapeada por el atributo "partida"
    // en la entidad JugadorPartida (lado inverso de la relación)
    @JsonIgnore // Evita bucles infinitos al serializar a JSON
    @OneToMany(mappedBy = "partida", cascade = CascadeType.ALL)
    private Set<JugadorPartida> jugadores = new HashSet<>();

    // ===== Getters y Setters =====

    // Devuelve el ID de la partida
    public Long getId() {
        return id;
    }

    // Asigna el ID de la partida
    public void setId(Long id) {
        this.id = id;
    }

    // Devuelve la duración de la partida
    public int getDuracion() {
        return duracion;
    }

    // Asigna la duración de la partida
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Devuelve la fecha de creación de la partida
    public LocalDateTime getFecha() {
        return fecha;
    }

    // Asigna manualmente la fecha (opcional)
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    // Devuelve el conjunto de jugadores que participaron en la partida
    public Set<JugadorPartida> getJugadores() {
        return jugadores;
    }

    // Asigna el conjunto de jugadores de la partida
    public void setJugadores(Set<JugadorPartida> jugadores) {
        this.jugadores = jugadores;
    }
}
