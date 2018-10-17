package zoid.itens.gandalf.models;

import java.io.BufferedReader;
import java.io.FileWriter;
import zoid.itens.gandalf.ItemMagico;


public class ModelEspadaFogo extends ItemMagico{
        int tamanhoEspada;
        String poderEspada;
        int    duracaoFogoEspada;
        
    public ModelEspadaFogo(String nomeItem,int precoMoedas, int tamanho,String poder, int duracao) {
        super(nomeItem, precoMoedas);
        this.tamanhoEspada = tamanho;
        this.poderEspada = poder;
        this.duracaoFogoEspada = duracao;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public int getPrecoMoedas() {
        return precoMoedas;
    }

    public int getTamanhoEspada() {
        return tamanhoEspada;
    }

    public String getPoderEspada() {
        return poderEspada;
    }

    public int getDuracaoFogoEspada() {
        return duracaoFogoEspada;
    }

    @Override
    public String toString() {
        return "ESPADA DE FOGO: "+ tamanhoEspada + "cm - Poder de Destruição: " + poderEspada + ". Duração da Chama: " + duracaoFogoEspada +" segundos";
    }    

    @Override
    public void salvaItem(FileWriter fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregaItem(BufferedReader br) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
