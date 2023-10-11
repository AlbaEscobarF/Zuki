package com.example.zukii.ServicesImpl;

import com.example.zukii.Models.Mascota;
import com.example.zukii.Repository.MascotaRepository;
import com.example.zukii.Services.MascotasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MacotaServicesImpl implements MascotasServices {
    // Inyección de dependencia

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> lista() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota buscarPorId(Long id) {
        Boolean existe = mascotaRepository.existsById(id);
        if (existe) {
            Mascota inidicada = mascotaRepository.findById(id).get();
            return inidicada;
        } else {
            System.out.println("El ID indicado no existe");
            return null;
        }
    }

    @Override
    public Mascota guardar(Mascota nuevo) {
        return mascotaRepository.save((nuevo));
    }

    @Override
    public void borrarPorId(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota editarPorId(Long id, Mascota actualizado) {
        Boolean existe = mascotaRepository.existsById(id);
        if (existe) {
            Mascota indicada = mascotaRepository.findById(id).get();
            indicada.setMascotaId(actualizado.getMascotaId());
            System.out.println("la mascota ha sido actualizado");
            return mascotaRepository.save(indicada);
        } else {
            System.out.println("El ID indicado no existe");
            return null;
        }
    }
}