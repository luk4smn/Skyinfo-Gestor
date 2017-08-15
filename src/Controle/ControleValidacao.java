/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloDataVenc;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControleValidacao {

    Conectabanco conn = new Conectabanco();
    ModeloDataVenc mod = new ModeloDataVenc();
    ControleDataVenc control = new ControleDataVenc();
    int valida;

    public void valida(String codigo) {
        conn.conexao();
        conn.executaSQL("select * from vencimento");
        try {
            conn.rs.last();
            valida = Integer.parseInt(conn.rs.getString("data_vencimento"));
            valida += 1;
            int operacao = (valida + 20051994) * 4;
            int senha = Integer.parseInt(codigo);
            if (operacao == senha) {
                mod.setData(String.valueOf(valida));
                control.salvardata(mod.getData());
                JOptionPane.showMessageDialog(null, "VALIDADO COM SUCESSO\nProximo Vencimento em: " + valida);
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INVALIDO \nOperacao" + operacao + "\nCodigo:" + senha);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO VALIDAR : \n" + ex);
        }

        conn.desconecta();
    }
}
