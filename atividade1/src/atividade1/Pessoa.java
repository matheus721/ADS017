
package atividade1;


public abstract class Pessoa {
    public static final int SEXO_MASCULINO = 1;
    public static final int SEXO_FEMININO = 2;
    
    String nome;
    int sexo;
    
    public Pessoa (String nome, int sexo){
        this.nome = nome;
        this.sexo = sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
 
        
        
       
                   
        }
    }

