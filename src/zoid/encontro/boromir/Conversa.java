/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.encontro.boromir;

import zoid.avatar.Avatar;
import zoid.encontro.Encontro;

/**
 *
 * @author andre
 */
public class Conversa extends Encontro{

    public Conversa(Avatar primeiro, Avatar segundo) {
        super(primeiro, segundo);
    }

    
    
    
    @Override
    public boolean interagir() {
        return conversar();
    }
    
    public boolean conversar(){
        return true;
    }
    
}
