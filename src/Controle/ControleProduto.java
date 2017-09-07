/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloProduto;

/**
 *
 * @author Administrador
 */
public class ControleProduto {

    ModeloProduto mod = new ModeloProduto();
    Conectabanco conexao = new Conectabanco();
    int codForn, codUnd;

    public void salvar(ModeloProduto mod) {
        BuscaIdForncedor(mod.getFornecedor());
        BuscaIdUnidade(mod.getUnidade());
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into produto (nome_produto,preco_compra,preco_venda,quantidade,id_fornecedor,referencia,codebar,ncm,imagem,id_unidade)"
                    + "values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setFloat(2, mod.getPrecocompra());
            pst.setFloat(3, mod.getPrecovenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, codForn);
            pst.setString(6, mod.getReferencia());
            pst.setString(7, mod.getCodebar());
            pst.setString(8, mod.getNcm());
            pst.setString(9, mod.getImg());
            pst.setInt(10, codUnd);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS INSERIDOS COM SUCESSO !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOS:\n" + ex);
        }
        conexao.desconecta();
    }

    public void alterar(ModeloProduto mod) {
        BuscaIdForncedor(mod.getFornecedor());
        BuscaIdUnidade(mod.getUnidade());
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update produto set nome_produto=?,preco_compra=?,preco_venda=?,quantidade=?,id_fornecedor=?,referencia=?,codebar=?,ncm=?,imagem=?,id_unidade=? where id_produto=?");
            pst.setString(1, mod.getNome());
            pst.setFloat(2, mod.getPrecocompra());
            pst.setFloat(3, mod.getPrecovenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, codForn);
            pst.setString(6, mod.getReferencia());
            pst.setString(7, mod.getCodebar());
            pst.setString(8, mod.getNcm());
            pst.setString(9, mod.getImg());
            pst.setInt(10, codUnd);
            pst.setInt(11, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR:\n"+ex);
        }
        conexao.desconecta();
    }

    public void excluir(ModeloProduto mod) {
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("delete from produto where id_produto=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR:\n "+ex);
        }
        conexao.desconecta();
    }

    public void BuscaIdForncedor(String fornecedor) {
        conexao.conexao();
        try {
            conexao.executaSQL("select * from fornecedores where nome_fornecedor ='" + fornecedor + "'");
            conexao.rs.first();
            codForn = conexao.rs.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR FORNECEDOR\n" + ex);
        }
        conexao.desconecta();
    }

    public void BuscaIdUnidade(String unidade) {
        conexao.conexao();
        try {
            conexao.executaSQL("select * from unidades where unidade ='" + unidade + "'");
            conexao.rs.first();
            codUnd = conexao.rs.getInt("id_unidade");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR UNIDADES\n" + ex);
        }
        conexao.desconecta();
    }

    public ModeloProduto buscaNomeCadastro(ModeloProduto modelo) {
        conexao.conexao();
        conexao.executaSQL("select * from produto inner join fornecedores on produto.id_fornecedor=fornecedores.id_fornecedor "
                + "inner join unidades on produto.id_unidade = unidades.id_unidade where nome_produto like '%" + modelo.getPesquisa() + "%'");
        try {

            conexao.rs.first();
            mod.setId(conexao.rs.getInt("id_produto"));
            mod.setNome(conexao.rs.getString("nome_produto"));
            mod.setPrecocompra(conexao.rs.getFloat("preco_compra"));
            mod.setPrecovenda(conexao.rs.getFloat("preco_venda"));
            mod.setQuantidade(conexao.rs.getInt("quantidade"));
            mod.setFornecedor(conexao.rs.getString("nome_fornecedor"));
            mod.setReferencia(conexao.rs.getString("referencia"));
            mod.setCodebar(conexao.rs.getString("codebar"));
            mod.setNcm(conexao.rs.getString("ncm"));
            mod.setImg(conexao.rs.getString("imagem"));
            mod.setUnidade(conexao.rs.getString("unidade"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conexao.desconecta();
        return mod;
    }

    public ModeloProduto buscaIdCadastro(ModeloProduto modelo) {
        conexao.conexao();
        conexao.executaSQL("select * from produto inner join fornecedores on produto.id_fornecedor=fornecedores.id_fornecedor "
                + "inner join unidades on produto.id_unidade = unidades.id_unidade where id_produto ::text like '"+ modelo.getPesquisa() +"'");
        try {

            conexao.rs.first();
            mod.setId(conexao.rs.getInt("id_produto"));
            mod.setNome(conexao.rs.getString("nome_produto"));
            mod.setPrecocompra(conexao.rs.getFloat("preco_compra"));
            mod.setPrecovenda(conexao.rs.getFloat("preco_venda"));
            mod.setQuantidade(conexao.rs.getInt("quantidade"));
            mod.setFornecedor(conexao.rs.getString("nome_fornecedor"));
            mod.setReferencia(conexao.rs.getString("referencia"));
            mod.setCodebar(conexao.rs.getString("codebar"));
            mod.setNcm(conexao.rs.getString("ncm"));
            mod.setImg(conexao.rs.getString("imagem"));
            mod.setUnidade(conexao.rs.getString("unidade"));

        } catch (SQLException ex) {
           
        }
        conexao.desconecta();
        return mod;
    }

    public ModeloProduto buscaRefCadastro(ModeloProduto modelo) {
        conexao.conexao();
        conexao.executaSQL("select * from produto inner join fornecedores on produto.id_fornecedor=fornecedores.id_fornecedor "
                + "inner join unidades on produto.id_unidade = unidades.id_unidade where referencia like '%" + modelo.getPesquisa() + "%'");
        try {

            conexao.rs.first();
            mod.setId(conexao.rs.getInt("id_produto"));
            mod.setNome(conexao.rs.getString("nome_produto"));
            mod.setPrecocompra(conexao.rs.getFloat("preco_compra"));
            mod.setPrecovenda(conexao.rs.getFloat("preco_venda"));
            mod.setQuantidade(conexao.rs.getInt("quantidade"));
            mod.setFornecedor(conexao.rs.getString("nome_fornecedor"));
            mod.setReferencia(conexao.rs.getString("referencia"));
            mod.setCodebar(conexao.rs.getString("codebar"));
            mod.setNcm(conexao.rs.getString("ncm"));
            mod.setImg(conexao.rs.getString("imagem"));
            mod.setUnidade(conexao.rs.getString("unidade"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conexao.desconecta();
        return mod;
    }

    public ModeloProduto buscaBarraCadastro(ModeloProduto modelo) {
        conexao.conexao();
        conexao.executaSQL("select * from produto inner join fornecedores on produto.id_fornecedor=fornecedores.id_fornecedor "
                + "inner join unidades on produto.id_unidade = unidades.id_unidade where codebar like '%" + modelo.getPesquisa() + "%'");
        try {

            conexao.rs.first();
            mod.setId(conexao.rs.getInt("id_produto"));
            mod.setNome(conexao.rs.getString("nome_produto"));
            mod.setPrecocompra(conexao.rs.getFloat("preco_compra"));
            mod.setPrecovenda(conexao.rs.getFloat("preco_venda"));
            mod.setQuantidade(conexao.rs.getInt("quantidade"));
            mod.setFornecedor(conexao.rs.getString("nome_fornecedor"));
            mod.setReferencia(conexao.rs.getString("referencia"));
            mod.setCodebar(conexao.rs.getString("codebar"));
            mod.setNcm(conexao.rs.getString("ncm"));
            mod.setImg(conexao.rs.getString("imagem"));
            mod.setUnidade(conexao.rs.getString("unidade"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        conexao.desconecta();
        return mod;
    }

}
