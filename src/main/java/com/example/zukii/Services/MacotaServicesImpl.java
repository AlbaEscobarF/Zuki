package com.example.zukii.Services;

import com.example.zukii.Models.Mascota;
import com.example.zukii.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MacotaServicesImpl implements MascotasServices{
    // Inyección de dependencia

    @Autowired
    private MascotaRepository mascotaRepository;
    @Override
    public List<Mascota> listaDeMascota() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota buscarMascotaPorId(Long id) {
        return mascotaRepository.findById(id).get();
    }

    @Override
    public Mascota guardarMascota (Mascota mascotaNuevo) {
        return mascotaRepository.save(mascotaNuevo);
    }

    @Override
    public void borrarMascota(Long id) {

    }

    @Override
    public Mascota editarMascotaPorId(Long id, Mascota mascotaActualizado) {
        return null;
    }
}
