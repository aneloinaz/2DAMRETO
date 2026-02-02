// ID compuesto para la relación M:N entre Jugador y Partida
package com.example.demo.model;

// Importaciones necesarias
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

// Indica que esta clase puede ser incrustada (embedded) en otra entidad
// Se usa como clave primaria compuesta con @EmbeddedId
@Embeddable
public class JugadorPartidaId implements Serializable {

    // Identificador del jugador (FK a la tabla Jugador)
    private Long jugadorId;

    // Identificador de la partida (FK a la tabla Partida)
    private Long partidaId;

    // ===== Getters y Setters =====

    // Devuelve el ID del jugador
    public Long getJugadorId() {
        return jugadorId;
    }

    // Asigna el ID del jugador
    public void setJugadorId(Long jugadorId) {
        this.jugadorId = jugadorId;
    }

    // Devuelve el ID de la partida
    public Long getPartidaId() {
        return partidaId;
    }

    // Asigna el ID de la partida
    public void setPartidaId(Long partidaId) {
        this.partidaId = partidaId;
    }

    // ===== equals y hashCode =====
    // Son obligatorios en claves compuestas para que JPA pueda:
    // - Identificar correctamente las entidades
    // - Gestionar el contexto de persistencia
    // - Evitar duplicados en colecciones

    @Override
    public boolean equals(Object o) {
        // Si es el mismo objeto, son iguales
        if (this == o) return true;

        // Si el objeto no es del mismo tipo, no son iguales
        if (!(o instanceof JugadorPartidaId)) return false;

        // Casting al tipo correcto
        JugadorPartidaId that = (JugadorPartidaId) o;

        // Comparación de ambos campos del ID compuesto
        return Objects.equals(jugadorId, that.jugadorId) &&
               Objects.equals(partidaId, that.partidaId);
    }

    @Override
    public int hashCode() {
        // Genera el hash usando ambos campos del ID compuesto
        return Objects.hash(jugadorId, partidaId);
    }
}
