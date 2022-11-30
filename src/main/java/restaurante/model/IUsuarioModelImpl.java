/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 19/11/22
* Descripción: Clase de implementación de metodos de usuario
*/
package restaurante.model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import restaurante.entity.Usuario;

public class IUsuarioModelImpl implements IUsuarioModel {

    private SessionFactory sf;
    private Session session;

    /*
    * Metodo para insertar un usuario a la BD
    */
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
            
        }
    }

    /*
    * Metodo para consultar usuarios de la BD
    */
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
            
        }
        return listaUsuario;
    }

    /*
    * Metodo para actualizar un usuario a la BD
    */
    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

    /*
    * Metodo para eliminar un usuario a la BD
    */
    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.delete(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }
}
