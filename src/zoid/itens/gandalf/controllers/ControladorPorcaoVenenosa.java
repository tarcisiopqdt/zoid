
package zoid.itens.gandalf.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;
import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;
import zoid.itens.gandalf.views.ItensMagicosJFrame;

public class ControladorPorcaoVenenosa {
    private ItensMagicosJFrame viewItems;
    private ControllerBancoPorcaoVenenosa bancoGANDALF;
        
    public void executar(){
        viewItems = new ItensMagicosJFrame();
        viewItems.addInsereListener(new InsereListener());
        viewItems.addLeBancoListener(new LeBancoListener());
        viewItems.addInsereBancoListener(new InsereBancoListener());
        viewItems.setVisible(true);
        
        bancoGANDALF = new ControllerBancoPorcaoVenenosa();
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
            viewItems.listaClean();
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
