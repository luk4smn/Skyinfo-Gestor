/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Ultilitarios;

import Controle.Conectabanco;
import Controle.ControleClientes;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Modelo.ModeloClientes;
import Modelo.ModeloTabela;
import Visao.ModuloDeVendas;

/**
 *
 * @author Administrador
 */
public class BuscaCliente extends javax.swing.JFrame {
    Conectabanco conncli = new Conectabanco();
    ModeloClientes mod = new ModeloClientes();
    ControleClientes control = new ControleClientes();
    ModuloDeVendas recebe;

    /**
     * Creates new form FrmResultCliente
     */
    public BuscaCliente() {
        initComponents();
        
    }

    public void enviaPesquisa(String nomeCli){
        mod.setBusca(nomeCli);
        ModeloClientes model = control.buscaCadastro(mod);
        preencherTabelaCliente("select * from clientes where nome_cliente like '%"+ mod.getBusca()+"%'"); 

    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaCliente = new javax.swing.JTable();
        jButtonVincular = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Principal/Imagens/icone.png")).getImage());
        setResizable(false);

        jTablePesquisaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaCliente);

        jButtonVincular.setText("Vincular");
        jButtonVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVincularActionPerformed(evt);
            }
        });

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTextFieldCliente.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Buscar Cliente:");

        jLabel20.setText("Cliente Selecionado :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVincular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel19)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVincular)
                    .addComponent(jButtonExit))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVincularActionPerformed
        recebe = new ModuloDeVendas();
        recebe.recebeDadosCliente(jTextFieldCliente.getText()); 
        recebe.setVisible(true);
        conncli.desconecta();

         dispose();
    }//GEN-LAST:event_jButtonVincularActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        recebe = new ModuloDeVendas();
        recebe.setVisible(true);
        conncli.desconecta();

         dispose();
        
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTablePesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaClienteMouseClicked
         String nome_cliente =""+ jTablePesquisaCliente.getValueAt(jTablePesquisaCliente.getSelectedRow(),1);
        conncli.conexao();
        conncli.executaSQL("select * from clientes where nome_cliente like '"+nome_cliente+"'");
        
        try {
        conncli.rs.first();
        jTextFieldCliente.setText(conncli.rs.getString("nome_cliente"));
        
        conncli.desconecta();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Erro ao Carregar da tabela !" +ex);
            
        }
    }//GEN-LAST:event_jTablePesquisaClienteMouseClicked

    
     public void preencherTabelaCliente(String SQL){
    ArrayList dados = new ArrayList ();
    String [] Colunas = new String[]{"ID","Cliente","CPF","CNPJ"};
    conncli.conexao();
    conncli.executaSQL(SQL);
   try {
        conncli.rs.first();
        do{
          dados.add(new Object[]{conncli.rs.getInt("id_cliente"), conncli.rs.getString("nome_cliente"),conncli.rs.getString("cpf_cliente"),conncli.rs.getString("cnpj_cliente")});
          }while(conncli.rs.next());
        } catch (SQLException ex){
        }
   ModeloTabela modelo = new ModeloTabela(dados,Colunas);
       
   jTablePesquisaCliente.setModel(modelo);
   jTablePesquisaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
   jTablePesquisaCliente.getColumnModel().getColumn(0).setResizable(!false);
   jTablePesquisaCliente.getColumnModel().getColumn(1).setPreferredWidth(280);
   jTablePesquisaCliente.getColumnModel().getColumn(1).setResizable(true);
   jTablePesquisaCliente.getColumnModel().getColumn(2).setPreferredWidth(130);
   jTablePesquisaCliente.getColumnModel().getColumn(2).setResizable(!false);
   jTablePesquisaCliente.getColumnModel().getColumn(3).setPreferredWidth(280);
   jTablePesquisaCliente.getColumnModel().getColumn(3).setResizable(!false);


   jTablePesquisaCliente.getTableHeader().setReorderingAllowed(true);
   jTablePesquisaCliente.setAutoResizeMode(jTablePesquisaCliente.AUTO_RESIZE_OFF);
   jTablePesquisaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
  
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonVincular;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisaCliente;
    private javax.swing.JTextField jTextFieldCliente;
    // End of variables declaration//GEN-END:variables

    public void enviaPesquisaCNPJ(String CNPJCli) {
      mod.setBusca(CNPJCli);
        ModeloClientes model = control.buscaCadastroCNPJ(mod);
        preencherTabelaCliente("select * from clientes where cnpj_cliente like '%"+ mod.getBusca()+"%'"); 
    }
}
