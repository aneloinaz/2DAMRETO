package com.example.demo.repo;

// Importa la interfaz base de Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.JugadorPartida;
import com.example.demo.model.JugadorPartidaId;

// Repositorio JPA para la entidad JugadorPartida
// Permite realizar operaciones CRUD (Create, Read, Update, Delete)
// sobre la tabla intermedia jugador_partida
//
// El primer parámetro es la entidad
// El segundo parámetro es el tipo de la clave primaria (ID compuesto)
public interface JugadorPartidaRepository
        extends JpaRepository<JugadorPartida, JugadorPartidaId> {

    // No es necesario añadir métodos si los CRUD básicos son suficientes.
    // Spring Data JPA genera automáticamente métodos como:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - existsById()

    // Aquí podrías añadir consultas personalizadas, por ejemplo:
    // List<JugadorPartida> findByJugadorId(Long jugadorId);
    // List<JugadorPartida> findByPartidaId(Long partidaId);
}
