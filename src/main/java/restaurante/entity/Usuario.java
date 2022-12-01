/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 19/11/22
* Fecha de modificación: 19/11/22
* Descripción: Entidad de usuario
*/
package restaurante.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name
            = "Usuario.findAll", query
            = "SELECT u FROM Usuario u"),
    @NamedQuery(name
            = "Usuario.findById", query
            = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name
            = "Usuario.findByNombre", query
            = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name
            = "Usuario.findByContrase\u00f1a", query
            = "SELECT u FROM Usuario u "
            + "WHERE u.contrase\u00f1a = :contrase\u00f1a")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 12)
    @Column(name = "contrase\u00f1a")
    private String contraseña;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || 
                (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restaurante.entity.Usuario[ id=" + id + " ]";
    }

}
