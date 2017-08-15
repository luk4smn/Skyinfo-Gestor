/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloTelefone;

/**
 *
 * @author Administrador
 */
public class ControleTelefone {

    Conectabanco connex = new Conectabanco();
    ModeloTelefone mod = new ModeloTelefone();

    /**
     *
     * @param mod
     */
    public void inserir(ModeloTelefone mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("insert into telefone (numero_tel,numero_tel2,nome_tel,mail_tel,obs_tel)values (?,?,?,?,?)");
            pst.setString(1, mod.getTel());
            pst.setString(2, mod.getTel2());
            pst.setString(3, mod.getNome());
            pst.setString(4, mod.getMail());
            pst.setString(5, mod.getObs());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir \nErro !:" + ex);
        }
        connex.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void alterar(ModeloTelefone mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("update telefone set numero_tel2=?,nome_tel=?,mail_tel=?,obs_tel=?,numero_tel=?  where id_telefone=?");
            pst.setString(1, mod.getTel2());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getMail());
            pst.setString(4, mod.getObs());
            pst.setString(5, mod.getTel());
            pst.setInt(6, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alerar \nErro !:" + ex);
        }
        connex.desconecta();
    }

    /**
     *
     * @return
     */
    public ModeloTelefone primeiro() {
        connex.conexao();
        try {
            connex.rs.first();
            mod.setCod(connex.rs.getInt("id_telefone"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setNome(connex.rs.getString("nome_tel"));
            mod.setMail(connex.rs.getString("mail_tel"));
            mod.setObs(connex.rs.getString("obs_tel"));
        } catch (SQLException ex) {

        }
        connex.desconecta();
        return mod;
    }

    /**
     *
     * @return
     */
    public ModeloTelefone pprox() {
        connex.conexao();
        try {
            connex.rs.next();
            mod.setCod(connex.rs.getInt("id_telefone"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setNome(connex.rs.getString("nome_tel"));
            mod.setMail(connex.rs.getString("mail_tel"));
            mod.setObs(connex.rs.getString("obs_tel"));
        } catch (SQLException ex) {

        }
        return mod;
    }

    /**
     *
     * @return
     */
    public ModeloTelefone anterior() {
        connex.conexao();
        try {
            connex.rs.previous();
            mod.setCod(connex.rs.getInt("id_telefone"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setNome(connex.rs.getString("nome_tel"));
            mod.setMail(connex.rs.getString("mail_tel"));
            mod.setObs(connex.rs.getString("obs_tel"));
        } catch (SQLException ex) {

        }
        connex.desconecta();
        return mod;
    }

    /**
     *
     * @return
     */
    public ModeloTelefone ultimo() {
        connex.conexao();
        try {
            connex.rs.last();
            mod.setCod(connex.rs.getInt("id_telefone"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setNome(connex.rs.getString("nome_tel"));
            mod.setMail(connex.rs.getString("mail_tel"));
            mod.setObs(connex.rs.getString("obs_tel"));
        } catch (SQLException ex) {

        }
        connex.desconecta();
        return mod;
    }

    /**
     *
     * @param mod
     */
    public void excluir(ModeloTelefone mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("delete from telefone where id_telefone =?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir \nErro !:" + ex);
        }
        connex.desconecta();
    }

    public ModeloTelefone buscaCadastro(ModeloTelefone modelo) {
        connex.conexao();
        connex.executaSQL("select * from telefone where nome_tel like '%" + modelo.getBusca() + "%'");
        try {

            connex.rs.next();
            mod.setCod(connex.rs.getInt("id_telefone"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setNome(connex.rs.getString("nome_tel"));
            mod.setMail(connex.rs.getString("mail_tel"));
            mod.setObs(connex.rs.getString("obs_tel"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        connex.desconecta();
        return mod;

    }

}
