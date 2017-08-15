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
public class ModeloPagamento {
   private int compra;
   private int numparcela;
   private String data;
   private String valor_compra;
   private String valor_parcela;
    private String estado;
    private String nf;

    /**
     * @return the compra
     */
    public int getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(int compra) {
        this.compra = compra;
    }

    /**
     * @return the numparcela
     */
    public int getNumparcela() {
        return numparcela;
    }

    /**
     * @param numparcela the numparcela to set
     */
    public void setNumparcela(int numparcela) {
        this.numparcela = numparcela;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valor_compra
     */
    public String getValor_compra() {
        return valor_compra;
    }

    /**
     * @param valor_compra the valor_compra to set
     */
    public void setValor_compra(String valor_compra) {
        this.valor_compra = valor_compra;
    }

    /**
     * @return the valor_parcela
     */
    public String getValor_parcela() {
        return valor_parcela;
    }

    /**
     * @param valor_parcela the valor_parcela to set
     */
    public void setValor_parcela(String valor_parcela) {
        this.valor_parcela = valor_parcela;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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
