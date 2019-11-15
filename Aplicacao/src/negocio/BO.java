
package negocio;

import java.util.List;


public interface BO<T> {
     
    void validar (T entidade) throws NegocioException;
    void incluir (T entidade) throws NegocioException;
    void alterar (T entidade) throws NegocioException;
    void excluior (T entidade) throws NegocioException;
    T consultar (T entidade) throws NegocioException;
    List<T> listar () throws NegocioException;
    
}
