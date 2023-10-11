package com.example.zukii.Services;

import com.example.zukii.Models.Nivel;

import java.util.List;

public interface NivelServices {
    List<Nivel> lista();

    Nivel buscarPorId(Long id);

    Nivel guardar(Nivel nuevo);

    void borrarPorId(Long id);

    Nivel editarPorId(Long id, Nivel actualizado);
}
