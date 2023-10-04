package Controller;

import Models.PuntosGanados;
import Repository.MascotaRepository;
import Repository.PuntosGanadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {

    private final MascotaRepository MascotaRepository;

    @Autowired
    public MascotaController(MascotaRepository mascotaRepository) {
        this.MascotaRepository = mascotaRepository;
    }

    @GetMapping(value = "/")
    public String PuntosGanados() {
        return "Puntos ganados:";
    }

    @GetMapping(value = "/Puntos Ganados")
    public List<Mascota> puntos() {
        return MascotaRepository.findAll();
    }

    @PostMapping(value = "Puntos totales")
    public String savePuntos(@RequestBody Mascota mascota) {
        MascotaRepository.save(mascota);
        return "saved task";
    }
}
