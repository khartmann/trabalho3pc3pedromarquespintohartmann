package controller;

public class Teste {
    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory();
//        Hibernate: create table dependente (cpfEmpregado int4
//                not null, nome varchar(255), grauParentesco varchar(255), dataNascimento
//        Date(255), primary key (cpfEmpregado))
//        Hibernate: create table empregado (cpf varchar(255) not null,
//                nome varchar(255), idade int4, salario double, primary key
//                (cpf))
//        Hibernate: alter table dependente add constraint FKey9ppawvcj2pkt80oqcwa1exo
//        foreign key (cpf) references empregado
//        Hibernate: insert into empregado (cpf, nome,idade, salario)
//        values (?, ?, ?, ?)

//        Empregado v = new Empregado();
//        EmpregadoController vc = new EmpregadoController();
//        v.setCpf("12345678910");
//        vc.excluir(v);

//        EmpregadoController vc = new EmpregadoController();
//        List<Empregado> lista = vc.listarTodos();
//        if(lista != null){
//            for(Empregado ve : lista){
//                System.out.println("Placa: "+ve.getPlaca());
//                System.out.println("Cor: "+ve.getCor());
//            }
//        }

        EmpregadoController vc = new EmpregadoController();
        Empregado ve = vc.buscarPeloCpf("12345678910");
        if(ve != null){
            System.out.println("Cpf: "+ve.getCpf());
            System.out.println("Nome: "+ve.getNome());
            System.out.println("Idade: "+ve.getIdade());
        }
    }
}
