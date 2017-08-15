/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloClientes;

/**
 *
 * @author Lucas
 */
public class ControleClientes {

    Conectabanco conex = new Conectabanco();
    ModeloClientes modCli = new ModeloClientes();
    int codCidade;
    String Cidade;

    /**
     *
     * @param mod
     */
    public void inserir(ModeloClientes mod) {
        buscaCod(mod.getCidade());
        conex.conexao();

        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into clientes (nome_cliente,endereco_cliente,rg_cliente,cpf_cliente,cnpj_cliente,inscricao_cliente, "
                    + "nome_bairro,numero_tel,mail_cliente,id_cidade,fantasia_cliente,cep_cliente,obs_cliente)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            pst.setString(5, mod.getCnpj());
            pst.setString(6, mod.getIe());
            pst.setString(7, mod.getBairro());
            pst.setString(8, mod.getTelefone());
            pst.setString(9, mod.getMail());
            pst.setInt(10, codCidade);
            pst.setString(11, mod.getNomeFantasia());
            pst.setString(12, mod.getCep());
            pst.setString(13, mod.getObs());
            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS INSERIDOS COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR ! \nERRO:" + ex);
        }
        conex.desconecta();
    }

    public void alterar(ModeloClientes mod) {
        buscaCod(mod.getCidade());
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("update clientes set nome_cliente=?,endereco_cliente=?,rg_cliente=?,cpf_cliente=?,cnpj_cliente=?,inscricao_cliente=?,nome_bairro=?,numero_tel=?,mail_cliente=?,id_cidade=?,fantasia_cliente=?,cep_cliente=?,obs_cliente=? where id_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            pst.setString(5, mod.getCnpj());
            pst.setString(6, mod.getIe());
            pst.setString(7, mod.getBairro());
            pst.setString(8, mod.getTelefone());
            pst.setString(9, mod.getMail());
            pst.setInt(10, codCidade);
            pst.setString(11, mod.getNomeFantasia());
            pst.setString(12, mod.getCep());
            pst.setString(13, mod.getObs());
            pst.setInt(14, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR \nERRO" + ex);
        }
        conex.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void excluir(ModeloClientes mod) {
        conex.conexao();
        try {

            //exclui dados da tabela cliente
            PreparedStatement pst = conex.conn.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS EXCLUIDOS!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR !\nERRO :" + ex);
        }
        conex.desconecta();
    }


    private void buscaCod(String Cidade) {
        conex.conexao();
        try {
            conex.executaSQL("select * from cidade where nome_cidade ='" + Cidade + "'");
            conex.rs.first();
            codCidade = conex.rs.getInt("id_cidade");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar codigo da cidade !\n" + ex);
        }
        conex.desconecta();
    }

    public ModeloClientes buscaCadastro(ModeloClientes modelo) {
        conex.conexao();
        conex.executaSQL("select * from clientes inner join cidade on clientes.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where nome_cliente like '%" + modelo.getBusca() + "%'");
        try {

            conex.rs.first();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setIe(conex.rs.getString("inscricao_cliente"));
            modCli.setCnpj(conex.rs.getString("cnpj_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setEstado(conex.rs.getString("sigla_estado"));
            modCli.setCidade(conex.rs.getString("nome_cidade"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setTelefone(conex.rs.getString("numero_tel"));
            modCli.setMail(conex.rs.getString("mail_cliente"));
            modCli.setNomeFantasia(conex.rs.getString("fantasia_cliente"));
            modCli.setCep(conex.rs.getString("cep_cliente"));
            modCli.setObs(conex.rs.getString("obs_cliente"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conex.desconecta();
        return modCli;

    }

    public ModeloClientes buscaCadastroCNPJ(ModeloClientes modelo) {
        conex.conexao();
        conex.executaSQL("select * from clientes inner join cidade on clientes.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where cnpj_cliente like '%" + modelo.getBusca() + "%'");
        try {

            conex.rs.first();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setIe(conex.rs.getString("inscricao_cliente"));
            modCli.setCnpj(conex.rs.getString("cnpj_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setEstado(conex.rs.getString("sigla_estado"));
            modCli.setCidade(conex.rs.getString("nome_cidade"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setTelefone(conex.rs.getString("numero_tel"));
            modCli.setMail(conex.rs.getString("mail_cliente"));
            modCli.setNomeFantasia(conex.rs.getString("fantasia_cliente"));
            modCli.setCep(conex.rs.getString("cep_cliente"));
            modCli.setObs(conex.rs.getString("obs_cliente"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conex.desconecta();
        return modCli;
    }

    public ModeloClientes buscaIdCadastro(ModeloClientes modelo) {
        conex.conexao();
        conex.executaSQL("select * from clientes inner join cidade on clientes.id_cidade=cidade.id_cidade inner join estados on cidade.id_estado=estados.id_estado where id_cliente ::text like '%" +modelo.getBusca()+"'");
        try {
            conex.rs.first();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setIe(conex.rs.getString("inscricao_cliente"));
            modCli.setCnpj(conex.rs.getString("cnpj_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setEstado(conex.rs.getString("sigla_estado"));
            modCli.setCidade(conex.rs.getString("nome_cidade"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setTelefone(conex.rs.getString("numero_tel"));
            modCli.setMail(conex.rs.getString("mail_cliente"));
            modCli.setNomeFantasia(conex.rs.getString("fantasia_cliente"));
            modCli.setCep(conex.rs.getString("cep_cliente"));
            modCli.setObs(conex.rs.getString("obs_cliente"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conex.desconecta();
        return modCli;

    }

}
