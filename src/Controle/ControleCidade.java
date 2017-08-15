/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.ModeloCidade;

/**
 *
 * @author lanmark rafael
 */
public class ControleCidade {

    Conectabanco connCidade = new Conectabanco();

    /**
     *
     * @param mod
     */
    public void InserirCidade(ModeloCidade mod) {
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("insert into cidade (nome_cidade,id_estado) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO ");
        } catch (SQLException ex) {
            Logger.getLogger(ControleCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar\n"+ex);
        }
        connCidade.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void ExcluirCidade(ModeloCidade mod) {
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("delete from cidade where id_cidade=?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir\n"+ex);
        }
        connCidade.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void AlteraCidade(ModeloCidade mod) {
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("update cidade set nome_cidade = ?, id_estado = ? where id_cidade=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.setInt(3, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS ALTERADOS COM SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR\n"+ex);
        }
        connCidade.desconecta();
    }

}
