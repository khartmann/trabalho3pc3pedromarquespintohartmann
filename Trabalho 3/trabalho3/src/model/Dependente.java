package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="dependente")
public class Dependente implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="cpfEmpregado")
    private String cpfEmpregado;
    @Column(name="nome")
    private String nome;
    @Column(name="grauParentesco")
    private String grauParentesco;
    @Column("name=dataNascimento")
    private Date dataNascimento;
    @ManyToOne @JoinColumn(name="cpf")
    private Empregado empregado;

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public String getCpfEmpregado() {
        return cpfEmpregado;
    }

    public void setCpfEmpregado(String cpfEmpregado) {
        this.cpfEmpregado = cpfEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}