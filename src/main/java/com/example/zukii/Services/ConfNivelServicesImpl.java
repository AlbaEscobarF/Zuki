package com.example.zukii.Services;

import com.example.zukii.Models.ConfNivel;
import com.example.zukii.Repository.ConfNivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfNivelServicesImpl implements ConfNivelServices {

    @Autowired
    private ConfNivelRepository confNivelRepository;


    @Override
    public List<ConfNivel> ListaConfNivel() {return confNivelRepository.findAll();}

    @Override
    public ConfNivel buscarConfNivelPorId(Long id){return confNivelRepository.findById(id).get();}

    @Override
    public ConfNivel guardarConfNivel(ConfNivel nivelNuevo) {return confNivelRepository.save(nivelNuevo);}

    @Override
    public void borrarConfNivel(Long id){}

    @Override
    public ConfNivel editarConfNivelPorId(Long id, ConfNivel confNivelActualizado){return null;}




}
