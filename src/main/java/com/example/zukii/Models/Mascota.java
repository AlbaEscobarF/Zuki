package com.example.zukii.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MascotaId;


    public String Nombre;


    public String TipoMascota;

    public Mascota() {
    }

    public Mascota (Long MascotaId, String nombre, String TipoMascota){
        this.MascotaId = MascotaId;
        this.TipoMascota =TipoMascota;
        this.Nombre = Nombre;
    }

    public long getMascotaId() {
        return MascotaId;
    }


    public String getNombre() {
        return Nombre;
    }


    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setMascotaId(long mascotaId) {
        MascotaId = mascotaId;
    }

    public void setNombre( String nombre) {
        Nombre = nombre;
    }

    public void setTipoMascota( String tipoMascota) {
        TipoMascota = tipoMascota;
    }
}
