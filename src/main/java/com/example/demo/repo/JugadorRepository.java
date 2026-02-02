package com.example.demo.repo;

// Importa la interfaz base de Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// Importa la entidad Jugador
import com.example.demo.model.Jugador;

// Repositorio JPA para la entidad Jugador
// Proporciona automáticamente todas las operaciones CRUD
// sin necesidad de escribir SQL ni implementar métodos
//
// <Jugador, Long>
// - Jugador → entidad que representa la tabla jugador
// - Long → tipo de la clave primaria (ID)
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    // Spring Data JPA genera automáticamente métodos como:
    // - save(Jugador jugador)
    // - findById(Long id)
    // - findAll()
    // - deleteById(Long id)
    // - existsById(Long id)

    // Aquí se pueden definir consultas personalizadas, por ejemplo:
    // Jugador findByNombre(String nombre);
    // List<Jugador> findByEmail(String email);
}
``
