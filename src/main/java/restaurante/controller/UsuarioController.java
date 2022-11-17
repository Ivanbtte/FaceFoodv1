/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

/**
 *
 * @author labso13
 */
@RequestScoped
@ManagedBean(name = "usuario")
public class UsuarioController implements Serializable{
    private IUsuarioService service;
    private Usuario usuario;
    private List<Usuario> listaRegistros;
    
    @PostConstruct
    public void init(){
        service = new UsuarioServiceImpl();
        usuario = new Usuario();
        listaRegistros = service.obtenerRegistros();
    }
    public void CrearRegistro(){
       service.insertarRegistro(usuario);
        System.out.println("Creado");
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
    
    public void onRowEdit(RowEditEvent event){
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
}

