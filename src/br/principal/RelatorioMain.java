package br.principal;

import java.util.ArrayList;
import java.util.List;
import relatorios.RelatorioAnalitico;
import relatorios.TemplateGeradorDeRelatorios;
import relatorios.RelatorioSimples;
import templatemodelo.Produto;

/**
 *
 * @author roger
 */
public class RelatorioMain {
    
    public static void main(String[] args) {
        
    List<Produto> produtos = new ArrayList<>();
    produtos.add(new Produto("Thrump ", 70000));
    produtos.add(new Produto("Harlley ", 50000));
    produtos.add(new Produto("Honda ", 45000));
    produtos.add(new Produto("Yamaha ", 25000));
    produtos.add(new Produto("BMW ", 67000));
    
        TemplateGeradorDeRelatorios relatorioConsole = new RelatorioSimples();
        relatorioConsole.gerarRelatorios(produtos);
        
        TemplateGeradorDeRelatorios relatorioAnalitico = new RelatorioAnalitico();
        relatorioAnalitico.gerarRelatorios(produtos);
    }
}
