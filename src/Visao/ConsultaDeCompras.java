/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.CaixaAlta;
import Controle.Conectabanco;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import Modelo.ModeloTabela;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class ConsultaDeCompras extends javax.swing.JFrame {

    Conectabanco conn = new Conectabanco();
    int flag;
    String buscarelat, buscanomefornecedor, cod;
    int buscaint;

    /**
     * Creates new form FrmPesquisaCompra
     */
    public ConsultaDeCompras() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
        conn.conexao();
        try {
            MaskFormatter formcnpj = new MaskFormatter("##/##/####"); //formato do cnpj
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(formcnpj));
            jFormattedTextFieldForn.setDocument(new CaixaAlta());

        } catch (ParseException ex) {
            Logger.getLogger(ModuloDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonBuscaCliente = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jFormattedTextFieldForn = new javax.swing.JFormattedTextField();
        jButtonBuscaCliente1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButtonBuscaNF = new javax.swing.JButton();
        jFormattedTextFieldNF = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Principal/Imagens/icone.png")).getImage());
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Compras", 0, 0, new java.awt.Font("Calibri Light", 0, 24))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(867, 563));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Pesquisa de Compras Efetuadas :");

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePesquisa);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Itens da Compra Selecionada:");

        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableCompra);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Data da Compra :");

        jButtonBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/search.png"))); // NOI18N
        jButtonBuscaCliente.setToolTipText("Preencha o campo e faça a busca por um Cliente");
        jButtonBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nome do Fornecedor:");

        jButtonBuscaCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/search.png"))); // NOI18N
        jButtonBuscaCliente1.setToolTipText("Preencha o campo e faça a busca por um Cliente");
        jButtonBuscaCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCliente1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/printer.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nota Fiscal  :");

        jButtonBuscaNF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Icones metro/search.png"))); // NOI18N
        jButtonBuscaNF.setToolTipText("Preencha o campo e faça a busca por um Cliente");
        jButtonBuscaNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaNFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldData)
                            .addComponent(jFormattedTextFieldForn, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jFormattedTextFieldNF, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscaNF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBuscaNF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Cancelar Entrada");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 854, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        cod = "" + jTablePesquisa.getValueAt(jTablePesquisa.getSelectedRow(), 0);
        conn.conexao();
        preencherTabelaDetalhes("select * from compra inner join itens_compra_produto\n"
                + "on compra.id_compra=itens_compra_produto.id_compra inner join produto\n"
                + "on itens_compra_produto.id_produto = produto.id_produto where compra.id_compra = " + cod);
        try {
            conn.executaSQL("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where id_compra = " + cod);
            conn.rs.first();
            buscanomefornecedor = (conn.rs.getString("nome_fornecedor"));
            conn.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }

        jButton3.setEnabled(true);
    }//GEN-LAST:event_jTablePesquisaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn.desconecta();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteActionPerformed
        preencherTabelaPesquisa("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where data_compra like '%" + jFormattedTextFieldData.getText() + "%'");
        flag = 1;
        jFormattedTextFieldNF.setText("");
        jFormattedTextFieldForn.setText("");
    }//GEN-LAST:event_jButtonBuscaClienteActionPerformed

    private void jButtonBuscaCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCliente1ActionPerformed
        preencherTabelaPesquisa("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where nome_fornecedor like '%" + jFormattedTextFieldForn.getText() + "%'");
        flag = 2;
        jFormattedTextFieldNF.setText("");
        jFormattedTextFieldData.setText("");
    }//GEN-LAST:event_jButtonBuscaCliente1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (flag == 1) {
            conn.conexao();
            buscarelat = jFormattedTextFieldData.getText();
            try {
                conn.executaSQL("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where data_compra ='" + buscarelat + "'");

                Map param = new HashMap();
                param.put("BUSCA", buscarelat);
                JRResultSetDataSource relatResul = new JRResultSetDataSource(conn.rs);
                JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/Comprapordata.jasper", param, relatResul);
                JasperViewer jv = new JasperViewer(jpPrint, false);
                jv.setVisible(true);
                jv.setExtendedState(MAXIMIZED_BOTH);

            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "ERRO AO CHAMAR RELATÓRIO PELA DATA \nErro:" + ex);
            }
            conn.desconecta();

        } else {
            if (flag == 2) {
                conn.conexao();
                buscarelat = buscanomefornecedor;
                try {
                    conn.executaSQL("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where nome_fornecedor like '%" + buscarelat + "%'");

                    Map param = new HashMap();
                    param.put("BUSCA", buscarelat);
                    JRResultSetDataSource relatResul = new JRResultSetDataSource(conn.rs);
                    JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/Comprapornome.jasper", param, relatResul);
                    JasperViewer jv = new JasperViewer(jpPrint, false);
                    jv.setVisible(true);
                    jv.setExtendedState(MAXIMIZED_BOTH);

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "ERRO AO CHAMAR RELATÓRIO PELO NOME \nErro:" + ex);
                }
                conn.desconecta();
            } else {
                if (flag == 3) {
                    conn.conexao();
                    buscaint = Integer.parseInt(cod);
                    try {
                        conn.executaSQL("select * from compra\n"
                                + "inner join registro on compra.id_registro = registro.id_registro\n"
                                + "inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor\n"
                                + "inner join cidade on fornecedores.id_cidade = cidade.id_cidade\n"
                                + "inner join estados on cidade.id_estado = estados.id_estado\n"
                                + "inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma\n"
                                + "inner join itens_compra_produto on compra.id_compra = itens_compra_produto.id_compra\n"
                                + "inner join produto on produto.id_produto = itens_compra_produto.id_produto\n"
                                + "where itens_compra_produto.id_compra =" + buscaint);

                        Map param = new HashMap();
                        param.put("BUSCA", buscaint);
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(conn.rs);
                        JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/EspelhoDeEntrada.jasper", param, relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);
                        jv.setVisible(true);
                        jv.setExtendedState(MAXIMIZED_BOTH);

                    } catch (JRException ex) {
                        JOptionPane.showMessageDialog(rootPane, "ERRO AO CHAMAR ESPELHO DE ENTRADA \nErro:" + ex);
                    }
                    conn.desconecta();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "FAÇA UMA BUSCA POR DATA OU NOME ANTES DE IMPRIMIR!");
                }

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonBuscaNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaNFActionPerformed
        flag = 3;
        preencherTabelaPesquisa("select * from compra inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma where nf like '%" + jFormattedTextFieldNF.getText() + "%'");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldForn.setText("");
        try {
            conn.rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscaNFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch (JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR O REGISTRO ? \n(Isso apagará tudo vinculado a esta compra)  ")) {
            case 0:
                conn.conexao();
                PreparedStatement pst;
                conn.executaSQL("select * from compra inner join itens_compra_produto on compra.id_compra = itens_compra_produto.id_compra \n"
                        + "inner join produto on itens_compra_produto.id_produto = produto.id_produto where compra.id_compra=" + Integer.parseInt(cod));

                try {
                    conn.rs.first();
                    do {
                        int qtdProd = conn.rs.getInt("quantidade");
                        int qtdComp = conn.rs.getInt("quantidade_produto");
                        int soma = qtdProd - qtdComp;
                        pst = conn.conn.prepareStatement("update produto set quantidade=? where id_produto=?");
                        pst.setInt(1, soma);
                        pst.setInt(2, conn.rs.getInt("id_produto"));
                        pst.execute();
                        pst = conn.conn.prepareStatement("delete from itens_compra_produto where id_compra=?");
                        pst.setInt(1, conn.rs.getInt("id_compra"));
                        pst.execute();
                    } while (conn.rs.next());

                    pst = conn.conn.prepareStatement("delete from compra where id_compra=?");
                    pst.setInt(1, Integer.parseInt(cod));
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "CANCELAMENTO EFETUADO  !");
                    conn.desconecta();
                } catch (SQLException ex) {
                    conn.conexao();
                    conn.executaSQL("select * from compra \n"
                            + "inner join contas_pagar on compra.id_compra = contas_pagar.id_compra \n"
                            + "inner join itens_compra_produto on compra.id_compra = itens_compra_produto.id_compra \n"
                            + "inner join produto on itens_compra_produto.id_produto = produto.id_produto where compra.id_compra=" + Integer.parseInt(cod));

                    try {
                        conn.rs.first();
                        do {
                            pst = conn.conn.prepareStatement("delete from contas_pagar where contas_pagar.id_compra =?");
                            pst.setInt(1, Integer.parseInt(cod));
                            pst.execute();
                            int qtdProd = conn.rs.getInt("quantidade");
                            int qtdComp = conn.rs.getInt("quantidade_produto");
                            int soma = qtdProd - qtdComp;
                            pst = conn.conn.prepareStatement("update produto set quantidade=? where id_produto=?");
                            pst.setInt(1, soma);
                            pst.setInt(2, Integer.parseInt(cod));
                            pst.execute();
                            pst = conn.conn.prepareStatement("delete from itens_compra_produto where id_compra=?");
                            pst.setInt(1, Integer.parseInt(cod));
                            pst.execute();
                        } while (conn.rs.next());

                        pst = conn.conn.prepareStatement("delete from compra where id_compra=?");
                        pst.setInt(1, Integer.parseInt(cod));
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "CANCELAMENTO EFETUADO  !");
                        conn.desconecta();
                    } catch (SQLException ax) {
                        conn.conexao();
                        conn.executaSQL("select * from compra where compra.id_compra=" + Integer.parseInt(cod));

                        try {
                            conn.rs.first();
                            pst = conn.conn.prepareStatement("delete from compra where id_compra=?");
                            pst.setInt(1, Integer.parseInt(cod));
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "CANCELAMENTO EFETUADO  !");
                        } catch (SQLException aex) {
                            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR COMPRA    !  !" + aex);
                        }
                    }
                }
            preencherTabelaDetalhes("select * from compra");
            preencherTabelaPesquisa("select * from compra");
                conn.desconecta();
                break;
            case 1:
                System.out.println("botao no clicado");
                break;
            case 2:
                System.out.println("botao cancel clicado");
                break;

        }
        jButton3.setEnabled(false);

    }//GEN-LAST:event_jButton3ActionPerformed
    public void preencherTabelaPesquisa(String SQL) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Operação", "NF", "Data da Compra", "Fornecedor", "Valor da Compra", "Forma de Pagamento", "Parcelas", "Valor Por parcela"};
        conn.conexao();
        conn.executaSQL(SQL);
        try {
            conn.rs.first();
            do {
                dados.add(new Object[]{conn.rs.getString("id_compra"), conn.rs.getString("nf"), conn.rs.getString("data_compra"), conn.rs.getString("nome_fornecedor"), conn.rs.getString("valor_compra"), conn.rs.getString("nome_forma"), conn.rs.getString("qtd_parcelas"), conn.rs.getString("valor_parcela")});
            } while (conn.rs.next());
        } catch (SQLException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        jTablePesquisa.setModel(modelo);
        jTablePesquisa.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTablePesquisa.getColumnModel().getColumn(0).setResizable(!false);
        jTablePesquisa.getColumnModel().getColumn(1).setPreferredWidth(25);
        jTablePesquisa.getColumnModel().getColumn(1).setResizable(true);
        jTablePesquisa.getColumnModel().getColumn(2).setPreferredWidth(25);
        jTablePesquisa.getColumnModel().getColumn(2).setResizable(!false);
        jTablePesquisa.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTablePesquisa.getColumnModel().getColumn(3).setResizable(!false);

        jTablePesquisa.getTableHeader().setReorderingAllowed(true);
        jTablePesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    public void preencherTabelaDetalhes(String SQL) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Produto", "Referencia", "Quantidade Comprada", "Custo Atual (R$)"};
        conn.conexao();
        conn.executaSQL(SQL);
        try {
            conn.rs.first();
            do {
                dados.add(new Object[]{conn.rs.getString("nome_produto"), conn.rs.getString("referencia"), conn.rs.getString("quantidade_produto"), conn.rs.getString("preco_compra")});
            } while (conn.rs.next());
        } catch (SQLException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        jTableCompra.setModel(modelo);
        jTableCompra.getColumnModel().getColumn(0).setPreferredWidth(350);
        jTableCompra.getColumnModel().getColumn(0).setResizable(!false);
        jTableCompra.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTableCompra.getColumnModel().getColumn(1).setResizable(true);
        jTableCompra.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTableCompra.getColumnModel().getColumn(2).setResizable(!false);

        jTableCompra.getTableHeader().setReorderingAllowed(true);
        jTableCompra.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(ConsultaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDeCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscaCliente;
    private javax.swing.JButton jButtonBuscaCliente1;
    private javax.swing.JButton jButtonBuscaNF;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldForn;
    private javax.swing.JFormattedTextField jFormattedTextFieldNF;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTable jTablePesquisa;
    // End of variables declaration//GEN-END:variables
}
