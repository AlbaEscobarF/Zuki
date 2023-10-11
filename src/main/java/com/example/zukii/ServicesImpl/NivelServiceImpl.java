package com.example.zukii.ServicesImpl;

import com.example.zukii.Models.Nivel;
import com.example.zukii.Repository.NivelRepository;
import com.example.zukii.Services.NivelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class NivelServiceImpl implements NivelServices {
        @Autowired
        NivelRepository nivelRepository;

        @Override
        public List<Nivel> lista() {
            return nivelRepository.findAll ();
        }

        @Override
        public Nivel buscarPorId(Long id) {
            Boolean existe= nivelRepository.existsById(id);
            if(existe){
                Nivel inidicada= nivelRepository.findById(id).get();
                return inidicada;
            }else{
                System.out.println("El ID indicado no existe");
                return null;
            }
        }

        @Override
        public Nivel guardar(Nivel nuevo) {
            return nivelRepository.save((nuevo));
        }

        @Override
        public void borrarPorId(Long id) {
            nivelRepository.deleteById(id);
        }

        @Override
        public Nivel editarPorId(Long id, Nivel actualizado) {
            Boolean existe = nivelRepository.existsById(id);
            if (existe){
                Nivel indicada = nivelRepository.findById(id).get();
                indicada.setNivel(actualizado.getNivel());
                System.out.println("El tipo de misión ha sido actualizado");
                return nivelRepository.save(indicada);
            }else{
                System.out.println("El ID indicado no existe");
                return null;
            }
        }
}
