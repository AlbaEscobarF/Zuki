package com.example.zukii.Services;

import com.example.zukii.Models.Mascota;

import java.util.List;

public interface MascotasServices {

        List<Mascota> lista();

        Mascota buscarPorId(Long id);

        Mascota guardar(Mascota nuevo);

        void borrarPorId(Long id);

        Mascota editarPorId(Long id, Mascota actualizado);
}
