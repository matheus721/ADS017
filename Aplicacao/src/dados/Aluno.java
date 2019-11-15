
package dados;

public class Aluno {
    private int id;
    private int matricula;
    private String nome;
    
    

    public Aluno(int id, int matricula, String nome) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", matricula=" + matricula + ", nome=" + nome + '}';
    }
    
    
}
