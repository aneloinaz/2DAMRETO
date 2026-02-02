// Paquete donde se encuentra la entidad
package com.example.demo.model;

// Importaciones de JPA
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

// Entidad intermedia que representa la relación M:N entre Jugador y Partida
@Entity
@Table(name = "jugador_partida") // Nombre de la tabla en la base de datos
public class JugadorPartida {

    // Clave primaria compuesta (jugador_id + partida_id)
    @EmbeddedId
    private JugadorPartidaId id = new JugadorPartidaId();

    // Relación muchos a uno con Jugador
    // MapsId indica que esta relación usa la parte "jugadorId" de la clave compuesta
    @ManyToOne
    @MapsId("jugadorId")
    private Jugador jugador;

    // Relación muchos a uno con Partida
    // MapsId indica que esta relación usa la parte "partidaId" de la clave compuesta
    @ManyToOne
    @MapsId("partidaId")
    private Partida partida;

    // Atributo adicional de la relación
    // Por ejemplo, la puntuación del jugador en esa partida
    private int score;

    // ===== Getters y Setters =====

    // Devuelve la clave compuesta
    public JugadorPartidaId getId() {
        return id;
    }

    // Asigna la clave compuesta
    public void setId(JugadorPartidaId id) {
        this.id = id;
    }

    // Devuelve el jugador asociado
    public Jugador getJugador() {
        return jugador;
    }

    // Asigna el jugador asociado
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    // Devuelve la partida asociada
    public Partida getPartida() {
        return partida;
    }

    // Asigna la partida asociada
    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    // Devuelve la puntuación
    public int getScore() {
        return score;
    }

    // Asigna la puntuación
    public void setScore(int score) {
        this.score = score;
    }
}
