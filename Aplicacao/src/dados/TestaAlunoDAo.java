
package dados;


public class TestaAlunoDAo {
    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();
        
    try{    
        for(Aluno aluno : dao.listar()){
            System.out.println(aluno);
        }
    Aluno aluno = new Aluno();
    aluno.setMatricula(20199300);
    aluno.setNome("PAULO");
    
    dao.incluir(aluno);
    
    aluno.setNome("ANGELICA");
    dao.alterar(aluno);
    
    dao.excluir(2);
    
      }catch(DadosException ex) {
          System.err.println(ex.getMessage() + ex.getCause().getMessage());
        }    
    }
}
