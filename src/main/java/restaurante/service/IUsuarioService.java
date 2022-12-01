/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 18/11/22
* Fecha de modificación: 22/11/22
* Descripción: Interfaz de servicios de usuario
*/
package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;


public interface IUsuarioService {
    /*
    * Metodo para insertar un usuario a la BD
    */
    public void insertarRegistro(Usuario usuario);
    /*
    * Metodo para consultar usuarios de la BD
    */
    public List<Usuario> obtenerRegistros();
    /*
    * Metodo para actualizar un usuario a la BD
    */
    public void actualizarRegistro (Usuario usuario);
    /*
    * Metodo para eliminar un usuario a la BD
    */
    public void eliminarRegistro (Usuario usuario);
}
