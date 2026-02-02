package com.example.demo.dto;

// DTO (Data Transfer Object) para enviar estadísticas generales del juego
// Los DTO se usan para transportar datos entre capas (por ejemplo, Service → Controller → Cliente)
// sin exponer directamente las entidades JPA.
public class EstadisticasJuegoDTO {

    // Total de jugadores en el sistema
    private int totalJugadores;

    // Total de partidas registradas
    private int totalPartidas;

    // Promedio de puntuación por partida
    // Suma de los scores de todos los jugadores en todas las partidas / número de partidas
    private double promedioScorePorPartida;

    // Promedio de duración de las partidas
    // Suma de la duración de todas las partidas / número de partidas
    private double promedioDuracionPorPartida;

    // Promedio de jugadores por partida
    // Número total de jugadores participando / número de partidas
    private double promedioJugadoresPorPartida;

    // ===== Getters y Setters =====

    // Devuelve el total de jugadores
    public int getTotalJugadores() {
        return totalJugadores;
    }

    // Asigna el total de jugadores
    public void setTotalJugadores(int totalJugadores) {
        this.totalJugadores = totalJugadores;
    }

    // Devuelve el total de partidas
    public int getTotalPartidas() {
        return totalPartidas;
    }

    // Asigna el total de partidas
    public void setTotalPartidas(int totalPartidas) {
        this.totalPartidas = totalPartidas;
    }

    // Devuelve el promedio de score por partida
    public double getPromedioScorePorPartida() {
        return promedioScorePorPartida;
    }

    // Asigna el promedio de score por partida
    public void setPromedioScorePorPartida(double promedioScorePorPartida) {
        this.promedioScorePorPartida = promedioScorePorPartida;
    }

    // Devuelve el promedio de duración por partida
    public double getPromedioDuracionPorPartida() {
        return promedioDuracionPorPartida;
    }

    // Asigna el promedio de duración por partida
    public void setPromedioDuracionPorPartida(double promedioDuracionPorPartida) {
        this.promedioDuracionPorPartida = promedioDuracionPorPartida;
    }

    // Devuelve el promedio de jugadores por partida
    public double getPromedioJugadoresPorPartida() {
        return promedioJugadoresPorPartida;
    }

    // Asigna el promedio de jugadores por partida
    public void setPromedioJugadoresPorPartida(double promedioJugadoresPorPartida) {
        this.promedioJugadoresPorPartida = promedioJugadoresPorPartida;
    }
}
