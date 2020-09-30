/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import templatemodelo.Produto;

/**
 *
 * @author roger
 */
public class RelatorioAnalitico extends TemplateGeradorDeRelatorios {

    @Override
    protected String gerarCabeçalho() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy H:m:s G");
        return new String("RELATÓRIO ANALÍTICO DE PRODUTOS VENDIDOS\n"
                + dataFormatada.format(new Date())
                + "\nRTR Soluções Tecnológicas\n");
    }

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        StringBuilder conteudo = new StringBuilder();
        double totalProdutos = 0;
        conteudo.append("\nProdutos vendidos");

        for (Produto produto : produtos) {
            totalProdutos += produto.getPreco();
            conteudo.append(produto.getDescricao() + "R$ " + produto.getPreco() + "\n");
        }
        conteudo.append("Total de produtos em reais vendidos R$ " + totalProdutos);
        return conteudo.toString();
    }

    @Override
    protected void gerarVisual(String cabecalho, String conteudo) {
        JOptionPane.showMessageDialog(null, cabecalho + conteudo, "Relatório análítico", JOptionPane.INFORMATION_MESSAGE);
    }

}
