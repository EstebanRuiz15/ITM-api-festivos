package core.interfaces.servicios;

import java.util.List;

import core.Dominio.festivo;

public interface IfestivoServicio {

    public List<festivo> listar();

    public festivo obtener(int id);

    public festivo buscar(String nombre);
}
