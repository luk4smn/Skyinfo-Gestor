/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Administrador
 */
public class ModeloTitulosCompra {
    private int codCompra;
    private int numero_parcela;  
    private String forma;
    private String totalcompra;
    private String valorparcela;
    private String data_parcela;
    private String nf;

    /**
     * @return the codCompra
     */
    public int getCodCompra() {
        return codCompra;
    }

    /**
     * @param codCompra the codCompra to set
     */
    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
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

    /**
     * @return the totalcompra
     */
    public String getTotalcompra() {
        return totalcompra;
    }

    /**
     * @param totalcompra the totalcompra to set
     */
    public void setTotalcompra(String totalcompra) {
        this.totalcompra = totalcompra;
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
     * @return the nf
     */
    public String getNf() {
        return nf;
    }

    /**
     * @param nf the nf to set
     */
    public void setNf(String nf) {
        this.nf = nf;
    }
    
}
