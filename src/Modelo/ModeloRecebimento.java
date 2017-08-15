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
public class ModeloRecebimento {
    private int venda,numparcela;
    private String data;
    private String valor_venda;
    private String valor_parcela;
    private String estado;

    /**
     * @return the venda
     */
    public int getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(int venda) {
        this.venda = venda;
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
     * @return the valor_venda
     */
    public String getValor_venda() {
        return valor_venda;
    }

    /**
     * @param valor_venda the valor_venda to set
     */
    public void setValor_venda(String valor_venda) {
        this.valor_venda = valor_venda;
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
}
