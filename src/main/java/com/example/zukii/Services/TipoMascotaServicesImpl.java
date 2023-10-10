package com.example.zukii.Services;

import com.example.zukii.Models.TipoMascota;
import com.example.zukii.Repository.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoMascotaServicesImpl implements TipoMascotaServices {

    @Autowired
    private TipoMascotaRepository tipoMascotaRepository;

    @Override
    public List<TipoMascota> ListaTipoMascota(){return tipoMascotaRepository.findAll();}

    @Override
    public TipoMascota buscarTipoMascotaPorId(Long id){return tipoMascotaRepository.findById(id).get();}

    @Override
    public TipoMascota guardarTipoMascota (TipoMascota TipoMascotaNuevo){return tipoMascotaRepository.save(TipoMascotaNuevo);}

    @Override
    public void borrarTipoMascota(Long id){}

    @Override
    public TipoMascota editarTipoMascotaPorId(Long id, TipoMascota TipoMascotaActualizado){return null;}

}
