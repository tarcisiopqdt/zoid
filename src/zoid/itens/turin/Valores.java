/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens.turin;

import java.io.FileReader;
import java.io.FileWriter;
import zoid.itens.ItemJogo;

/**
 *
 * @author andre
 */
public abstract class Valores extends ItemJogo{

    public Valores(String nomeItem, int precoMoedas) {
        super(nomeItem, precoMoedas);
    }

    @Override
    public boolean usarItem() {
        return false;
    }



   
    
    
    
}
