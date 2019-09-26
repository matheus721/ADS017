
package atividade1;


public class Funcionario extends Pessoa {

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", salario=" + salario + '}';
    }
    public Funcionario(){
    super(nome, sexo);
    }
    
    
    
    private int matricula;
    
    private double salario;

    public Funcionario(int matricula, String nome, int sexo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    

    public double getSalario() {
        return salario;
    }
     public double getMatricula() {
        return matricula;
    
    }
     
}
