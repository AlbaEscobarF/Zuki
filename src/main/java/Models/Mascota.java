package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MascotaId;

    @NonNull
    public String Nombre;

    @NonNull
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

    @NonNull
    public String getNombre() {
        return Nombre;
    }

    @NonNull
    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setMascotaId(long mascotaId) {
        MascotaId = mascotaId;
    }

    public void setNombre(@NonNull String nombre) {
        Nombre = nombre;
    }

    public void setTipoMascota(@NonNull String tipoMascota) {
        TipoMascota = tipoMascota;
    }
}
