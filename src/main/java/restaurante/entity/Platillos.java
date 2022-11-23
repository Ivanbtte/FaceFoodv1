/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.entity;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 *
 * @author labso02
 */
@Entity
@Table(name = "platillos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p"),
    @NamedQuery(name = "Platillos.findByCodigo", query = "SELECT p FROM Platillos p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Platillos.findByNombre", query = "SELECT p FROM Platillos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Platillos.findByPrecio", query = "SELECT p FROM Platillos p WHERE p.precio = :precio"),
    @NamedQuery(name = "Platillos.findByDescripcion", query = "SELECT p FROM Platillos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Platillos.findByCategoria", query = "SELECT p FROM Platillos p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Platillos.findByCalificacion", query = "SELECT p FROM Platillos p WHERE p.calificacion = :calificacion"),
    @NamedQuery(name = "Platillos.findByDisponiblidad", query = "SELECT p FROM Platillos p WHERE p.disponiblidad = :disponiblidad")})
public class Platillos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Size(max = 250)
    @Column(name = "descripcion ")
    private String descripcion;
    @Size(max = 25)
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "calificacion")
    private BigInteger calificacion;
    @Column(name = "disponiblidad")
    private Boolean disponiblidad;

    public Platillos() {
    }

    public Platillos(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigInteger getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigInteger calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getDisponiblidad() {
        return disponiblidad;
    }

    public void setDisponiblidad(Boolean disponiblidad) {
        this.disponiblidad = disponiblidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restaurante.entity.Platillos[ codigo=" + codigo + " ]";
    }
    
}
