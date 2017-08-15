/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloVenda;

/**
 *
 * @author Administrador
 */
public class ControleVenda {

    int codProd, codCli;

    Conectabanco conexao = new Conectabanco();

    public void adicionaItem(ModeloVenda mod) {
        achaCodProduto(mod.getIdProduto());
        conexao.conexao();

        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into itens_venda_produto(id_venda,id_produto,quantidade_produto)values (?,?,?)");
            pst.setInt(1, mod.getIdVenda());
            pst.setInt(2, codProd);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO");

            //baixa de estoque
            int quantidade = 0, result = 0;
            conexao.conexao();
            conexao.executaSQL("select * from produto where id_produto = '" + mod.getIdProduto());
            conexao.rs.first();
            quantidade = conexao.rs.getInt("quantidade");
            result = quantidade - mod.getQtdItem();
            pst = conexao.conn.prepareStatement("update produto set quantidade =? where id_produto =?");
            pst.setInt(1, result);
            pst.setInt(2, mod.getIdProduto());
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

    public void Fechavenda(ModeloVenda mod) {
        AchaCliente(mod.getNomeCliente());
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update venda set data_venda=?, valor_venda=?, id_cliente=?,qtd_parcelas=?,forma=?,valor_parcela=? where id_venda=?");
            pst.setString(1, mod.getData());
            pst.setString(2, mod.getValorVenda());
            pst.setFloat(3, codCli);
            pst.setInt(4, mod.getQtdParcelas());
            pst.setString(5, mod.getPagamento());
            pst.setString(6, mod.getValorParcela());
            pst.setInt(7, mod.getIdVenda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "VENDA FINALIZADA COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR VENDA !  !" + ex);
        }
        conexao.desconecta();
    }

    public void AchaCliente(String nome) {
        conexao.conexao();
        try {
            conexao.executaSQL("select * from clientes where nome_cliente ='" + nome + "'");
            conexao.rs.first();
            codCli = conexao.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR VENDA !  !" + ex);
        }
        conexao.desconecta();

    }

    public void cancelaVenda() {
        conexao.conexao();
        PreparedStatement pst;
        conexao.executaSQL("select * from venda inner join itens_venda_produto on venda.id_venda = itens_venda_produto.id_venda "
                + "inner join produto on itens_venda_produto.id_produto = produto.id_produto where valor_venda = '0'");

        try {
            conexao.rs.first();
            do {
                int qtdProd = conexao.rs.getInt("quantidade");
                int qtdVend = conexao.rs.getInt("quantidade_produto");
                int soma = qtdProd + qtdVend;
                pst = conexao.conn.prepareStatement("update produto set quantidade=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, conexao.rs.getInt("id_produto"));
                pst.execute();
                pst = conexao.conn.prepareStatement("delete from itens_venda_produto where id_venda=?");
                pst.setInt(1, conexao.rs.getInt("id_venda"));
                pst.execute();
            } while (conexao.rs.next());

            pst = conexao.conn.prepareStatement("delete from venda where valor_venda=?");
            pst.setString(1, "0");
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR VENDA !  !" + ex);
        }
        conexao.desconecta();

    }

}
