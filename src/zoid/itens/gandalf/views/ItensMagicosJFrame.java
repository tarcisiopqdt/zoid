/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens.gandalf.views;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import zoid.itens.gandalf.models.ModelEspadaFogo;
import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;

/**
 *
 * @author paulo
 */
public class ItensMagicosJFrame extends javax.swing.JFrame {

    private DefaultListModel<ModelIPorcaoVenenosa> listaPorcao;
    private DefaultListModel<ModelEspadaFogo> listaEspada;

    public ItensMagicosJFrame() {
        listaPorcao = new DefaultListModel<ModelIPorcaoVenenosa>();
        listaEspada = new DefaultListModel<ModelEspadaFogo>();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEspadaAddLista = new javax.swing.JButton();
        btnEspadaCria = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        itEspadaTxt = new javax.swing.JTextField();
        precoEspadaTxt = new javax.swing.JTextField();
        tamanhoEspadaTxt = new javax.swing.JTextField();
        poderEspadaTxt = new javax.swing.JTextField();
        duracaoEspadaTxt = new javax.swing.JTextField();
        btnVerEspadas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<zoid.itens.gandalf.models.ModelEspadaFogo>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPocaoCriar = new javax.swing.JButton();
        btnPocaoAddLista = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        itPocaoTxt = new javax.swing.JTextField();
        precoPocaoTxt = new javax.swing.JTextField();
        tipoVenenoTxt = new javax.swing.JTextField();
        qdtPocaoTxt = new javax.swing.JTextField();
        btnVerPocao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPocao = new javax.swing.JList<zoid.itens.gandalf.models.ModelIPorcaoVenenosa>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GANDALF - Itens Mágicos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoid/itens/gandalf/imgs/espada.png"))); // NOI18N

        btnEspadaAddLista.setText("Adicionar na Lista");

        btnEspadaCria.setText("Criar Item");

        jLabel3.setText("Item Mágico:");

        jLabel5.setText("Preço:");

        jLabel6.setText("Tamanho:");

        jLabel7.setText("Poder Destruição:");

        jLabel8.setText("Duração do Fogo:");

        itEspadaTxt.setText("Espada de Fogo");

        precoEspadaTxt.setText("50");

        tamanhoEspadaTxt.setText("60");

        poderEspadaTxt.setText("ALTO");

        duracaoEspadaTxt.setText("20");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(itEspadaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81)
                        .addComponent(precoEspadaTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duracaoEspadaTxt)
                            .addComponent(poderEspadaTxt)
                            .addComponent(tamanhoEspadaTxt))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itEspadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(precoEspadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tamanhoEspadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(poderEspadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(duracaoEspadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVerEspadas.setText("Ver itens");

        jList1.setModel(listaEspada);
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnEspadaCria)
                                .addGap(65, 65, 65)
                                .addComponent(btnEspadaAddLista, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnVerEspadas))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEspadaCria)
                            .addComponent(btnEspadaAddLista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnVerEspadas)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Espada de Fogo", jPanel1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoid/itens/gandalf/imgs/pocao.jpg"))); // NOI18N

        btnPocaoCriar.setText("Cria Item");

        btnPocaoAddLista.setText("Adicionar na Lista");

        jLabel9.setText("Item Mágico:");

        jLabel10.setText("Preço:");

        jLabel11.setText("Tipo de Veneno:");

        jLabel12.setText("Quantidade:");

        itPocaoTxt.setText("Poção Venenosa");

        precoPocaoTxt.setText("10");

        tipoVenenoTxt.setText("Mortal");

        qdtPocaoTxt.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoVenenoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(qdtPocaoTxt)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 64, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precoPocaoTxt)
                    .addComponent(itPocaoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(itPocaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(precoPocaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tipoVenenoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(qdtPocaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnVerPocao.setText("Ver Itens");

        jListPocao.setModel(listaPorcao);
        jScrollPane1.setViewportView(jListPocao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(btnPocaoCriar)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnPocaoAddLista, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(btnVerPocao)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPocaoCriar)
                            .addComponent(btnPocaoAddLista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnVerPocao)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Poção Venenosa", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * *********************PORCAO**********************************
     */
    //ADD EVENTO BTN LISTA DE DESEJOS
    public void addInsereListener(ActionListener l) {
        btnPocaoAddLista.addActionListener(l);
    }

    //ADD EVENTO BTN VER INVENTÁRIO
    public void addLeBancoListener(ActionListener l) {
        btnVerPocao.addActionListener(l);
    }

    //ADD EVENTO BTN COMPRAR ITEM
    public void addInsereBancoListener(ActionListener l) {
        btnPocaoCriar.addActionListener(l);
    }

    // RECEBER DADOS DA PORCAO
    public ModelIPorcaoVenenosa obterDadosPorcao() {
        String nomeitem = itPocaoTxt.getName();
        int preco = Integer.parseInt(precoPocaoTxt.getText());
        String tipoVeneno = tipoVenenoTxt.getText();
        String qdtString = qdtPocaoTxt.getText();
        int qtd = Integer.parseInt(qdtString);
        ModelIPorcaoVenenosa a = new ModelIPorcaoVenenosa(nomeitem, preco, tipoVeneno, qtd);
        return (a);
    }

    //ADD PORCAO VENENOSA NA LISTA
    public void inserePorcaoLista(ModelIPorcaoVenenosa p) {
        listaPorcao.addElement(p);
    }

    //FIM POCAO **********************************
    public void listaClean() {
        listaPorcao.clear();
        listaEspada.clear();
    }

    /**
     * *****************ESPADA******************
     */
    //ADD EVENTO BTN LISTA DE DESEJOS
    public void addInsereListenerEspada(ActionListener l) {
        btnEspadaAddLista.addActionListener(l);
    }

    //ADD EVENTO BTN VER INVENTÁRIO
    public void addLeBancoListenerEspada(ActionListener l) {
        btnVerEspadas.addActionListener(l);
    }

    //ADD EVENTO BTN COMPRAR ITEM
    public void addInsereBancoListenerEspada(ActionListener l) {
        btnEspadaCria.addActionListener(l);
    }

    // RECEBER DADOS ESPADA
    public ModelEspadaFogo obterDadosEspada() {
        String nomeitem = itEspadaTxt.getText();
        int preco = Integer.parseInt(precoEspadaTxt.getText());
        int tamanho = Integer.parseInt(tamanhoEspadaTxt.getText());
        String poder = poderEspadaTxt.getText();
        int duracao = Integer.parseInt(duracaoEspadaTxt.getText());
        ModelEspadaFogo e = new ModelEspadaFogo(nomeitem, preco, tamanho, poder, duracao);
        return (e);
    }
    //ADD ESPADA NA LISTA

    public void insereEspadaLista(ModelEspadaFogo e) {
        listaEspada.addElement(e);
    }
    /**
     * *******************FIM ESPADA***************************
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspadaAddLista;
    private javax.swing.JButton btnEspadaCria;
    private javax.swing.JButton btnPocaoAddLista;
    private javax.swing.JButton btnPocaoCriar;
    private javax.swing.JButton btnVerEspadas;
    private javax.swing.JButton btnVerPocao;
    private javax.swing.JTextField duracaoEspadaTxt;
    private javax.swing.JTextField itEspadaTxt;
    private javax.swing.JTextField itPocaoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<ModelEspadaFogo> jList1;
    private javax.swing.JList<zoid.itens.gandalf.models.ModelIPorcaoVenenosa> jListPocao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField poderEspadaTxt;
    private javax.swing.JTextField precoEspadaTxt;
    private javax.swing.JTextField precoPocaoTxt;
    private javax.swing.JTextField qdtPocaoTxt;
    private javax.swing.JTextField tamanhoEspadaTxt;
    private javax.swing.JTextField tipoVenenoTxt;
    // End of variables declaration//GEN-END:variables
}
