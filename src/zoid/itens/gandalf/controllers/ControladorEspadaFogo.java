
package zoid.itens.gandalf.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import zoid.itens.gandalf.models.ModelEspadaFogo;
import zoid.itens.gandalf.views.JFrameiItemsMagicos;


public class ControladorEspadaFogo {
    private JFrameiItemsMagicos viewItems;
    private ControllerBancoEspada bancoGANDALF;
        
    public void executar(){
        viewItems = new JFrameiItemsMagicos();
        viewItems.addInsereListener(new InsereListener());
        viewItems.addLeBancoListener(new LeBancoListener());
        viewItems.addInsereBancoListener(new InsereBancoListener());
        viewItems.setVisible(true);

        bancoGANDALF = new ControllerBancoEspada();
    };

    public class InsereListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           ModelEspadaFogo a = viewItems.obterDadosEspada();
           viewItems.insereEspadaLista(a);
        }        
    }
    
    public class LeBancoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            viewItems.listaClean();
            ArrayList<ModelEspadaFogo> lista = bancoGANDALF.lerBanco();
            Iterator<ModelEspadaFogo> it = lista.iterator();
            while(it.hasNext()){
                ModelEspadaFogo a = it.next();
                viewItems.insereEspadaLista(a);
            } 
        }        
    }
   
    public class InsereBancoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           ModelEspadaFogo as = viewItems.obterDadosEspada();       
           bancoGANDALF.inserirBanco(as);         
        }        
    }
}
