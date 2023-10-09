package com.example.zukii.Models;

import jakarta.persistence.*;
import org.springframework.data.relational.core.sql.In;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@Entity
public class PuntosGanados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PuntosGanadosId;

    public Integer PuntosExperiencia;

    public String Misiones;

    public String Mascotas;

    public PuntosGanados(){

    }

    public PuntosGanados (Long PuntosGanadosId, Integer PuntosExperiencia ,String Misiones, String Mascotas){
        this.PuntosGanadosId = PuntosGanadosId;
        this.PuntosExperiencia =  PuntosExperiencia;
        this.Mascotas = Mascotas;
        this.Misiones = Misiones;
    }

    public long getPuntosGanadosId() {
        return PuntosGanadosId;
    }

    public Integer getPuntosExperiencia() {
        return PuntosExperiencia;
    }

    public String getMascotas() {
        return Mascotas;
    }

    public String getMisiones() {
        return Misiones;
    }

    public void setPuntosGanadosId(long puntosGanadosId) {
        PuntosGanadosId = puntosGanadosId;
    }

    public void setMisiones(String misiones) {
        Misiones = misiones;
    }

    public void setPuntosExperiencia(Integer puntosExperiencia) {
        PuntosExperiencia = puntosExperiencia;
    }

    public void setMascotas(String mascotas) {
        Mascotas = mascotas;
    }
}
