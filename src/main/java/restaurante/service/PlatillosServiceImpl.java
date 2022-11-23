package restaurante.service;

import java.util.List;
import restaurante.entity.Platillos;
import restaurante.model.IPlatilloModel;
import restaurante.model.PlatilloModelImpl;

public class PlatillosServiceImpl implements IPlatilloService {
    
    private IPlatilloModel model = new PlatilloModelImpl();
    
    @Override
    public void insertarRegistro(Platillos platillos) {
        model.insertarRegistro(platillos);
    }
    
    @Override
    public List<Platillos> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    @Override
    public void actualizarRegistro(Platillos platillos) {
        model.actualizarRegistro(platillos);
    }
    
    @Override
    public void eliminarRegistro(Platillos platillos) {
        model.eliminarRegistro(platillos);
    }
    
}
