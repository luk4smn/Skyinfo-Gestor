/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.Conectabanco;
import Controle.ControleCidade;
import Modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Modelo.ModeloCidade;

/**
 *
 * @author lanmark rafael
 */
public final class CadastroDeCidades extends javax.swing.JFrame {

    Conectabanco connEstado = new Conectabanco();
    Conectabanco connCidade = new Conectabanco();
    ModeloCidade mod = new ModeloCidade();
    ControleCidade control = new ControleCidade();

    /**
     * Creates new form FrmCidade
     */
    public CadastroDeCidades() {
        initComponents();
        preencherComboBox();
        preencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidades = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAddEstado = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Principal/Imagens/icone.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidades", 0, 0, new java.awt.Font("Calibri Light", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/basic1-171_add_new_plus-24.png"))); // NOI18N
        jButtonAdd.setText("Novo");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/basic1-187_floppy_save_disc-24.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/basic1-001_write_compose_new-24.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/basic1-020_bin_trash_delete-24.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCidades);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/basic1-173_close_remove_exit-24.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAddEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAddEstado.setText("+");
        jButtonAddEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEstadoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/2 (28).png"))); // NOI18N
        jButtonAtualizar.setToolTipText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddEstado)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAdd)
                        .addComponent(jButtonSalvar)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonCancelar))
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(830, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed

    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        jTextFieldNome.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonAdd.setEnabled(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        connEstado.conexao();
        try {

            mod.setNome(jTextFieldNome.getText());
            connEstado.executaSQL("select * from estados where nome_estado='" + jComboBoxEstado.getSelectedItem() + "'");
            connEstado.rs.first();
            mod.setCod_estado(connEstado.rs.getInt("id_estado"));
            control.InserirCidade(mod);
            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDeCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        connEstado.desconecta();
        jButtonAtualizarActionPerformed(evt);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            mod.setCod(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setCod_estado(connCidade.rs.getInt("id_estado"));
            control.ExcluirCidade(mod);
            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDeCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        connEstado.conexao();
        try {
            mod.setCod(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            connEstado.executaSQL("select * from estados where nome_estado = '" + jComboBoxEstado.getSelectedItem() + "'");
            connEstado.rs.first();
            mod.setCod_estado(connEstado.rs.getInt("id_estado"));
            control.AlteraCidade(mod);
            jTextFieldNome.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jTextFieldCod.setText("");
            jTextFieldNome.setText("");
            jButtonAdd.setEnabled(true);
            preencherTabela();
        } catch (SQLException ex) {
        }
        jButtonAtualizarActionPerformed(evt);
        connEstado.desconecta();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAddEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEstadoActionPerformed
        CadastroDeEstados frm = new CadastroDeEstados();
        frm.setVisible(true);
        connEstado.executaSQL("select * from estados order by nome_estado");
        jComboBoxEstado.removeAllItems();
        try {
            connEstado.rs.first();
            do {
                jComboBoxEstado.addItem(connEstado.rs.getString("nome_estado"));

            } while (connEstado.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Erro ao preencher combobox estado:" + ex);
            Logger.getLogger(CadastroDeCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddEstadoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        connEstado.conexao();
        connEstado.executaSQL("select * from estados order by nome_estado");
        jComboBoxEstado.removeAllItems();
        try {
            connEstado.rs.first();
            do {
                jComboBoxEstado.addItem(connEstado.rs.getString("nome_estado"));

            } while (connEstado.rs.next());
            preencherTabela();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Erro ao preencher combobox estado:" + ex);

            Logger.getLogger(CadastroDeCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        connEstado.desconecta();
        jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableCidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCidadesMouseClicked
        String id_cidade = "" + jTableCidades.getValueAt(jTableCidades.getSelectedRow(), 0);
        connCidade.conexao();
        connCidade.executaSQL("select * from cidade inner join estados on cidade.id_estado = estados.id_estado where id_cidade ::text like '" + id_cidade + "'");
        try {
            connCidade.rs.first();
            jTextFieldCod.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidade"));
            jComboBoxEstado.setSelectedItem(connCidade.rs.getString("nome_estado"));
            jButtonSalvar.setEnabled(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar da tabela !" + ex);
        }
        connCidade.desconecta();
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonAdd.setEnabled(false);

    }//GEN-LAST:event_jTableCidadesMouseClicked

    public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Cidade", "Estado"};
        connCidade.conexao();
        connCidade.executaSQL("select * from cidade inner join estados on cidade.id_estado = estados.id_estado order by nome_cidade");
        try {
            connCidade.rs.first();
            do {
                dados.add(new Object[]{connCidade.rs.getInt("id_cidade"), connCidade.rs.getString("nome_cidade"), connCidade.rs.getString("sigla_estado")});
            } while (connCidade.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDeEstados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher o ArrayList\n ERRO: " + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        jTableCidades.setModel(modelo);
        jTableCidades.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableCidades.getColumnModel().getColumn(0).setResizable(false);
        jTableCidades.getColumnModel().getColumn(1).setPreferredWidth(376);
        jTableCidades.getColumnModel().getColumn(1).setResizable(false);
        jTableCidades.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableCidades.getColumnModel().getColumn(2).setResizable(false);
        jTableCidades.getTableHeader().setReorderingAllowed(false);
        jTableCidades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connCidade.desconecta();
    }

    public void preencherComboBox() {
        connCidade.conexao();
        connEstado.conexao();
        connEstado.executaSQL("select * from estados order by nome_estado");
        jComboBoxEstado.removeAllItems();
        try {
            connEstado.rs.first();
            do {
                jComboBoxEstado.addItem(connEstado.rs.getString("nome_estado"));

            } while (connEstado.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Erro ao preencher combobox estado:" + ex);
            Logger.getLogger(CadastroDeCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        connEstado.desconecta();
        connCidade.desconecta();
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
            java.util.logging.Logger.getLogger(CadastroDeEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDeCidades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddEstado;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCidades;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
