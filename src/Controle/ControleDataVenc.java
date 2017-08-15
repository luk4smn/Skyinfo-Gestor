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
 * @author Lucas
 */
public class ControleDataVenc {

    Conectabanco conn = new Conectabanco();

    public void salvardata(String data) {
        conn.conexao();
        try {
            PreparedStatement pst = conn.conn.prepareStatement("update vencimento set data_vencimento=? ");
            pst.setString(1, data);
            pst.execute();
            JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DATA !\nErro:" + ex);
        }
        conn.desconecta();
    }

}
