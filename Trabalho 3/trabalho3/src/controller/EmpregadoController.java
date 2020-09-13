package controller;

public class EmpregadoController {
    public void alterar(Empregado empregado){
        EmpregadoDaoImp vd = new EmpregadoDaoImp();
        vd.alterar(empregado);
    }
    public List<Empregado> listarTodos(){
        EmpregadoDaoImp vd = new EmpregadoDaoImp();
        return vd.listarTodos();

        public Empregado buscarPeloCpf(String cpf){
            EmpregadoDaoImp vd = new EmpregadoDaoImp();
            return vd.buscarPelaPlaca(cpf);
        }
    }
}
