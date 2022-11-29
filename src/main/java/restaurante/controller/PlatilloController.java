/*
* Hecho por: Fernando Lopez Salvador, Estrella Lopez Lopez, Mario Hecxai Valencia Reyes
* Fecha de creación: 22/11/22
* Descripción: Controlador para platillo
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
import restaurante.entity.Platillos;
import restaurante.service.IPlatilloService;
import restaurante.service.PlatillosServiceImpl;

@RequestScoped
@ManagedBean(name = "platillo")
public class PlatilloController implements Serializable {

    private IPlatilloService service;
    private Platillos platillo;
    private List<Platillos> listaRegistros;

    @PostConstruct
    public void init() {
        service = new PlatillosServiceImpl();
        platillo = new Platillos();
        listaRegistros = service.obtenerRegistros();
    }

    public void CrearRegistro() {
        service.insertarRegistro(platillo);
        listaRegistros = service.obtenerRegistros();
    }

    public Platillos getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillos platillo) {
        this.platillo = platillo;
    }

    public List<Platillos> getListaRegistros() {
        return listaRegistros;
    }

    public void onRowEdit(RowEditEvent event) {
        Platillos platillo = (Platillos) event.getObject();
        service.actualizarRegistro(platillo);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje = 
                new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }

    public void EliminarRegistro(Platillos platillo) {
        service.eliminarRegistro(platillo);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje =
                new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }
}
