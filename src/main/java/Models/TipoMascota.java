package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class TipoMascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TipoMascotaId;

    @NonNull
    public String Imagen;

    @NonNull
    public String TipoMascota;

    public TipoMascota() {
    }

    public TipoMascota (Long TipoMascotaId, String Imagen, String TipoMascota){
        this.TipoMascotaId = TipoMascotaId;
        this.Imagen = Imagen;
        this.TipoMascota = TipoMascota;
    }



    public long getTipoMascotaId() {
        return TipoMascotaId;
    }
    @NonNull
    public String getTipoMascota() {
        return TipoMascota;
    }

    @NonNull
    public String getImagen() {
        return Imagen;
    }

    public void setTipoMascotaId(long tipoMascotaId) {
        TipoMascotaId = tipoMascotaId;
    }

    public void setImagen(@NonNull String imagen) {
        Imagen = imagen;
    }

    public void setTipoMascota(@NonNull String tipoMascota) {
        TipoMascota = tipoMascota;
    }
}