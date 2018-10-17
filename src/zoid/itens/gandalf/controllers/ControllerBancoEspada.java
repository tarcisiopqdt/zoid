package zoid.itens.gandalf.controllers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import zoid.itens.gandalf.models.ModelEspadaFogo;

public class ControllerBancoEspada {

    private String URL_DB = "jdbc:derby://localhost:1527/GANDALF";
    private String CONSULTA_ESPADA = "SELECT * FROM ESPADA_FOGO";
    private String INSERE_ESPADA = "INSERT INTO ESPADA_FOGO(NOME_ITEM,PRECO_MOEDAS, TAMANHO, PODER_DESTRUICAO, DURACAO_FOGO) ";
    private Connection conexaoDB;


    public ControllerBancoEspada() {
        try {
            conexaoDB = DriverManager.getConnection(URL_DB, "TARCISIOPQDT", "PQDT");
        } catch (Exception e) {
            System.out.println("Erro na conexão com o bd: " + e);
        }
    }

    public ArrayList<ModelEspadaFogo> lerBanco() {
   
        ArrayList<ModelEspadaFogo> lista = new ArrayList<ModelEspadaFogo>();
        try {
            Statement comando = conexaoDB.createStatement();
            ResultSet resultado = comando.executeQuery(CONSULTA_ESPADA);
            while (resultado.next()) {
                String nomeitem = resultado.getString("NOME_ITEM");
                int preco = resultado.getInt("PRECO_MOEDAS");
                int tamanho = resultado.getInt("TAMANHO");
                String poder = resultado.getString("PODER_DESTRUICAO");
                int duracao = resultado.getInt("DURACAO_FOGO");
               
                ModelEspadaFogo a = new ModelEspadaFogo(nomeitem, preco, tamanho, poder, duracao);
               
                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return (lista);
    }

    public void inserirBanco(ModelEspadaFogo a) {
        try {
            Statement comando = conexaoDB.createStatement();
            String INSERE = "INSERT INTO ESPADA_FOGO(NOME_ITEM,PRECO_MOEDAS, TAMANHO, PODER_DESTRUICAO, DURACAO_FOGO) VALUES(" 
                    + "'" + a.getNomeItem()+ "',"
                    +  a.getPrecoMoedas()+ ","
                    +  a.getTamanhoEspada()+ ","
                    + "'" + a.getPoderEspada()+ "',"
                    +  a.getDuracaoFogoEspada()+ ")";
            System.out.println(INSERE);
            comando.executeUpdate(INSERE);
        } catch (Exception e) {
            System.out.println("Erro ao inserir" + e);
        }
    }

}
