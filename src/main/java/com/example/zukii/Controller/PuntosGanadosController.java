package com.example.zukii.Controller;

import com.example.zukii.Models.PuntosGanados;
import com.example.zukii.Repository.PuntosGanadosRepository;
import com.example.zukii.Services.PuntosGanadosServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

}

