package com.example.zukii.Controller;

import com.example.zukii.Models.ConfNivel;
import com.example.zukii.Services.ConfNivelServices;
import com.example.zukii.Services.ConfNivelServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ConfvelController {

    @Autowired
    ConfNivelServicesImpl confnivelServiceimpl;

    @GetMapping(value = "/nivel")
    public Long Nivel(){return 200L;}

    @GetMapping(value = "/listanivel")
    public List<ConfNivel> lista(){return confnivelServiceimpl.ListaConfNivel(); }


    @PostMapping(value = "/nuevonivel")
    public Long save(@RequestBody ConfNivel confNivel){
        confnivelServiceimpl.guardarConfNivel(confNivel);
        return 200L;

    }




}

