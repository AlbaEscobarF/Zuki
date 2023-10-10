package com.example.zukii.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConfNivel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long ConfNivelId;

    public Long Nivel;

    public Long Experiencia;

    public ConfNivel(){}

    public ConfNivel (Long ConfNivelId, Long Nivel, Long Experiencia){
        this.ConfNivelId = ConfNivelId;
        this.Nivel = Nivel;
        this.Experiencia = Experiencia;
    }

    public long getConfNivelId() {
        return ConfNivelId;
    }

    public Long getExperiencia() {
        return Experiencia;
    }

    public Long getNivel() {
        return Nivel;
    }

    public void setExperiencia(Long experiencia) {
        Experiencia = experiencia;
    }

    public void setConfNivelId(long confNivelId) {
        ConfNivelId = confNivelId;
    }

    public void setNivel(Long nivel) {
        Nivel = nivel;
    }
}
