/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas
 */
public class Conectabanco {

    public Statement stm; //prepara e realiza pesquisa no BD
    public ResultSet rs; //armazena o resultado da pesquisa
    private String driver,caminho,usuario,senha;
    
    
private static final Properties config = new Properties();
private static final String arquivo = "config.ini";

  /**
     *
     */
    public Connection conn; //conecta o BD
    
    /**
     *
     */
    public void conexao(){//metodo responsável por realizar a conexao cm o BD
        try {try {
            //tentativa inicial de conexão
            config.load(new FileInputStream(arquivo));
            driver = config.getProperty("driver");
            caminho = config.getProperty("caminho");
            usuario = config.getProperty("usuario");
            senha = config.getProperty("senha");
            
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"ARQUIVO DE CONFIGURAÇÃO NÃO ENCONTRADO \n" +ex);
                Logger.getLogger(Conectabanco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn= DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão cm o BD
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO DE CONEXÃO \n" +ex);
            Logger.getLogger(Conectabanco.class.getName()).log(Level.SEVERE, null, ex);
            desconecta();
               
    }
    }
    /**
     *
     * @param sql
     */
    public void executaSQL (String sql){
        try{
        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stm.executeQuery(sql);
    } catch (SQLException ex) {
           //JOptionPane.showMessageDialog (null, "Erro de ExecutaSQL!\n Erro" +ex.getMessage());
    }
    }
    
    /**
     *
     */
    public void desconecta(){//metodo para fechar a conexao do BD
        try {
          conn.close();//fecha a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO FECHAR CONEXÃO");
            Logger.getLogger(Conectabanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
