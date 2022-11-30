/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 22/11/22
* Descripción: Interfaz de platillos
*/
package restaurante.model;

import java.util.List;
import restaurante.entity.Platillos;

public interface IPlatilloModel {
    /*
    * Metodo para insertar un platillo a la BD
    */
    public void insertarRegistro(Platillos platillos);
    /*
    * Metodo para consultar platillos de la BD
    */
    public List<Platillos> obtenerRegistros();
    /*
    * Metodo para actualizar un platillo a la BD
    */
    public void actualizarRegistro (Platillos platillos);
    /*
    * Metodo para eliminar un platillo a la BD
    */
    public void eliminarRegistro (Platillos platillos);
}
