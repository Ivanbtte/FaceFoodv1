/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 18/11/22
* Fecha de modificación: 22/11/22
* Descripción: Capa de servicios de usuario
*/

package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;
import restaurante.model.IUsuarioModel;
import restaurante.model.IUsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService {

    private IUsuarioModel model = new IUsuarioModelImpl();
    
    /*
    * Metodo para insertar un usuario a la BD
    */
    @Override
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }
    
    /*
    * Metodo para consultar usuarios de la BD
    */
    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    /*
    * Metodo para actualizar un usuario a la BD
    */
    @Override
    public void actualizarRegistro(Usuario usuario) {
        model.actualizarRegistro(usuario);
    }
    
    /*
    * Metodo para eliminar un usuario a la BD
    */
    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }
    
}
