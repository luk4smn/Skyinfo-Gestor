/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lucas
 */
public class ModeloBairro {
    private int cod;
    private String nome;
    private String cidade;
    
    /**
     *
     * @return
     */
    public int getCod(){
    return cod;
}

    /**
     *
     * @param cod
     */
    public void setCod(int cod){
     this.cod = cod;
     }

    /**
     *
     * @return
     */
    public String getNome(){
      return nome;
      }

    /**
     *
     * @param nome
     */
    public void setNome(String nome){
     this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getCidade(){
      return cidade;
      }

    /**
     *
     * @param cidade
     */
    public void setCidade(String cidade){
     this.cidade = cidade;
    }
     
}

