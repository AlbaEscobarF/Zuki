package com.example.zukii.Services;

import com.example.zukii.Models.Mascota;

import java.util.List;

public interface MascotasServices {

        List<Mascota> listaDeMascota();

        Mascota buscarMascotaPorId(Long id);

        Mascota guardarMascota(Mascota mascotaNuevo);

        void borrarMascota(Long id);

        Mascota editarMascotaPorId(Long id, Mascota mascotaActualizado);
    }


