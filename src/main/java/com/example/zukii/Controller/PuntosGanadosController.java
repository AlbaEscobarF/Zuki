package com.example.zukii.Controller;

import com.example.zukii.Models.PuntosGanados;
import com.example.zukii.Models.TipoMascota;
import com.example.zukii.Repository.PuntosGanadosRepository;
import com.example.zukii.Services.PuntosGanadosServices;
import com.example.zukii.Services.PuntosGanadosServicesImpl;
import com.example.zukii.Services.TipoMascotaServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")

public class PuntosGanadosController {

    @Autowired
    private PuntosGanadosServicesImpl puntosganadosImpl;

    @GetMapping(value = "/puntosganados")
    public String PuntosGanados() {return "Tus Puntos";}

    @GetMapping(value = "/listapuntosganados")
    public List<PuntosGanados> Lista(){return puntosganadosImpl.listaDePuntosGanados();}

    @PostMapping(value = "/guardarpuntosganados")
    public String saves(@RequestBody PuntosGanados puntosGanados){
        puntosganadosImpl.guardarPuntosGanados(puntosGanados);
        return "Puntos Guardados";
    }

    @GetMapping("/puntosganados/{id}")
    public PuntosGanados buscarPorId (@PathVariable Long id){
        PuntosGanados mostrar = puntosganadosImpl.buscarPuntosGanadosPorId(id);
        return mostrar;
    }

    @DeleteMapping("/tipoMascota/{id}")
    public String borrarPorId (@PathVariable Long id){
        puntosganadosImpl.borrarPuntosGanadosNuevo(id);
        return "El tipo de mascota ha sido borrrado";
    }

    @PutMapping("/tipoMisiones/{id}")
    public PuntosGanados editarPorId (@PathVariable Long id, @RequestBody PuntosGanados actualizado) {
        PuntosGanados editado = puntosganadosImpl.editarPuntosGanados(id, actualizado);
        return editado;

    }




}

