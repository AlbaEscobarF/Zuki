package com.example.zukii.Controller;

import com.example.zukii.Models.TipoMascota;
import com.example.zukii.Services.TipoMascotaServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TipoMascotaController {

    @Autowired
    private TipoMascotaServicesImpl tipoMascotaservicesImpl;

    @GetMapping(value = "/tipomascota")
    public String TipoMascota(){return "Tipos de mascotas";}

    @GetMapping(value = "/listatipomascota")
    public List<TipoMascota> lista(){return tipoMascotaservicesImpl.ListaTipoMascota();}

    @PostMapping(value = "/nuevotipomascota")
    public String save(@RequestBody TipoMascota tipoMascota){
        tipoMascotaservicesImpl.guardarTipoMascota(tipoMascota);
        return "Tipo de masccota Guardado";
    }


}
