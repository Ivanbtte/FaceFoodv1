/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import restaurante.entity.Usuario;

/**
 *
 * @author labso09
 */
public class IUsuarioModelImpl implements IUsuarioModel {

    private SessionFactory sf;
    private Session session;

    @Override
    public void insertarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            listaUsuario = session.createCriteria(Usuario.class).list();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaUsuario;
    }

    /*public static void main(String[] args){
        IUsuarioModel modelo = new UsuarioModelImpl();
        Usuario usuario = new Usuario();
        usuario.setNombre("Ivan");
        usuario.setContraseña("ivan12");
        modelo.insertarRegistro(usuario);
    }*/
}
