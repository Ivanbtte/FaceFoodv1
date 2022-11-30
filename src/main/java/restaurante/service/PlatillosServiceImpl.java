/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 22/11/22
* Descripción: Capa de servicios de platillos
*/
package restaurante.service;

import java.util.List;
import restaurante.entity.Platillos;
import restaurante.model.IPlatilloModel;
import restaurante.model.PlatilloModelImpl;

public class PlatillosServiceImpl implements IPlatilloService {
    
    private IPlatilloModel model = new PlatilloModelImpl();
    
    /*
    * Metodo para insertar un platillo a la BD
    */
    @Override
    public void insertarRegistro(Platillos platillos) {
        model.insertarRegistro(platillos);
    }
    
    /*
    * Metodo para consultar platillos de la BD
    */
    @Override
    public List<Platillos> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    /*
    * Metodo para actualizar un platillo a la BD
    */
    @Override
    public void actualizarRegistro(Platillos platillos) {
        model.actualizarRegistro(platillos);
    }
    
    /*
    * Metodo para eliminar un platillo a la BD
    */
    @Override
    public void eliminarRegistro(Platillos platillos) {
        model.eliminarRegistro(platillos);
    }
    
}
