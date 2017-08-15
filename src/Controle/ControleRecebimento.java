/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.ModeloRecebimento;

/**
 *
 * @author Administrador
 */
public class ControleRecebimento {

    Conectabanco conex = new Conectabanco();

    public ModeloRecebimento BuscaParcela(ModeloRecebimento mod) {
        conex.conexao();
        try {
            conex.executaSQL("select * from contas_receber where id_venda =" + mod.getVenda());
            conex.rs.first();
            mod.setVenda(conex.rs.getInt("id_venda"));
            mod.setData(conex.rs.getString("data"));
            mod.setValor_parcela(conex.rs.getString("valor_parcela"));
            mod.setValor_venda(conex.rs.getString("valor_total"));
            mod.setNumparcela(conex.rs.getInt("numero_parcela"));
            mod.setEstado(conex.rs.getString("estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A BUSCA !");
        }
        conex.desconecta();
        return mod;

    }

    public ModeloRecebimento BuscaParcelaVenc(ModeloRecebimento mod) {
        conex.conexao();
        try {
            conex.executaSQL("select * from contas_receber where data ='" + mod.getData() + "'");
            conex.rs.first();
            mod.setVenda(conex.rs.getInt("id_venda"));
            mod.setData(conex.rs.getString("data"));
            mod.setValor_parcela(conex.rs.getString("valor_parcela"));
            mod.setValor_venda(conex.rs.getString("valor_total"));
            mod.setNumparcela(conex.rs.getInt("numero_parcela"));
            mod.setEstado(conex.rs.getString("estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A BUSCA !");
        }
        conex.desconecta();
        return mod;

    }

}
