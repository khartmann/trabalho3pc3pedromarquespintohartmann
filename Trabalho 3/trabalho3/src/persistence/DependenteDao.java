package persistence;

import model.Dependente;
import model.Empregado;

public class DependenteDao {
    public void incluir(Dependente dependente);
    public void alterar(Dependente dependente);
    public void excluir(Dependente dependente);
    public List<Dependente> listarTodos();
    public Dependente buscarPeloCodigo(int codigo);
    public List<Dependente> buscarPeloVeiculo(Empregado Empregado);
}
