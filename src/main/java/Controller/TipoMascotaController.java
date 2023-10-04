package Controller;

import Models.PuntosGanados;
import Models.TipoMascota;
import Repository.PuntosGanadosRepository;
import Repository.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoMascotaController {

    private final TipoMascotaRepository TipoMascotaRepository;

    @Autowired
    public TipoMascotaController(TipoMascotaRepository tipoMascotaRepository) {
        this.TipoMascotaRepository = tipoMascotaRepository;
    }

    @GetMapping(value = "/")
    public String TipoMascota() {
        return "Tipos de mascotas:";
    }

    @GetMapping(value = "/TipoMascota")
    public List<TipoMascota> puntos() {
        return TipoMascotaRepository.findAll();
    }

    @PostMapping(value = "TuTipoMascota")
    public String savePuntos(@RequestBody TipoMascota mascota) {
        TipoMascotaRepository.save(mascota);
        return "saved task";
    }
}

