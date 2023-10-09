package com.example.zukii.Services;

import com.example.zukii.Models.PuntosGanados;

import java.util.List;

public interface PuntosGanadosServices {
    List<PuntosGanados> listaDePuntosGanados();

    PuntosGanados buscarPuntosGanadosPorId(Long id);

    PuntosGanados guardarPuntosGanados(PuntosGanados PuntosGanadosNuevo);

    void borrarPuntosGanadosNuevo(Long id);

    PuntosGanados editarPuntosGanados(Long id, PuntosGanados nivelActualizado);
}
