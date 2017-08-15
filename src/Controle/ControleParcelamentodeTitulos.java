/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ControleParcelamentodeTitulos {

    Conectabanco conn = new Conectabanco();

    public void Inserir(ModeloTitulos mod) {

        conn.conexao();

        try {
            PreparedStatement pst = conn.conn.prepareStatement("insert into contas_receber (id_venda,valor_total,data,valor_parcela,numero_parcela,forma,estado) values(?,?,?,?,?,?,?)");
            pst.setInt(1, mod.getCodVenda());
            pst.setString(2, mod.getTotalvenda());
            pst.setString(3, mod.getData_parcela());
            pst.setString(4, mod.getValorparcela());
            pst.setInt(5, mod.getNumero_parcela());
            pst.setString(6, mod.getForma());
            pst.setString(7, "EM ABERTO");
            pst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR ! /nERRO:" + ex);
        }
    }

}
