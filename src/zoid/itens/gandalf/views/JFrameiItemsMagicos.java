package zoid.itens.gandalf.views;

import zoid.itens.gandalf.models.ModelIPorcaoVenenosa;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import zoid.itens.gandalf.models.ModelEspadaFogo;

public class JFrameiItemsMagicos extends javax.swing.JFrame {
   
    private DefaultListModel<ModelIPorcaoVenenosa> listaPorcao;
    private DefaultListModel<ModelEspadaFogo> listaEspada;

    public JFrameiItemsMagicos() {
        // Criar o objeto lista
        listaPorcao = new DefaultListModel<ModelIPorcaoVenenosa>();
        listaEspada = new DefaultListModel<ModelEspadaFogo>();
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTamanhoEspada = new javax.swing.JTextField();
        txtPoderEspada = new javax.swing.JTextField();
        txtDuracaoFogoEspada = new javax.swing.JTextField();
        btnAddEspadaLista = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtItemEspada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPrecoEspada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnEspadaInsereBanco = new javax.swing.JButton();
        btnVerEspada = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEspada = new javax.swing.JList<zoid.itens.gandalf.models.ModelEspadaFogo>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTipoVeneno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQdtPorcao = new javax.swing.JTextField();
        btnAddPorcaoLista = new javax.swing.JButton();
        btnPorcaoInsereBanco = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoPorcao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JTextField();
        btnVerPorcao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsjList1 = new javax.swing.JList<zoid.itens.gandalf.models.ModelIPorcaoVenenosa>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Tamanho:");

        jLabel6.setText("Poder Destruição:");

        jLabel7.setText("Duração do Fogo:");

        btnAddEspadaLista.setText("Adicionar a Lista de Desejos");
        btnAddEspadaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEspadaListaActionPerformed(evt);
            }
        });

        jLabel10.setText("Item Mágico:");

        txtItemEspada.setText("Espada de Fogo");
        txtItemEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemEspadaActionPerformed(evt);
            }
        });

        jLabel11.setText("Preço:");

        jLabel12.setText("CM");

        jLabel13.setText("segundos");

        btnEspadaInsereBanco.setText("Comprar Porção Venenosa");

        btnVerEspada.setText("VER INVENTÁRIO");

        jListEspada.setModel(listaEspada);
        jScrollPane3.setViewportView(jListEspada);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTamanhoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDuracaoFogoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPoderEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(8, 8, 8)
                                .addComponent(txtItemEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(32, 32, 32)
                                .addComponent(txtPrecoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEspadaInsereBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddEspadaLista))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnVerEspada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtItemEspada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTamanhoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPoderEspada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDuracaoFogoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspadaInsereBanco)
                    .addComponent(btnAddEspadaLista))
                .addGap(56, 56, 56)
                .addComponent(btnVerEspada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Espada de Fogo", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Espelho Teleport", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Anel ", jPanel4);

        jLabel1.setText("Tipo de Veneno:");

        txtTipoVeneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoVenenoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        btnAddPorcaoLista.setText("Adicionar a Lista de Desejos");

        btnPorcaoInsereBanco.setText("Comprar Porção Venenosa");

        jLabel4.setText("ML");

        jLabel8.setText("Preço:");

        jLabel9.setText("Item Mágico:");

        txtNomeItem.setText("Porção Venenosa");
        txtNomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeItemActionPerformed(evt);
            }
        });

        btnVerPorcao.setText("VER INVENTÁRIO");

        ItemsjList1.setModel(listaPorcao);
        jScrollPane1.setViewportView(ItemsjList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel1))
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTipoVeneno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnPorcaoInsereBanco))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddPorcaoLista)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtPrecoPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtQdtPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnVerPorcao)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTipoVeneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQdtPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPorcaoInsereBanco)
                    .addComponent(btnAddPorcaoLista))
                .addGap(32, 32, 32)
                .addComponent(btnVerPorcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(" Porção Venenosa", jPanel1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GANDALF - ITEMS MÁGICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeItemActionPerformed

    private void txtTipoVenenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoVenenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoVenenoActionPerformed

    private void txtItemEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemEspadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemEspadaActionPerformed

    private void btnAddEspadaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEspadaListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEspadaListaActionPerformed

  
      //ADD EVENTO BTN LISTA DE DESEJOS
    public void addInsereListener(ActionListener l) {
        btnAddPorcaoLista.addActionListener(l);
        btnAddEspadaLista.addActionListener(l);
    }
    //ADD EVENTO BTN VER INVENTÁRIO
    public void addLeBancoListener(ActionListener l) {
        btnVerPorcao.addActionListener(l);
        btnVerEspada.addActionListener(l);
    }
    //ADD EVENTO BTN COMPRAR ITEM
    public void addInsereBancoListener(ActionListener l) {
        btnPorcaoInsereBanco.addActionListener(l);
        btnEspadaInsereBanco.addActionListener(l);
    }

    public void listaClean() {
        listaPorcao.clear();
        listaEspada.clear();
    }

// RECEBER DADOS ESPADA
    public ModelEspadaFogo obterDadosEspada() {
        String nomeitem = txtItemEspada.getText();
        int preco = Integer.parseInt(txtPoderEspada.getText());
        int tamanho = Integer.parseInt(txtTamanhoEspada.getText());
        String poder = txtPoderEspada.getText();
        int duracao = Integer.parseInt(txtDuracaoFogoEspada.getText());
        ModelEspadaFogo e = new ModelEspadaFogo(nomeitem, preco, tamanho, poder, duracao);
        return (e);
    }
    // RECEBER DADOS DA PORCAO
    public ModelIPorcaoVenenosa obterDadosPorcao() {
        String nomeitem = txtNomeItem.getText();
        int preco = Integer.parseInt(txtPrecoPorcao.getText());
        String tipoVeneno = txtTipoVeneno.getText();
        String qdtString = txtQdtPorcao.getText();
        int qtd = Integer.parseInt(qdtString);
        ModelIPorcaoVenenosa a = new ModelIPorcaoVenenosa(nomeitem, preco, tipoVeneno, qtd);
        return (a);
    }
    
        //ADD PORCAO VENENOSA NA LISTA
    public void inserePorcaoLista(ModelIPorcaoVenenosa p) {
        listaPorcao.addElement(p);
    }
    //ADD ESPADA NA LISTA
      public void insereEspadaLista(ModelEspadaFogo e) {
         listaEspada.addElement(e);
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<zoid.itens.gandalf.models.ModelIPorcaoVenenosa> ItemsjList1;
    private javax.swing.JButton btnAddEspadaLista;
    private javax.swing.JButton btnAddPorcaoLista;
    private javax.swing.JButton btnEspadaInsereBanco;
    private javax.swing.JButton btnPorcaoInsereBanco;
    private javax.swing.JButton btnVerEspada;
    private javax.swing.JButton btnVerPorcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<ModelEspadaFogo> jListEspada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDuracaoFogoEspada;
    private javax.swing.JTextField txtItemEspada;
    private javax.swing.JTextField txtNomeItem;
    private javax.swing.JTextField txtPoderEspada;
    private javax.swing.JTextField txtPrecoEspada;
    private javax.swing.JTextField txtPrecoPorcao;
    private javax.swing.JTextField txtQdtPorcao;
    private javax.swing.JTextField txtTamanhoEspada;
    private javax.swing.JTextField txtTipoVeneno;
    // End of variables declaration//GEN-END:variables

  

}
