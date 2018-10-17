/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens.gandalf.controllers;

import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ControllerBancoPorcaoVenenosa {

    // link de conexao com o banco
    private String URL_DB = "jdbc:derby://localhost:1527/GANDALF";
    // Comando SQL para ler o banco
    private String CONSULTA_PORCAO_VENENO = "SELECT NOME_ITEM,PRECOMOEDAS, TIPO_VENENO, QUANTIDADE_ML FROM PORCAO_VENENO";

    // Comando SQL para Inserir no Banco
    private String INSERE_PORCAO_VENENO = "INSERT INTO PORCAO_VENENO(NOME_ITEM,PRECOMOEDAS, TIPO_VENENO, QUANTIDADE_ML) ";
    /// Objeto de Conexao com o banco
    private Connection conexaoDB;

    // Construtor que faz a conexao com o banco 
    public ControllerBancoPorcaoVenenosa() {
        try {
            conexaoDB = DriverManager.getConnection(URL_DB, "TARCISIOPQDT", "PQDT");
        } catch (Exception e) {
            System.out.println("Erro na conexão com o bd: " + e);
        }
    }

    // Ler regisros do Banco e retornar em objetos da lista
    public ArrayList<ModelIPorcaoVenenosa> lerBanco() {
        // Lista que vai retornar
        ArrayList<ModelIPorcaoVenenosa> lista = new ArrayList<ModelIPorcaoVenenosa>();
        try {
            // 1 - Obter COMANDO Objeto JAVA para executar o SQL
            Statement comando = conexaoDB.createStatement();
            // 2 - Executa o COMANDO de (1) SQL
            ResultSet resultado = comando.executeQuery(CONSULTA_PORCAO_VENENO);
            // 3 - Percorre todos os resultados
            while (resultado.next()) {
                // Cria um objeto aluno para cada registro retornado
                    String nomeitem = resultado.getString("NOME_ITEM");
                int preco = resultado.getInt("PRECOMOEDAS");
                String tipoVeneno = resultado.getString("TIPO_VENENO");
                int qtd = resultado.getInt("QUANTIDADE_ML");
               
                ModelIPorcaoVenenosa a = new ModelIPorcaoVenenosa(nomeitem, preco, tipoVeneno, qtd);
               
              
                // Cria uma instancia da classe aluno
                
                //-----------------------------------------
                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return (lista);
    }

    /// Inserir Registro no Banco de Dados
    public void inserirBanco(ModelIPorcaoVenenosa a) {
        try {
            // 1 - Obter COMANDO Objeto JAVA para executar o SQL
            Statement comando = conexaoDB.createStatement();
            String INSERE = "INSERT INTO PORCAO_VENENO(NOME_ITEM,PRECOMOEDAS, TIPO_VENENO, QUANTIDADE_ML) VALUES(" 
                    + "'" + a.getNomeItem()+ "',"
                    +  a.getPrecoMoedas()+ ","
                    + "'" + a.getVenenoPorcao() + "',"
                    + a.getQtdVeneno() + ")";
            System.out.println(INSERE);
            comando.executeUpdate(INSERE);
        } catch (Exception e) {
            System.out.println("Erro ao inserir" + e);
        }
    }

}
