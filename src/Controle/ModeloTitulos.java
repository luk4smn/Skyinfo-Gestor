/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Administrador
 */
public class ModeloTitulos {
    private int codVenda;

    private int numero_parcela;  
    private String forma;
    private String totalvenda;
    private String valorparcela;
    private String data_parcela;

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the numero_parcela
     */
    public int getNumero_parcela() {
        return numero_parcela;
    }

    /**
     * @param numero_parcela the numero_parcela to set
     */
    public void setNumero_parcela(int numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    /**
     * @return the totalvenda
     */
    public String getTotalvenda() {
        return totalvenda;
    }

    /**
     * @param totalvenda the totalvenda to set
     */
    public void setTotalvenda(String totalvenda) {
        this.totalvenda = totalvenda;
    }

    /**
     * @return the valorparcela
     */
    public String getValorparcela() {
        return valorparcela;
    }

    /**
     * @param valorparcela the valorparcela to set
     */
    public void setValorparcela(String valorparcela) {
        this.valorparcela = valorparcela;
    }

    /**
     * @return the data_parcela
     */
    public String getData_parcela() {
        return data_parcela;
    }

    /**
     * @param data_parcela the data_parcela to set
     */
    public void setData_parcela(String data_parcela) {
        this.data_parcela = data_parcela;
    }

    /**
     * @return the forma
     */
    public String getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(String forma) {
        this.forma = forma;
    }
    
    
    
}
