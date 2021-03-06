/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Ultilitarios;

import Controle.Conectabanco;
import Controle.ControleParcelamentoDeCompra;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
import Modelo.ModeloTitulosCompra;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class GeraParcelasCompra extends javax.swing.JFrame {
int qtd_parcelas,i=1,cont=1,buscarelat;
ModeloTitulosCompra mod = new ModeloTitulosCompra();
Conectabanco conecta = new Conectabanco();
ControleParcelamentoDeCompra control = new ControleParcelamentoDeCompra();
    /**
     * Creates new form FrmGerarVencimentoCompra
     */
    public GeraParcelasCompra(int cod) {
        initComponents();
        conecta.conexao();
        try {
            MaskFormatter formdata = new MaskFormatter ("##/##/####"); //formato do cnpj
           jTextFieldData.setFormatterFactory(new DefaultFormatterFactory(formdata));
             }
        catch (ParseException ex){
            Logger.getLogger(GeraParcelasCompra.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
        conecta.executaSQL("select * from compra where id_compra ="+cod);
        try {
            conecta.rs.first();
            jTextFieldIDCompra.setText(String.valueOf(cod));
            jTextFieldValorCompra.setText(conecta.rs.getString("valor_compra"));
            jTextFieldForma.setText(conecta.rs.getString("forma"));
            jTextFieldParcelas.setText(conecta.rs.getString("qtd_parcelas"));
            jTextFieldParcelasValor.setText(conecta.rs.getString("valor_parcela"));
            jTextFieldDataEntrada.setText(conecta.rs.getString("data_compra"));
            jTextFieldNF.setText(conecta.rs.getString("nf"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERRO AO VINCULAR VENDA \n!"   +ex);
        }
        
        
    }

    private GeraParcelasCompra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDCompra = new javax.swing.JTextField();
        jTextFieldForma = new javax.swing.JTextField();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldParcelas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldParcelasValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDataEntrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButtonParcelar = new javax.swing.JButton();
        jButtonGerar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Principal/Imagens/icone.png")).getImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerador de Títulos (Compras)", 0, 0, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel1.setText("Movimento (Nº)");

        jTextFieldIDCompra.setEditable(false);
        jTextFieldIDCompra.setForeground(new java.awt.Color(0, 51, 255));
        jTextFieldIDCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldForma.setEditable(false);
        jTextFieldForma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldValorCompra.setEditable(false);

        jLabel2.setText("Valor da Venda:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Forma de Pagamento:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Parcelas :");

        jTextFieldParcelas.setEditable(false);
        jTextFieldParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldParcelas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldParcelasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldParcelasFocusLost(evt);
            }
        });

        jLabel13.setText("Valor por Parcela :");

        jTextFieldParcelasValor.setEditable(false);
        jTextFieldParcelasValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldParcelasValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldParcelasValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldParcelasValorFocusLost(evt);
            }
        });

        jLabel3.setText("Data Entrada:");

        jTextFieldDataEntrada.setEditable(false);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        jButtonParcelar.setText("Parcelar");
        jButtonParcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcelarActionPerformed(evt);
            }
        });

        jButtonGerar.setText("Gerar Títulos");
        jButtonGerar.setEnabled(false);
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });

        jLabel4.setText("NF (Nº)");

        jTextFieldNF.setEditable(false);
        jTextFieldNF.setForeground(new java.awt.Color(0, 51, 255));
        jTextFieldNF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Data Primeiro Vencimento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonParcelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldForma, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(79, 79, 79)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldData)
                            .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldParcelasValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParcelasValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonParcelar)
                    .addComponent(jButtonGerar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldParcelasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParcelasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcelasFocusGained

    private void jTextFieldParcelasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParcelasFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcelasFocusLost

    private void jTextFieldParcelasValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParcelasValorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcelasValorFocusGained

    private void jTextFieldParcelasValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParcelasValorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParcelasValorFocusLost

    private void jButtonParcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcelarActionPerformed
        if (jTextFieldData.getText().equals("")){
        JOptionPane.showMessageDialog (null,"INSIRA O VENCIMENTO !!");
        }
        else{
        
        qtd_parcelas =Integer.parseInt(jTextFieldParcelas.getText());
        preencherTabela();
        jButtonGerar.setEnabled(true);}
    }//GEN-LAST:event_jButtonParcelarActionPerformed

    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed
        int j=1;
        String datavenc = jTextFieldData.getText();
        String dia,mes,ano;
        dia=""+datavenc.charAt(0)+datavenc.charAt(1)+ "/";
        mes=""+datavenc.charAt(3)+datavenc.charAt(4);
        ano="/"+datavenc.charAt(6)+datavenc.charAt(7)+datavenc.charAt(8)+datavenc.charAt(9);
        int anoInt = Integer.parseInt(""+datavenc.charAt(6)+datavenc.charAt(7)+datavenc.charAt(8)+datavenc.charAt(9));
        int mesInt= Integer.parseInt(mes);
        while(j<cont){
            if (mesInt<10){
                mod.setCodCompra(Integer.parseInt(jTextFieldIDCompra.getText()));
                mod.setValorparcela(jTextFieldParcelasValor.getText());
                mod.setTotalcompra(jTextFieldValorCompra.getText());
                mod.setNumero_parcela(j);
                mod.setData_parcela(dia+"0"+mesInt+"/"+anoInt);
                mod.setForma(jTextFieldForma.getText());
                mod.setNf(jTextFieldNF.getText());

                control.Inserir(mod);

            }else{
                mod.setCodCompra(Integer.parseInt(jTextFieldIDCompra.getText()));
                mod.setValorparcela(jTextFieldParcelasValor.getText());
                mod.setTotalcompra(jTextFieldValorCompra.getText());
                mod.setNumero_parcela(j);
                mod.setData_parcela(dia+mesInt+"/"+anoInt);
                mod.setNf(jTextFieldNF.getText());
                control.Inserir(mod);
                
            }
            mesInt++;
            if (mesInt>12){
                anoInt++;
                mesInt=1;
            }
            j++;

        }

        JOptionPane.showMessageDialog(rootPane, "PARCELAS GERADAS !");
        chamaespelho();
        conecta.desconecta();
        dispose();

    }//GEN-LAST:event_jButtonGerarActionPerformed
public void preencherTabela(){
    ArrayList dados = new ArrayList ();
    
    String [] Colunas = new String[]{"COD.","Vencimento","NF","Total da Compra","Valor Parcelado",};
    String data = jTextFieldData.getText();
    String dia,mes,ano;
    dia=""+data.charAt(0)+data.charAt(1)+ "/";
    mes=""+data.charAt(3)+data.charAt(4);
    ano="/"+data.charAt(6)+data.charAt(7)+data.charAt(8)+data.charAt(9);
    int anoInt = Integer.parseInt(""+data.charAt(6)+data.charAt(7)+data.charAt(8)+data.charAt(9));
    int mesInt= Integer.parseInt(mes);
 while(i<=qtd_parcelas){
       if (mesInt<10){
     dados.add(new Object[]{i,dia+"0"+mesInt+"/"+anoInt,jTextFieldNF.getText(),jTextFieldValorCompra.getText(),jTextFieldParcelasValor.getText()});
       }else{
           dados.add(new Object[]{i,dia+mesInt+"/"+anoInt,jTextFieldNF.getText(),jTextFieldValorCompra.getText(),jTextFieldParcelasValor.getText()});
       }
        mesInt++;
        if (mesInt>12){
            anoInt++;
            mesInt=1;
        }            
             i++;
             cont++;
       
          }
       
   ModeloTabela modelo = new ModeloTabela(dados,Colunas);
       
   tabela.setModel(modelo);
   tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
   tabela.getColumnModel().getColumn(0).setResizable(!false);
   tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
   tabela.getColumnModel().getColumn(1).setResizable(true);
   tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
   tabela.getColumnModel().getColumn(2).setResizable(false);
   tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
   tabela.getColumnModel().getColumn(3).setResizable(false);
 
   tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
   tabela.getTableHeader().setReorderingAllowed(true);
   tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
   conecta.desconecta();
    
}
    
public void chamaespelho(){
   conecta.conexao();
   buscarelat = Integer.parseInt(jTextFieldIDCompra.getText());
   try{conecta.executaSQL("select * from compra\n" +
"inner join registro on compra.id_registro = registro.id_registro\n" +
"inner join fornecedores on compra.id_fornecedor=fornecedores.id_fornecedor\n" +
"inner join cidade on fornecedores.id_cidade = cidade.id_cidade\n" +
"inner join estados on cidade.id_estado = estados.id_estado\n" +
"inner join forma_pagamento on compra.forma=forma_pagamento.nome_forma\n" +
"inner join itens_compra_produto on compra.id_compra = itens_compra_produto.id_compra\n" +
"inner join produto on produto.id_produto = itens_compra_produto.id_produto\n" +
"where itens_compra_produto.id_compra ="+buscarelat);
        
    Map param = new HashMap(); 
    param.put("BUSCA", buscarelat);             
    JRResultSetDataSource relatResul = new JRResultSetDataSource (conecta.rs);
      JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/EspelhoDeEntrada.jasper",param,relatResul);
          JasperViewer jv = new JasperViewer (jpPrint,false); 
         jv.setVisible(true);
         jv.setExtendedState(MAXIMIZED_BOTH);
        
  }catch(JRException ex)         {
    JOptionPane.showMessageDialog(rootPane, "ERRO AO CHAMAR RELATÓRIO  \nErro:" +ex);
  }
  conecta.desconecta();
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
            java.util.logging.Logger.getLogger(GeraParcelasCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeraParcelasCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeraParcelasCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeraParcelasCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeraParcelasCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JButton jButtonParcelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDataEntrada;
    private javax.swing.JTextField jTextFieldForma;
    private javax.swing.JTextField jTextFieldIDCompra;
    private javax.swing.JTextField jTextFieldNF;
    private javax.swing.JTextField jTextFieldParcelas;
    private javax.swing.JTextField jTextFieldParcelasValor;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
