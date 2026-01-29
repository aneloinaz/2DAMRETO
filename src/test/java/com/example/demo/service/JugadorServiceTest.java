package com.example.demo.service;

import com.example.demo.dto.JugadorDTO;
import com.example.demo.model.Jugador;
import com.example.demo.repo.JugadorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class JugadorServiceTest {

    @Mock
    private JugadorRepository repo;

    @InjectMocks
    private JugadorService service;

    @Test
    void crearJugador_debeGuardarJugador() {
        // Arrange
        JugadorDTO dto = new JugadorDTO();
        dto.setNombre("Carlos");
        dto.setEmail("carlos@email.com");

        Jugador guardado = new Jugador();
        guardado.setId(1L);
        guardado.setNombre("Carlos");
        guardado.setEmail("carlos@email.com");

        when(repo.save(any(Jugador.class))).thenReturn(guardado);
        // Act
        Jugador resultado = service.crear(dto);

        // Assert
        assertNotNull(resultado.getId());
        assertEquals("Carlos", resultado.getNombre());
        verify(repo, times(1)).save(any(Jugador.class));
    }
}
