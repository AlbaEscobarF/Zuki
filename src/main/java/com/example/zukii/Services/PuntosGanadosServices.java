package com.example.zukii.Services;

import com.example.zukii.Models.PuntosGanados;

import java.util.List;

public interface PuntosGanadosServices {

    List<PuntosGanados> lista();

    PuntosGanados buscarPorId(Long id);

    PuntosGanados guardar(PuntosGanados nuevo);

    void borrarPorId(Long id);

    PuntosGanados editarPorId(Long id, PuntosGanados actualizado);
}
