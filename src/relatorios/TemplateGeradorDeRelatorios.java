package relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import templatemodelo.Produto;

/**
 *
 * @author roger
 */
// Aqui temos uma classe abstrata
public abstract class TemplateGeradorDeRelatorios {

    // Deve ter um método final, pois esse método não pode ser subscrito pelas
    // subclasses
    // Importante notar que temos dentro dele três métodos, um concreto e dois
    // abstratos que deverão ser implementados pelas subclasses
    public final void gerarRelatorios(List<Produto> produtos) {
        String cabecalho = this.gerarCabeçalho();
        String conteudo = this.gerarConteudo(produtos);
        this.gerarVisual(cabecalho, conteudo);
    }

    // método concreto implementado aqui mesmo
    protected String gerarCabeçalho() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("d/M/y");
        return new String("RELATÓRIO DE PRODUTOS VENDIDOS\n"
                + dataFormatada.format(new Date())
                + "\nRTR Soluções Tecnológicas\n");
    }

    // metodo abstrato que compõe o metodo final da classe template
    protected abstract String gerarConteudo(List<Produto> produtos);

    // método abstrato que tbm compõe o método final desta classe
    protected abstract void gerarVisual(String cabecalho, String conteudo);
}
