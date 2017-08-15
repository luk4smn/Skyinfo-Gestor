/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.CaixaAlta;
import Controle.Conectabanco;
import Controle.ControleUsuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import Modelo.ModeloTabela;
import Modelo.ModeloUsuario;

/**
 *
 * @author Administrador
 */
public class CadastroDeUsuarios extends javax.swing.JFrame {

    ModeloUsuario mod = new ModeloUsuario();
    ControleUsuario control = new ControleUsuario();
    Conectabanco conn = new Conectabanco();

    /**
     * Creates new form FrmCadLogin
     */
    public CadastroDeUsuarios() {
        initComponents();
        try {
            MaskFormatter formtel = new MaskFormatter("(##)####-####"); //formato do telefone
            MaskFormatter formtel1 = new MaskFormatter("(##)#####-####"); //formato do telefone
            jFormattedTextFieldTel.setFormatterFactory(new DefaultFormatterFactory(formtel));
            jFormattedTextFieldCel.setFormatterFactory(new DefaultFormatterFactory(formtel1));
            jTextFieldBusca.setDocument(new CaixaAlta());
            jTextFieldNome.setDocument(new CaixaAlta());
            jTextFieldLogin.setDocument(new CaixaAlta());
        } catch (ParseException ex) {
            Logger.getLogger(CadastroDeContatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabeNum1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabeNum4 = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jLabeNum = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCel = new javax.swing.JFormattedTextField();
        jLabeNum3 = new javax.swing.JLabel();
        jLabeNum5 = new javax.swing.JLabel();
        jTextFieldFuncao = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabeNum6 = new javax.swing.JLabel();
        jLabeNum2 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Principal/Imagens/icone.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Usuários", 0, 0, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabelCod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCod.setText("Cód.");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);

        jLabeNum1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum1.setText("Nome");

        jTextFieldNome.setEnabled(false);

        jLabeNum4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum4.setText("E-mail");

        jTextFieldMail.setEnabled(false);

        jLabeNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum.setText("Tel. Fixo");

        jFormattedTextFieldTel.setEnabled(false);

        jFormattedTextFieldCel.setEnabled(false);

        jLabeNum3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum3.setText("Cel.");

        jLabeNum5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum5.setText("Função :");

        jTextFieldFuncao.setEnabled(false);

        jPasswordField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Senha: (10 dígitos)");

        jPasswordField2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Confirmar Senha:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Comum" }));

        jLabeNum6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum6.setText("Permissões :");

        jLabeNum2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNum2.setText("Login :");

        jTextFieldLogin.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabeNum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabeNum5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabeNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldLogin)))))
                                .addGap(300, 300, 300)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabeNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabeNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabeNum3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabeNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome)))
                .addGap(52, 52, 52))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDados);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Clique aqui para Salvar qualquer alteração");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Adiciona um novo usuário");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Deletar Item selecionado");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Clique aqui para Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancela Operação");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscaActionPerformed(evt);
            }
        });

        jButtonBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/search.png"))); // NOI18N
        jButtonBusca.setToolTipText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jLabel18.setText("Buscar: (Nome Contêm)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addGap(4, 4, 4)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCod.setText("");
        jTextFieldFuncao.setText("");
        jTextFieldLogin.setText("");
        jPasswordField.setText("");
        jPasswordField2.setText("");
        jTextFieldMail.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldCel.setText("");

        jTextFieldNome.setEditable(true);
        jFormattedTextFieldTel.setEnabled(true);
        jFormattedTextFieldCel.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldMail.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jTextFieldFuncao.setEnabled(true);
        jPasswordField.setEnabled(true);
        jPasswordField2.setEnabled(true);

        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jPasswordField.getText().equals(jPasswordField2.getText())) {
            mod.setNome(jTextFieldNome.getText());
            mod.setSenha(jPasswordField.getText());
            mod.setPermissao((String) jComboBox1.getSelectedItem());
            mod.setTel(jFormattedTextFieldTel.getText());
            mod.setTel2(jFormattedTextFieldCel.getText());
            mod.setMail(jTextFieldMail.getText());
            mod.setLogin(jTextFieldLogin.getText());
            mod.setFuncao(jTextFieldFuncao.getText());

            control.inserir(mod);
            jButtonCancelarActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(rootPane, "AS SENHAS NÃO CORRESPONDEM !");
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jFormattedTextFieldCel.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldNome.setEditable(true);
        jTextFieldMail.setEnabled(true);
        jPasswordField.setEnabled(true);
        jFormattedTextFieldTel.setEnabled(true);
        jFormattedTextFieldCel.setEnabled(true);
        jTextFieldMail.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jTextFieldFuncao.setEnabled(true);
        jPasswordField.setEnabled(true);
        jPasswordField2.setEnabled(true);

        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(!false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if (jPasswordField.getText().equals(jPasswordField2.getText())) {
            mod.setCod(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setSenha(jPasswordField.getText());
            mod.setPermissao((String) jComboBox1.getSelectedItem());
            mod.setTel(jFormattedTextFieldTel.getText());
            mod.setTel2(jFormattedTextFieldCel.getText());
            mod.setMail(jTextFieldMail.getText());
            mod.setLogin(jTextFieldLogin.getText());
            mod.setFuncao(jTextFieldFuncao.getText());
            control.alterar(mod);
            jButtonCancelarActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(rootPane, "AS SENHAS NÃO CORRESPONDEM !");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        switch (JOptionPane.showConfirmDialog(null, "DESEJA EXLUIR O ITEM SELECIONADO ?  ")) {
            case 0:
                mod.setCod(Integer.parseInt(jTextFieldCod.getText()));
                control.excluir(mod);
                jButtonCancelarActionPerformed(evt);
                break;
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jFormattedTextFieldTel.setEnabled(false);
        jFormattedTextFieldCel.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldMail.setEnabled(false);
        jTextFieldFuncao.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jPasswordField.setEnabled(false);
        jPasswordField2.setEnabled(false);

        jTextFieldCod.setText("");
        jTextFieldFuncao.setText("");
        jTextFieldLogin.setText("");
        jPasswordField.setText("");
        jPasswordField2.setText("");
        jTextFieldMail.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldCel.setText("");

        preencherTabela("select * from login where permissao not in ('Desenvolvedor')");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscaActionPerformed

    }//GEN-LAST:event_jTextFieldBuscaActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        mod.setBusca(jTextFieldBusca.getText());
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        jTextFieldNome.setEditable(false);
        control.buscaCadastro(mod);
        preencherTabela("select * from login where nome like '%" + jTextFieldBusca.getText() + "%'and permissao not in ('Desenvolvedor')");

    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void jTableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseClicked
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        String nome = "" + jTableDados.getValueAt(jTableDados.getSelectedRow(), 0);
        conn.conexao();
        conn.executaSQL("select * from login where nome like '" + nome + "'and permissao not in ('Desenvolvedor')");
        try {
            conn.rs.first();
            jTextFieldCod.setText(String.valueOf(conn.rs.getInt("id_login")));
            jTextFieldNome.setText(conn.rs.getString("nome"));
            jTextFieldMail.setText(conn.rs.getString("mail"));
            jTextFieldLogin.setText(conn.rs.getString("login"));
            jPasswordField.setText(conn.rs.getString("senha"));
            jTextFieldFuncao.setText(conn.rs.getString("funcao"));
            jFormattedTextFieldTel.setText(conn.rs.getString("numero_tel"));
            jFormattedTextFieldCel.setText(conn.rs.getString("numero_tel2"));
            jComboBox1.setSelectedItem(conn.rs.getString("permissao"));
            jButtonExcluir.setEnabled(true);
            jButtonEditar.setEnabled(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO RETORNAR DADOS !\n" + ex);
        }
        conn.desconecta();


    }//GEN-LAST:event_jTableDadosMouseClicked

    public void preencherTabela(String SQL) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nome", "Telefone", "Celular", "E-mail", "Função", "Login", "Permissao"};

        conn.conexao();
        conn.executaSQL(SQL);
        try {
            conn.rs.first();
            do {
                dados.add(new Object[]{conn.rs.getString("nome"), conn.rs.getString("numero_tel"), conn.rs.getString("numero_tel2"), conn.rs.getString("mail"), conn.rs.getString("funcao"), conn.rs.getString("login"), conn.rs.getString("permissao")});
            } while (conn.rs.next());
        } catch (SQLException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        jTableDados.setModel(modelo);
        jTableDados.getColumnModel().getColumn(0).setPreferredWidth(240);
        jTableDados.getColumnModel().getColumn(0).setResizable(false);
        jTableDados.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableDados.getColumnModel().getColumn(1).setResizable(false);
        jTableDados.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableDados.getColumnModel().getColumn(2).setResizable(false);
        jTableDados.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTableDados.getColumnModel().getColumn(3).setResizable(!false);
        jTableDados.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableDados.getColumnModel().getColumn(4).setResizable(!false);
        jTableDados.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableDados.getColumnModel().getColumn(5).setResizable(!false);

        jTableDados.getTableHeader().setReorderingAllowed(false);
        jTableDados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conn.desconecta();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDeUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabeNum;
    private javax.swing.JLabel jLabeNum1;
    private javax.swing.JLabel jLabeNum2;
    private javax.swing.JLabel jLabeNum3;
    private javax.swing.JLabel jLabeNum4;
    private javax.swing.JLabel jLabeNum5;
    private javax.swing.JLabel jLabeNum6;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldFuncao;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
