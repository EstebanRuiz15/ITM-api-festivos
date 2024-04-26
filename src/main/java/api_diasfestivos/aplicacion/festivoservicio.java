package api_diasfestivos.aplicacion;

import java.util.List;
import java.util.Optional;

import core.Dominio.festivo;
import core.interfaces.repositorio.Ifestivorepository;
import core.interfaces.servicios.IfestivoServicio;

public class festivoservicio implements IfestivoServicio {

    private Ifestivorepository repositorio;

    public festivoservicio(Ifestivorepository repositorio) {
        this.repositorio = repositorio;

    }

    @Override
    public festivo buscar(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<festivo> listar() {

        return repositorio.findAll();
    }

    @Override
    public festivo obtener(int id) {
        Optional<festivo> festivo = repositorio.findById(id);

        return festivo.isEmpty() ? null : festivo.get();
    }

}
