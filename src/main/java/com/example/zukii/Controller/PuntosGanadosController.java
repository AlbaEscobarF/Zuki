package com.example.zukii.Controller;

import com.example.zukii.Models.PuntosGanados;
import com.example.zukii.ServicesImpl.PuntosGanadosServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")

public class PuntosGanadosController {

    @Autowired
    private PuntosGanadosServicesImpl puntosGanadosServices;



    @GetMapping("/puntosGanados")
    public List<PuntosGanados> lista(){
        List<PuntosGanados> mostrar = puntosGanadosServices.lista();
        return mostrar;
    }

    @PostMapping(value = "/puntosGanados")
    public String save(@RequestBody PuntosGanados puntosGanados) {
        puntosGanadosServices.guardar(puntosGanados);
        return "Tipo de masccota Guardado";
    }


    @GetMapping("/puntosGanados/{id}")
    public PuntosGanados buscarPorId(@PathVariable Long id) {
        PuntosGanados mostrar = puntosGanadosServices.buscarPorId(id);
        return mostrar;
    }

    @DeleteMapping("/puntosGanados/{id}")
    public String borrarPorId(@PathVariable Long id) {
        puntosGanadosServices.borrarPorId(id);
        return "El tipo de mascota ha sido borrrado";
    }

    @PutMapping("/puntosGanados/{id}")
    public PuntosGanados editarPorId(@PathVariable Long id, @RequestBody PuntosGanados actualizado) {
        PuntosGanados editado = puntosGanadosServices.editarPorId(id, actualizado);
        return editado;

    }


}

