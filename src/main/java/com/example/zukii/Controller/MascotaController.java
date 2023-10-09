package com.example.zukii.Controller;

import com.example.zukii.Models.Mascota;
import com.example.zukii.Services.MacotaServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MascotaController {

    @Autowired
    private MacotaServicesImpl mascotaServicesImpl;

    @GetMapping(value = "/tumascota")
    public String Mascota() {
        return "Tu mascota";
    }

    @GetMapping(value = "/mascota")
    public List<Mascota> lista() {
        return mascotaServicesImpl.listaDeMascota() ;
    }

    @PostMapping(value = "/nuevamascota")
    public String save(@RequestBody Mascota mascota) {
        mascotaServicesImpl.guardarMascota(mascota);
        return "Mascota Guardada";
    }
}
