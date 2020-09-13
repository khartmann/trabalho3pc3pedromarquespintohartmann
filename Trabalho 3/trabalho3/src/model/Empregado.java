package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="empregado")
public class Empregado implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="cpf")
    private String cpf;
    @Column(name="nome")
    private String nome;
    @Column(name="idade")
    private Integer idade;
    @Column(name="salario")
    private Double salario;
    @OneToMany (mappedBy="empregado", targetEntity=Dependente.class,
            cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Dependente> dependente;

    public List<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
