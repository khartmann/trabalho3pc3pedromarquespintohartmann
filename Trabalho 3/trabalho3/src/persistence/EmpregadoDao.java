package persistence;

import model.Empregado;

public class EmpregadoDao {
    public void incluir(Empregado empregado);
    public void alterar(Empregado empregado);
    public void excluir(Empregado empregado);
    public List<Empregado> listarTodos();
    public Empregado buscarPelaPlaca(String cpf);
}
