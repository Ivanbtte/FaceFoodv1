/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 18/11/22
* Descripción: Interfaz de servicios de usuario
*/
package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;


public interface IUsuarioService {
    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void actualizarRegistro (Usuario usuario);
    public void eliminarRegistro (Usuario usuario);
}
