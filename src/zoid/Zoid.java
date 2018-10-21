/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid;

import zoid.elros.GerenteZoid;
import zoid.elros.GerenteZoidV1;
import zoid.itens.gandalf.controllers.ControladorEspadaFogo;
import zoid.itens.gandalf.controllers.ControladorPorcaoVenenosa;
import zoid.itens.gandalf.views.ItensMagicosJFrame;


/**
 *
 * @author andre
 */
public class Zoid {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenteZoid gz = new GerenteZoidV1();
        gz.iniciarZoid();      
        ControladorPorcaoVenenosa  cc = new ControladorPorcaoVenenosa();
        cc.executar();
        ControladorEspadaFogo ef = new ControladorEspadaFogo();
        ef.executar();
   
    }
    
}
