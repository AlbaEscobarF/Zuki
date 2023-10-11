package com.example.zukii.Services;

import com.example.zukii.Models.TipoMascota;

import java.util.List;

public interface TipoMascotaServices {

    List<TipoMascota> lista();

    TipoMascota buscarPorId(Long id);

    TipoMascota guardar(TipoMascota nuevo);

    void borrarPorId(Long id);

    TipoMascota editarPorId(Long id, TipoMascota actualizado);
}
