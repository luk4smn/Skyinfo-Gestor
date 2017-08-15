/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloRegistro;

/**
 *
 * @author Administrador
 */
public class ControleRegistro {

    Conectabanco conn = new Conectabanco();
    ModeloRegistro modReg = new ModeloRegistro();
    int codCidade;

    public void salvar(ModeloRegistro mod) {
        AchaCidade(mod.getCidade());
        conn.conexao();
        try {

            PreparedStatement pst = conn.conn.prepareStatement("insert into registro(nome,endereco,cnpj,id_cidade,ie,tel,mail,bairro) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getCnpj());
            pst.setInt(4, codCidade);
            pst.setString(5, mod.getIe());
            pst.setString(6, mod.getTel());
            pst.setString(7, mod.getMail());
            pst.setString(8, mod.getBairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados" + ex);
        }
        conn.desconecta();
    }

    public void AchaCidade(String cidade) {
        conn.conexao();
        try {
            conn.executaSQL("select * from cidade where nome_cidade ='" + cidade + "'");
            conn.rs.first();
            codCidade = conn.rs.getInt("id_cidade");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar codigo da cidade !" + ex);
        }
        conn.desconecta();
    }

    public void alterar(ModeloRegistro mod) {
        AchaCidade(mod.getCidade());
        conn.conexao();
        try {
            PreparedStatement pst = conn.conn.prepareStatement("update registro set nome=?,endereco=?,cnpj=?,id_cidade=?,ie=?,tel=?,mail=?,bairro=? where id_registro=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getCnpj());
            pst.setInt(4, codCidade);
            pst.setString(5, mod.getIe());
            pst.setString(6, mod.getTel());
            pst.setString(7, mod.getMail());
            pst.setString(8, mod.getBairro());
            pst.setInt(9, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso , Para aplicar basta reiniciar o sistema ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar " + ex);
        }
        conn.desconecta();
    }

    public ModeloRegistro Primeiro() {
        conn.conexao();
        try {
            conn.executaSQL("select * from registro inner join cidade on registro.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado");
            conn.rs.first();
            modReg.setId(conn.rs.getInt("id_registro"));
            modReg.setNome(conn.rs.getString("nome"));
            modReg.setEndereco(conn.rs.getString("endereco"));
            modReg.setIe(conn.rs.getString("ie"));
            modReg.setCnpj(conn.rs.getString("cnpj"));
            modReg.setEstado(conn.rs.getString("sigla_estado"));
            modReg.setCidade(conn.rs.getString("nome_cidade"));
            modReg.setBairro(conn.rs.getString("bairro"));
            modReg.setTel(conn.rs.getString("tel"));
            modReg.setMail(conn.rs.getString("mail"));

        } catch (SQLException ex) {
            //  JOptionPane.showMessageDialog (null,"Erro ao Setar !" +ex);

        }
        conn.desconecta();
        return modReg;

    }
}
