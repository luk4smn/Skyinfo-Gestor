/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloPagamento;

/**
 *
 * @author Administrador
 */
public class ControlePagamento {

    Conectabanco conex = new Conectabanco();

    public ModeloPagamento BuscaParcela(ModeloPagamento mod) {
        conex.conexao();
        try {
            conex.executaSQL("select * from contas_pagar where nf_compra ='" + mod.getNf() + "'");
            conex.rs.first();
            mod.setCompra(conex.rs.getInt("id_compra"));
            mod.setNf(conex.rs.getString("nf_compra"));
            mod.setData(conex.rs.getString("data"));
            mod.setValor_parcela(conex.rs.getString("valor_parcela"));
            mod.setValor_compra(conex.rs.getString("valor_total"));
            mod.setNumparcela(conex.rs.getInt("numero_parcela"));
            mod.setEstado(conex.rs.getString("estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A BUSCA !");
        }
        conex.desconecta();
        return mod;

    }

    public ModeloPagamento BuscaParcelaVenc(ModeloPagamento mod) {
        conex.conexao();
        try {
            conex.executaSQL("select * from contas_pagar where data ='" + mod.getData() + "'");
            conex.rs.first();
            mod.setCompra(conex.rs.getInt("id_compra"));
            mod.setNf(conex.rs.getString("nf_compra"));
            mod.setData(conex.rs.getString("data"));
            mod.setValor_parcela(conex.rs.getString("valor_parcela"));
            mod.setValor_compra(conex.rs.getString("valor_total"));
            mod.setNumparcela(conex.rs.getInt("numero_parcela"));
            mod.setEstado(conex.rs.getString("estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A BUSCA !");
        }
        conex.desconecta();
        return mod;

    }

}
