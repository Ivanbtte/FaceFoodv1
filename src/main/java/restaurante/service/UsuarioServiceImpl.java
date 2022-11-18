/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;
import restaurante.model.IUsuarioModel;
import restaurante.model.IUsuarioModelImpl;

/**
 *
 * @author labso17
 */
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
