package Models;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class PuntosGanados {

    @Id //le indicamos que es la llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementacion se usa Identity con ID
    private long PuntosGanadosId;

    @NonNull
    public Integer Experiencia;

    @NonNull
    public String Misiones;

    @NonNull
    public String Mascota;

    public PuntosGanados() {
    }

    public PuntosGanados (Long PuntosGanados ,Integer Experiencia, String Misiones){
    this.PuntosGanadosId = PuntosGanadosId;
    this.Experiencia = Experiencia;
    this.Misiones = Misiones;
    this.Mascota = Mascota;
}

    public long getPuntosGanadosId() {
        return PuntosGanadosId;
    }

    @NonNull
    public Integer getExperiencia() {
        return Experiencia;
    }

    @NonNull
    public String getMascota() {
        return Mascota;
    }

    @NonNull
    public String getMisiones() {
        return Misiones;
    }

    public void setPuntosGanadosId(long puntosGanadosId) {
        PuntosGanadosId = puntosGanadosId;
    }

    public void setExperiencia(@NonNull Integer experiencia) {
        Experiencia = experiencia;
    }

    public void setMascota(@NonNull String mascota) {
        Mascota = mascota;
    }

    public void setMisiones(@NonNull String misiones) {
        Misiones = misiones;
    }
}
