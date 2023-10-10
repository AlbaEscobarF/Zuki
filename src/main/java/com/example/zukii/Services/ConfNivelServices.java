package com.example.zukii.Services;

import com.example.zukii.Models.ConfNivel;

import java.util.List;

public interface ConfNivelServices {
    List<ConfNivel> ListaConfNivel();

    ConfNivel buscarConfNivelPorId(Long id);

    ConfNivel guardarConfNivel(ConfNivel nivelNuevo);

    void borrarConfNivel(Long id);

    ConfNivel editarConfNivelPorId(Long id, ConfNivel confNivelActualizado);
}
