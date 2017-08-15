package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloUsuario;

public class ControleUsuario {

    Conectabanco connex = new Conectabanco();
    ModeloUsuario mod = new ModeloUsuario();

    /**
     *
     * @param mod
     */
    public void inserir(ModeloUsuario mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("insert into login (nome,senha,permissao,numero_tel,numero_tel2,mail,login,funcao)values (?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getTel());
            pst.setString(5, mod.getTel2());
            pst.setString(6, mod.getMail());
            pst.setString(7, mod.getLogin());
            pst.setString(8, mod.getFuncao());

            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS INSERIDOS COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR \nErro !:" + ex);
        }
        connex.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void alterar(ModeloUsuario mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("update login set nome=?,senha=?,permissao=?,numero_tel=?,numero_tel2=?,mail=?,login=?,funcao=?  where id_login=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getTel());
            pst.setString(5, mod.getTel2());
            pst.setString(6, mod.getMail());
            pst.setString(7, mod.getLogin());
            pst.setString(8, mod.getFuncao());

            pst.setInt(9, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "DADOS ALTERADOS COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR \nErro !:" + ex);
        }
        connex.desconecta();
    }

    /**
     *
     * @param mod
     */
    public void excluir(ModeloUsuario mod) {
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("delete from login where id_login =?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR \nErro !:" + ex);
        }
        connex.desconecta();
    }

    public ModeloUsuario buscaCadastro(ModeloUsuario modelo) {
        connex.conexao();
        connex.executaSQL("select * from login where nome like '%" + modelo.getBusca() + "%'");
        try {
            connex.rs.first();
            mod.setCod(connex.rs.getInt("id_login"));
            mod.setNome(connex.rs.getString("nome"));
            mod.setSenha(connex.rs.getString("senha"));
            mod.setPermissao(connex.rs.getString("permissao"));
            mod.setTel(connex.rs.getString("numero_tel"));
            mod.setTel2(connex.rs.getString("numero_tel2"));
            mod.setMail(connex.rs.getString("mail"));
            mod.setLogin(connex.rs.getString("login"));
            mod.setFuncao(connex.rs.getString("funcao"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A BUSCA NÃO RETORNOU RESULTADOS !");
        }
        connex.desconecta();
        return mod;

    }
}
