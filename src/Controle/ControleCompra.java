/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloCompra;

/**
 *
 * @author Administrador
 */
public class ControleCompra {

    int codProd, codForn;

    Conectabanco conexao = new Conectabanco();

    public void adicionaItem(ModeloCompra mod) {
        achaCodProduto(mod.getIdProduto());
        conexao.conexao();

        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into itens_compra_produto(id_compra,id_produto,quantidade_produto)values (?,?,?)");
            pst.setInt(1, mod.getIdCompra());
            pst.setInt(2, codProd);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO");

            //baixa de estoque
            int quantidade = 0, result = 0;
            float custo;
            conexao.conexao();
            conexao.executaSQL("select * from produto where id_produto = '" + mod.getIdProduto());
            conexao.rs.first();
            quantidade = conexao.rs.getInt("quantidade");
            result = quantidade + mod.getQtdItem();
            custo = mod.getUnitario();
            pst = conexao.conn.prepareStatement("update produto set quantidade =?,preco_compra =? where id_produto =?");
            pst.setInt(1, result);
            pst.setFloat(2, custo);
            pst.setInt(3, mod.getIdProduto());
            pst.execute();
            //**

            conexao.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "OPERAÇÃO INVÁLIDA: PRODUTO JÁ ADICIONADO");
        }
        conexao.desconecta();
    }

    public void achaCodProduto(int cod) {
        conexao.conexao();
        conexao.executaSQL("select * from produto where id_produto =" + cod);
        try {
            conexao.rs.first();
            codProd = conexao.rs.getInt("id_produto");
            conexao.desconecta();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no achaCodProduto !" + ex);
        }
    }

    public void FechaCompra(ModeloCompra mod) {
        AchaFornecedor(mod.getNomeFornecedor());
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update compra set data_compra=?, valor_compra=?, id_fornecedor=?,nf=?,qtd_parcelas=?,forma=?,valor_parcela=? where id_compra=?");
            pst.setString(1, mod.getData());
            pst.setFloat(2, mod.getValorCompra());
            pst.setFloat(3, codForn);
            pst.setString(4, mod.getNf());
            pst.setInt(5, mod.getQtdParcelas());
            pst.setString(6, mod.getPagamento());
            pst.setString(7, mod.getValorParcela());
            pst.setInt(8, mod.getIdCompra());
            pst.execute();
            JOptionPane.showMessageDialog(null, "COMPRA FINALIZADA COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR COMPRA !  !" + ex);
        }
        conexao.desconecta();
    }

    public void AchaFornecedor(String nome) {
        conexao.conexao();
        try {
            conexao.executaSQL("select * from fornecedores where nome_fornecedor ='" + nome + "'");
            conexao.rs.first();
            codForn = conexao.rs.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR COMPRA !  !" + ex);
        }
        conexao.desconecta();

    }

    public void cancelaCompra() {
        conexao.conexao();
        PreparedStatement pst;
        conexao.executaSQL("select * from compra inner join itens_compra_produto on compra.id_compra = itens_compra_produto.id_compra "
                + "inner join produto on itens_compra_produto.id_produto = produto.id_produto where valor_compra = 0");

        try {
            conexao.rs.first();
            do {
                int qtdProd = conexao.rs.getInt("quantidade");
                int qtdComp = conexao.rs.getInt("quantidade_produto");
                int soma = qtdProd - qtdComp;
                pst = conexao.conn.prepareStatement("update produto set quantidade=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, conexao.rs.getInt("id_produto"));
                pst.execute();
                pst = conexao.conn.prepareStatement("delete from itens_compra_produto where id_compra=?");
                pst.setInt(1, conexao.rs.getInt("id_compra"));
                pst.execute();
            } while (conexao.rs.next());

            pst = conexao.conn.prepareStatement("delete from compra where valor_compra=?");
            pst.setInt(1, 0);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR COMPRA    !  !" + ex);
        }
        conexao.desconecta();

    }

}
