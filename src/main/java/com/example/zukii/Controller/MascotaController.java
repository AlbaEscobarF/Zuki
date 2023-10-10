package com.example.zukii.Controller;

import com.example.zukii.Models.Mascota;
import com.example.zukii.Models.TipoMascota;
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
    @GetMapping("/mascota/{id}")
    public Mascota buscarPorId (@PathVariable Long id){
        Mascota mostrar = mascotaServicesImpl.buscarMascotaPorId(id);
        return mostrar;
    }

    @DeleteMapping("/borrarmascota/{id}")
    public String borrarPorId (@PathVariable Long id){
        mascotaServicesImpl.borrarMascota(id);
        return "El tipo de mascota ha sido borrrado";
    }

    @PutMapping("/editarmascota/{id}")
    public Mascota editarPorId (@PathVariable Long id, @RequestBody Mascota actualizado) {
        Mascota editado = mascotaServicesImpl.editarMascotaPorId(id, actualizado);
        return editado;

    }



}
