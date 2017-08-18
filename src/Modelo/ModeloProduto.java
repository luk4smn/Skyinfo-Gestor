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
public class ModeloProduto {

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    private int id;
    private int quantidade;
    private String nome;
    private float precovenda;
    private float precocompra;
    private String referencia;
    private String codebar;
    private String ncm;
    private String fornecedor;
    private String unidade;
    private String pesquisa;
    private String img;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the codebar
     */
    public String getCodebar() {
        return codebar;
    }

    /**
     * @param codebar the codebar to set
     */
    public void setCodebar(String codebar) {
        this.codebar = codebar;
    }

    /**
     * @return the ncm
     */
    public String getNcm() {
        return ncm;
    }

    /**
     * @param ncm the ncm to set
     */
    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    /**
     * @return the forneedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the precovenda
     */
    public float getPrecovenda() {
        return precovenda;
    }

    /**
     * @param precovenda the precovenda to set
     */
    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }

    /**
     * @return the precocompra
     */
    public float getPrecocompra() {
        return precocompra;
    }

    /**
     * @param precocompra the precocompra to set
     */
    public void setPrecocompra(float precocompra) {
        this.precocompra = precocompra;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

}
