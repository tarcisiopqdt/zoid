/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.encontro.faramir;

import zoid.avatar.Avatar;
import zoid.encontro.Encontro;

/**
 *
 * @author andre
 */
public class Combate extends Encontro{

    public Combate(Avatar primeiro, Avatar segundo) {
        super(primeiro, segundo);
    }

    
    
    @Override
    public boolean interagir() {
       return combater();
    }

    public boolean combater(){
        return true;
                
    }
            
    
}

