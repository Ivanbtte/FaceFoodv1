/*
* Hecho por: Iván Guadalupe Bustamante Cortés
* Fecha de creación: 22/11/22
* Descripción: Clase de implementación de metodos de platillos
*/
package restaurante.model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import restaurante.entity.Platillos;

public class PlatilloModelImpl implements IPlatilloModel {

    private SessionFactory sf;
    private Session session;

    /*
    * Metodo para insertar un platillo a la BD
    */
    @Override
    public void insertarRegistro(Platillos platillos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.save(platillos);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {

        }
    }

    /*
    * Metodo para consultar platillos de la BD
    */
    @Override
    public List<Platillos> obtenerRegistros() {
        List<Platillos> listaPlatillos = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            listaPlatillos = session.createCriteria(Platillos.class).
                    list();
            session.close();
            sf.close();
        } catch (HibernateException e) {

        }
        return listaPlatillos;
    }

    /*
    * Metodo para actualizar un platillo a la BD
    */
    @Override
    public void actualizarRegistro(Platillos platillos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.update(platillos);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {

        }
    }

    /*
    * Metodo para eliminar un platillo a la BD
    */
    @Override
    public void eliminarRegistro(Platillos platillos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.delete(platillos);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {

        }
    }

}
