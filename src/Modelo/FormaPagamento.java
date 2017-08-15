/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "forma_pagamento", catalog = "bancosistema", schema = "public")
@NamedQueries({
    @NamedQuery(name = "FormaPagamento.findAll", query = "SELECT f FROM FormaPagamento f"),
    @NamedQuery(name = "FormaPagamento.findByIdFormPag", query = "SELECT f FROM FormaPagamento f WHERE f.idFormPag = :idFormPag"),
    @NamedQuery(name = "FormaPagamento.findByNomeForma", query = "SELECT f FROM FormaPagamento f WHERE f.nomeForma = :nomeForma"),
    @NamedQuery(name = "FormaPagamento.findByFatorPag", query = "SELECT f FROM FormaPagamento f WHERE f.fatorPag = :fatorPag")})
public class FormaPagamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_form_pag")
    private Integer idFormPag;
    @Column(name = "nome_forma")
    private String nomeForma;
    @Column(name = "fator_pag")
    private Integer fatorPag;

    public FormaPagamento() {
    }

    public FormaPagamento(Integer idFormPag) {
        this.idFormPag = idFormPag;
    }

    public Integer getIdFormPag() {
        return idFormPag;
    }

    public void setIdFormPag(Integer idFormPag) {
        Integer oldIdFormPag = this.idFormPag;
        this.idFormPag = idFormPag;
        changeSupport.firePropertyChange("idFormPag", oldIdFormPag, idFormPag);
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        String oldNomeForma = this.nomeForma;
        this.nomeForma = nomeForma;
        changeSupport.firePropertyChange("nomeForma", oldNomeForma, nomeForma);
    }

    public Integer getFatorPag() {
        return fatorPag;
    }

    public void setFatorPag(Integer fatorPag) {
        Integer oldFatorPag = this.fatorPag;
        this.fatorPag = fatorPag;
        changeSupport.firePropertyChange("fatorPag", oldFatorPag, fatorPag);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormPag != null ? idFormPag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaPagamento)) {
            return false;
        }
        FormaPagamento other = (FormaPagamento) object;
        if ((this.idFormPag == null && other.idFormPag != null) || (this.idFormPag != null && !this.idFormPag.equals(other.idFormPag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.FormaPagamento[ idFormPag=" + idFormPag + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
