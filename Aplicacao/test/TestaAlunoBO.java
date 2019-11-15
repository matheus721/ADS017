

import dados.Aluno;
import negocio.AlunoBO;
import negocio.NegocioException;


public class TestaAlunoBO {
    public static void main(String[] args) {
        AlunoBO bo = new AlunoBO();        
        Aluno aluno = new Aluno();
        aluno.setMatricula(20199200);
        aluno.setNome("JOAO");
        try{
            bo.incluir(aluno);
            aluno.setID(1);
            bo.consultar(aluno);
            aluno.setID(200);
            bo.excluir(aluno);
        }catch(NegocioException ex){
            System.err.println(ex.getMessage());
        }
    }
}
