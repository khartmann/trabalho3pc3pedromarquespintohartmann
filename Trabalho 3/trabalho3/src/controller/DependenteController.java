package controller;

public class DependenteController {
    public void incluir(Empregado empregado){
        EmpregadoDaoImp vd = new EmpregadoDaoImp();
        vd.incluir(empregado);
    }
}
