
/*
Exemplo de implementação do padrão de projeto Template Method
Link > BLSoft https://www.youtube.com/watch?v=8QXBxacTMrs
*/

package templatemodelo;

/**
 *
 * @author roger
 */

//Aqui apenas implementamos a classe produtos que será manipulada
public class Produto {
    
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
}
