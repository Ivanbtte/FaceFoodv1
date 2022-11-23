package restaurante.service;

import java.util.List;
import restaurante.entity.Platillos;

public interface IPlatilloService {

    public void insertarRegistro(Platillos platillos);

    public List<Platillos> obtenerRegistros();

    public void actualizarRegistro(Platillos platillos);

    public void eliminarRegistro(Platillos platillos);
}
