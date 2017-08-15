/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloFornecedor;

/**
 *
 * @author Administrador
 */
public class ControleFornecedor {

    Conectabanco conn = new Conectabanco();
    ModeloFornecedor modForn = new ModeloFornecedor();
    int codCidade;

    public void salvar(ModeloFornecedor mod) {
        achaCidade(mod.getCidade());
        conn.conexao();
        try {

            PreparedStatement pst = conn.conn.prepareStatement("insert into fornecedores(nome_fornecedor,endereco,cnpj_fornecedor,id_cidade,ie_forn,tel_forn,mail_forn,bairro_forn,fantasia_forn,cep_forn,obs_forn)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getCnpj());
            pst.setInt(4, codCidade);
            pst.setString(5, mod.getIe());
            pst.setString(6, mod.getTel());
            pst.setString(7, mod.getMail());
            pst.setString(8, mod.getBairro());
            pst.setString(9, mod.getNomeFantasia());
            pst.setString(10, mod.getCep());
            pst.setString(11, mod.getObs());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir dados" + ex);
        }
        conn.desconecta();
    }

    public void achaCidade(String cidade) {
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

    public void excluir(ModeloFornecedor mod) {
        conn.conexao();
        try {
            PreparedStatement pst = conn.conn.prepareStatement("delete from fornecedores where id_fornecedor=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir ");
        }
        conn.desconecta();
    }

    public void alterar(ModeloFornecedor mod) {
        achaCidade(mod.getCidade());
        conn.conexao();
        try {
            PreparedStatement pst = conn.conn.prepareStatement("update fornecedores set nome_fornecedor=?,endereco=?,cnpj_fornecedor=?,id_cidade=?,ie_forn=?,tel_forn=?,mail_forn=?,bairro_forn=?,fantasia_forn=?,cep_forn=?,obs_forn=? where id_fornecedor=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getCnpj());
            pst.setInt(4, codCidade);
            pst.setString(5, mod.getIe());
            pst.setString(6, mod.getTel());
            pst.setString(7, mod.getMail());
            pst.setString(8, mod.getBairro());
            pst.setString(9, mod.getNomeFantasia());
            pst.setString(10, mod.getCep());
            pst.setString(11, mod.getObs());
            pst.setInt(12, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar ");
        }
        conn.desconecta();
    }

    public ModeloFornecedor buscaCadastro(ModeloFornecedor modelo) {
        conn.conexao();
        conn.executaSQL("select * from fornecedores inner join cidade on fornecedores.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where nome_fornecedor like '%" + modelo.getBusca() + "%'");
        try {

            conn.rs.first();
            modForn.setId(conn.rs.getInt("id_fornecedor"));
            modForn.setNome(conn.rs.getString("nome_fornecedor"));
            modForn.setEndereco(conn.rs.getString("endereco"));
            modForn.setIe(conn.rs.getString("ie_forn"));
            modForn.setCnpj(conn.rs.getString("cnpj_fornecedor"));
            modForn.setEstado(conn.rs.getString("sigla_estado"));
            modForn.setCidade(conn.rs.getString("nome_cidade"));
            modForn.setBairro(conn.rs.getString("bairro_forn"));
            modForn.setTel(conn.rs.getString("tel_forn"));
            modForn.setMail(conn.rs.getString("mail_forn"));
            modForn.setNomeFantasia(conn.rs.getString("fantasia_forn"));
            modForn.setCep(conn.rs.getString("cep_forn"));
            modForn.setObs(conn.rs.getString("obs_forn"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conn.desconecta();
        return modForn;

    }

    public ModeloFornecedor buscaCadastroCNPJ(ModeloFornecedor modelo) {
        conn.conexao();
        conn.executaSQL("select * from fornecedores inner join cidade on fornecedores.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where cnpj_fornecedor like '%" + modelo.getBusca() + "%'");
        try {

            conn.rs.first();
            modForn.setId(conn.rs.getInt("id_fornecedor"));
            modForn.setNome(conn.rs.getString("nome_fornecedor"));
            modForn.setEndereco(conn.rs.getString("endereco"));
            modForn.setIe(conn.rs.getString("ie_forn"));
            modForn.setCnpj(conn.rs.getString("cnpj_fornecedor"));
            modForn.setEstado(conn.rs.getString("sigla_estado"));
            modForn.setCidade(conn.rs.getString("nome_cidade"));
            modForn.setBairro(conn.rs.getString("bairro_forn"));
            modForn.setTel(conn.rs.getString("tel_forn"));
            modForn.setMail(conn.rs.getString("mail_forn"));
            modForn.setNomeFantasia(conn.rs.getString("fantasia_forn"));
            modForn.setCep(conn.rs.getString("cep_forn"));
            modForn.setObs(conn.rs.getString("obs_forn"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conn.desconecta();
        return modForn;

    }

    public ModeloFornecedor buscaIdCadastro(ModeloFornecedor modelo) {
        conn.conexao();
        conn.executaSQL("select * from fornecedores inner join cidade on fornecedores.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where id_fornecedor ::text like '%" + modelo.getBusca() + "'");
        try {

            conn.rs.first();
            modForn.setId(conn.rs.getInt("id_fornecedor"));
            modForn.setNome(conn.rs.getString("nome_fornecedor"));
            modForn.setEndereco(conn.rs.getString("endereco"));
            modForn.setIe(conn.rs.getString("ie_forn"));
            modForn.setCnpj(conn.rs.getString("cnpj_fornecedor"));
            modForn.setEstado(conn.rs.getString("sigla_estado"));
            modForn.setCidade(conn.rs.getString("nome_cidade"));
            modForn.setBairro(conn.rs.getString("bairro_forn"));
            modForn.setTel(conn.rs.getString("tel_forn"));
            modForn.setMail(conn.rs.getString("mail_forn"));
            modForn.setNomeFantasia(conn.rs.getString("fantasia_forn"));
            modForn.setCep(conn.rs.getString("cep_forn"));
            modForn.setObs(conn.rs.getString("obs_forn"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conn.desconecta();
        return modForn;

    }
}
