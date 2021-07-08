package com.example.foglio.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_libro")
public class Libro {

    @Id
    @Column(name="codlibro")
    private Integer codLibro;

    @Column(name="titolo")
    private String titolo;

    @Column(name="costo")
    private float costo;

    @Column(name="genere")
    private String genere;

    @Column(name="pagine")
    private Integer pagine;

    @Column(name="codautorel")
    private Integer codAutoreL;

    @Column(name="codcasaedl")
    private Integer codCasaEdL;

    public Integer getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(Integer codLibro) {
        this.codLibro = codLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Integer getPagine() {
        return pagine;
    }

    public void setPagine(Integer pagine) {
        this.pagine = pagine;
    }

    public Integer getCodAutoreL() {
        return codAutoreL;
    }

    public void setCodAutoreL(Integer codAutoreL) {
        this.codAutoreL = codAutoreL;
    }

    public Integer getCodCasaEdL() {
        return codCasaEdL;
    }

    public void setCodCasaEdL(Integer codCasaEdL) {
        this.codCasaEdL = codCasaEdL;
    }
}
