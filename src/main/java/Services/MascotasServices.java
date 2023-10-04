package Services;

public interface MascotasServices {

        List<configNivel> listaDeNiveles();

        configNivel buscarNivelPorId(Byte id);

        configNivel guardarNivel(configNivel nivelNuevo);

        void borrarNivel(Byte id);

        configNivel editarNivelPorId(Byte id, configNivel nivelActualizado);
    }

}
