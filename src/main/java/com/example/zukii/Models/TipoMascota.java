package com.example.zukii.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoMascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TipoMascotaId;

    public String Imagen;

    public String TipoMascota;

    public TipoMascota(){
    }

    public TipoMascota (Long TipoMascotaId, String Imagen, String TipoMascota){
        this.TipoMascotaId = TipoMascotaId;
        this.TipoMascota = TipoMascota;
        this.Imagen = Imagen;
    }

    public Long getTipoMascotaId() {
        return TipoMascotaId;
    }

    public String getTipoMascota() {
        return TipoMascota;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setTipoMascotaId(Long tipoMascotaId) {
        TipoMascotaId = tipoMascotaId;
    }

    public void setTipoMascota(String tipoMascota) {
        TipoMascota = tipoMascota;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
