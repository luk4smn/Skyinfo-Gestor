/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloTitulosCompra;

/**
 *
 * @author Administrador
 */
public class ControleParcelamentoDeCompra {

    Conectabanco conn = new Conectabanco();

    public void Inserir(ModeloTitulosCompra mod) {

        conn.conexao();

        try {
            PreparedStatement pst = conn.conn.prepareStatement("insert into contas_pagar (id_compra,valor_total,data,valor_parcela,numero_parcela,forma,estado,nf_compra) values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, mod.getCodCompra());
            pst.setString(2, mod.getTotalcompra());
            pst.setString(3, mod.getData_parcela());
            pst.setString(4, mod.getValorparcela());
            pst.setInt(5, mod.getNumero_parcela());
            pst.setString(6, mod.getForma());
            pst.setString(7, "EM ABERTO");
            pst.setString(8, mod.getNf());
            pst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR ! /nERRO:" + ex);
        }
    }
}
