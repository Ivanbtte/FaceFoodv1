
package restaurante.model;

import java.util.List;
import restaurante.entity.Usuario;

public interface IUsuarioModel {
    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void actualizarRegistro (Usuario usuario);
    public void eliminarRegistro (Usuario usuario);
}
