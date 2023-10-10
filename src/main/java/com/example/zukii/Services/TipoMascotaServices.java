package com.example.zukii.Services;

import com.example.zukii.Models.TipoMascota;

import java.util.List;

public interface TipoMascotaServices {
    List<TipoMascota> ListaTipoMascota();

    TipoMascota buscarTipoMascotaPorId(Long id);

    TipoMascota guardarTipoMascota(TipoMascota TipoMascotaNuevo);

    void borrarTipoMascota(Long id);

    TipoMascota editarTipoMascotaPorId(Long id, TipoMascota TipoMascotaActualizado);
}
