package Controller;

import Models.PuntosGanados;
import Repository.PuntosGanadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PuntosGanadosController {

    private final PuntosGanadosRepository puntosGanadosRepository;

    @Autowired
    public PuntosGanadosController(PuntosGanadosRepository puntosGanadosRepository) {
        this.puntosGanadosRepository = puntosGanadosRepository;
    }

    @GetMapping(value = "/")
    public String PuntosGanados() {
        return "Puntos ganados:";
    }

    @GetMapping(value = "/Puntos Ganados")
    public List<PuntosGanados> puntos() {
        return puntosGanadosRepository.findAll();
    }

    @PostMapping(value = "Puntos totales")
    public String savePuntos(@RequestBody PuntosGanados puntos) {
        puntosGanadosRepository.save(puntos);
        return "saved task";
    }
}

