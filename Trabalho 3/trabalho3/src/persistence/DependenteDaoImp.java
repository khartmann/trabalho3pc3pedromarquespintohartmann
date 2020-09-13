package persistence;

import model.Empregado;

public class DependenteDaoImp implements DependenteDao{
    public void incluir(Dependente dependente) {
    }
    public void alterar(Dependente dependente) {
    }
    public void excluir(Dependente dependente) {
    }
    public List<Dependente> listarTodos() {
        return null;
    }
    public Dependente buscarPeloCpfEmpregado(int cpfEmpregado) {
        return null;
    }
    public List<Dependente> buscarPeloEmpregado(Empregado empregado) {
        return null;
    }
    private Session session;

    public void alterar(Empregado empregado) {
        session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(empregado);
            session.getTransaction().commit();
        } catch (Exception e) {
            if(session != null){
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }
    public Empregado buscarPeloCpf(String placa) {
        session = null;
        Empregado empregado = new Empregado();
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            Empregado = (Empregado)session.load(Empregado.class, cpf);
            session.getTransaction().commit();
        } catch (Exception e) {
            if(session != null){
                session.getTransaction().rollback();
            }
            return null;
        } finally {
            if(session != null){
                session.close();
            }
        }
        return Empregado;
    }
        }
}
