/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restaurante.model;

import java.util.List;
import restaurante.entity.Usuario;

/**
 *
 * @author labso09
 */
public interface IUsuarioModel {
    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
}
