/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 18/11/22
* Descripción: Capa de servicios de usuario
*/

package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;
import restaurante.model.IUsuarioModel;
import restaurante.model.IUsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService {

    private IUsuarioModel model = new IUsuarioModelImpl();
    
    @Override
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }
    
    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    @Override
    public void actualizarRegistro(Usuario usuario) {
        model.actualizarRegistro(usuario);
    }
    
    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }
    
}
