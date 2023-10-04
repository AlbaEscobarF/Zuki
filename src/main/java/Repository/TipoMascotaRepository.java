package Repository;

import Models.TipoMascota;

import java.util.List;

public interface TipoMascotaRepository {
    List<TipoMascota> findAll();

    void save(TipoMascota mascota);
}
