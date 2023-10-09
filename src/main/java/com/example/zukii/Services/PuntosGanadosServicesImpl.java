package com.example.zukii.Services;

import com.example.zukii.Models.PuntosGanados;
import com.example.zukii.Repository.PuntosGanadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PuntosGanadosServicesImpl implements PuntosGanadosServices{

    @Autowired
    private PuntosGanadosRepository PuntosGanadosRepository;
    @Override
    public List<PuntosGanados> listaDePuntosGanados() {
        return PuntosGanadosRepository.findAll();
    }

    @Override
    public PuntosGanados buscarPuntosGanadosPorId(Long id) {
        return PuntosGanadosRepository.findById(id).get();
    }

    @Override
    public PuntosGanados guardarPuntosGanados (PuntosGanados PuntosGanadosNuevo) {
        return PuntosGanadosRepository.save(PuntosGanadosNuevo);
    }

    @Override
    public void borrarPuntosGanadosNuevo(Long id) {

    }

    @Override
    public PuntosGanados editarPuntosGanados(Long id, PuntosGanados nivelActualizado) {
        return null;
    }
}


