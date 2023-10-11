package com.example.zukii.Controller;

import com.example.zukii.Models.TipoMascota;
import com.example.zukii.ServicesImpl.TipoMascotaServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TipoMascotaController {

    @Autowired
    private TipoMascotaServicesImpl tipoMascotaservicesImpl;

    @GetMapping(value = "/tipomascota")
    public String TipoMascota() {
        return "Tipos de mascotas";
    }

    @GetMapping("/tipoMisiones")
    public List<TipoMascota> lista(){
        List<TipoMascota> mostrar = tipoMascotaservicesImpl.lista();
        return mostrar;
    }

    @PostMapping(value = "/nuevotipomascota")
    public String save(@RequestBody TipoMascota tipoMascota) {
        tipoMascotaservicesImpl.guardar(tipoMascota);
        return "Tipo de masccota Guardado";
    }


    @GetMapping("/tipoMascota/{id}")
    public TipoMascota buscarPorId(@PathVariable Long id) {
        TipoMascota mostrar = tipoMascotaservicesImpl.buscarPorId(id);
        return mostrar;
    }

    @DeleteMapping("/tipoMascota/{id}")
    public String borrarPorId(@PathVariable Long id) {
        tipoMascotaservicesImpl.borrarPorId(id);
        return "El tipo de mascota ha sido borrrado";
    }

    @PutMapping("/tipoMisiones/{id}")
    public TipoMascota editarPorId(@PathVariable Long id, @RequestBody TipoMascota actualizado) {
        TipoMascota editado = tipoMascotaservicesImpl.editarPorId(id, actualizado);
        return editado;

    }
}
