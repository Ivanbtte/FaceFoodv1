package restaurante.service;

import java.util.List;
import restaurante.entity.Usuario;


public interface IUsuarioService {
    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
}
