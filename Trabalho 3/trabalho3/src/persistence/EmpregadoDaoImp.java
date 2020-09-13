package persistence;

import model.Empregado;
import util.HibernateUtil;

import java.util.List;

public class EmpregadoDaoImp implements EmpregadoDao {
    public void incluir(Empregado empregado) {
    }

    public void alterar(Empregado empregado) {
    }

    public void excluir(Empregado empregado) {
    }

    public List<Empregado> listarTodos() {
        return null;
    }

    public Empregado buscarPeloCpf(String cpf) {
        return null;
    }

    private Session session;

    public void incluir(Empregado empregado) {
        session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(empregado);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    public List<Empregado> listarTodos() {
        session = null;
        List<Empregado> lista = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            lista = session.createQuery("from Empregado").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if(session != null){
                session.getTransaction().rollback();
            }
            return lista;
        } finally {
            if(session != null){
                session.close();
            }
        }
        return lista;
    }
}