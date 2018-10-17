
package zoid.itens.gandalf.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;
import zoid.itens.gandalf.views.JFrameiItemsMagicos;
import zoid.itens.gandalf.views.JFrameiItemsMagicos;
import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;

public class ControladorPorcaoVenenosa {
    private JFrameiItemsMagicos viewItems;
    private ControlllerBancoPorcaoVenenosa bancoGANDALF;
        
    public void executar(){
        viewItems = new JFrameiItemsMagicos();
        viewItems.addInsereListener(new InsereListener());
        viewItems.addLeBancoListener(new LeBancoListener());
        viewItems.addInsereBancoListener(new InsereBancoListener());
        viewItems.setVisible(true);
        
        bancoGANDALF = new ControlllerBancoPorcaoVenenosa();
    };

    public class InsereListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           ModelIPorcaoVenenosa a = viewItems.obterDadosPorcao();
           viewItems.inserePorcaoLista(a);
        }        
    }
    
    public class LeBancoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            viewItems.limpaLista();
            ArrayList<ModelIPorcaoVenenosa> lista = bancoGANDALF.lerBanco();
            Iterator<ModelIPorcaoVenenosa> it = lista.iterator();
            while(it.hasNext()){
                ModelIPorcaoVenenosa a = it.next();
                viewItems.inserePorcaoLista(a);
            } 
        }        
    }

    public class InsereBancoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           ModelIPorcaoVenenosa a = viewItems.obterDadosPorcao();       
           bancoGANDALF.inserirBanco(a);         
        }        
    }
}
