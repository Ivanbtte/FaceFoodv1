/*
* Hecho por: Fernando Lopez Salvador, Estrella Lopez Lopez, Mario Hecxai Valencia Reyes
* Fecha de creación: 19/11/22
* Descripción: Controlador para usuario
*/
package restaurante.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import restaurante.entity.Usuario;
import restaurante.service.IUsuarioService;
import restaurante.service.UsuarioServiceImpl;

@RequestScoped
@ManagedBean(name = "usuario")
public class UsuarioController implements Serializable {

    private IUsuarioService service;
    private Usuario usuario;
    private List<Usuario> listaRegistros;

    @PostConstruct
    public void init() {
        service = new UsuarioServiceImpl();
        usuario = new Usuario();
        listaRegistros = service.obtenerRegistros();
    }

    public void CrearRegistro() {
        service.insertarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaRegistros() {
        return listaRegistros;
    }

    public void onRowEdit(RowEditEvent event) {
        Usuario usuario = (Usuario) event.getObject();
        service.actualizarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }

    public void EliminarRegistro(Usuario usuario) {
        service.eliminarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);

    }
}
