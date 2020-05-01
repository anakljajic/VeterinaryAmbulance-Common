/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author anakl
 */
public class Usluga implements Serializable {

    private PredmetProdaje predmetProdaje;
    private String naziv;

    public Usluga() {
    }

    public Usluga(PredmetProdaje predmetProdaje, String naziv) {
        this.predmetProdaje = predmetProdaje;
        this.naziv = naziv;

    }

    public PredmetProdaje getPredmetProdaje() {
        return predmetProdaje;
    }

    public void setPredmetProdaje(PredmetProdaje predmetProdaje) {
        this.predmetProdaje = predmetProdaje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

}
