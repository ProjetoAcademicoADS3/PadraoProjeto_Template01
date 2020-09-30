package relatorios;

import java.util.List;
import templatemodelo.Produto;

/**
 *
 * @author roger
 */
public class RelatorioSimples extends TemplateGeradorDeRelatorios {

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        double totalProduto = 0;
        StringBuilder conteudo = new StringBuilder();

        for (Produto produto : produtos) {
            totalProduto += produto.getPreco();
        }

        conteudo.append("Quantidade Vendida: " + produtos.size());
        conteudo.append("\nTotal vendido: " + totalProduto);
        return conteudo.toString();
    }

    @Override
    protected void gerarVisual(String cabecalho, String conteudo) {
        System.out.println(cabecalho);
        System.out.println(conteudo);
    }
}
