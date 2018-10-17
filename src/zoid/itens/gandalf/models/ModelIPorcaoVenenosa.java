package zoid.itens.gandalf.models;

import java.io.BufferedReader;
import java.io.FileWriter;
import zoid.itens.gandalf.ItemMagico;


public class ModelIPorcaoVenenosa extends ItemMagico{
        String venenoPorcao;
        int    qtdVeneno;
        
    public ModelIPorcaoVenenosa(String nomeItem,int precoMoedas, String veneno, int qtdVeneno) {
        super(nomeItem, precoMoedas);
        this.venenoPorcao = veneno;
        this.qtdVeneno = qtdVeneno;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public int getPrecoMoedas() {
        return precoMoedas;
    }
    public String getVenenoPorcao() {
        return venenoPorcao;
    }
    public int getQtdVeneno() {
        return qtdVeneno;
    }
    @Override
    public String toString() {
        return "Porção Venenosa: "+ venenoPorcao + " - Quantidade: " + qtdVeneno + "Ml.";
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
