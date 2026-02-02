package com.example.demo.repo;

// Importa la interfaz base de Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Partida;

// Repositorio JPA para la entidad Partida
// Extiende JpaRepository para obtener automáticamente operaciones CRUD
// sobre la tabla "partida" en la base de datos
//
// Parámetros de JpaRepository:
// - Partida → la entidad que representa la tabla
// - Long → tipo de la clave primaria (ID)
public interface PartidaRepository extends JpaRepository<Partida, Long> {

    // Spring Data JPA genera automáticamente métodos como:
    // - save(Partida partida) → guardar o actualizar una partida
    // - findById(Long id) → buscar una partida por su ID
    // - findAll() → listar todas las partidas
    // - deleteById(Long id) → eliminar una partida por su ID
    // - existsById(Long id) → comprobar si existe una partida

    // Se pueden agregar consultas personalizadas si se necesita:
    // List<Partida> findByDuracionGreaterThan(int minutos);
    // List<Partida> findByFechaBetween(LocalDateTime inicio, LocalDateTime fin);
}
