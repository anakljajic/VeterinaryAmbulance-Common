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
public class PredmetProdaje implements Serializable, DomainObject {

    private Long predmetProdajeID;
    private String naziv;
    private BigDecimal cenaBezPoreza;
    private BigDecimal cenaSaPorezom;
    private PoreskaStopa poreskaStopa;

    public PredmetProdaje() {
    }

    public PredmetProdaje(Long predmetProdajeID, String naziv, BigDecimal cenaBezPoreza, BigDecimal cenaSaPorezom, PoreskaStopa poreskaStopa) {
        this.predmetProdajeID = predmetProdajeID;
        this.naziv = naziv;
        this.cenaBezPoreza = cenaBezPoreza;
        this.cenaSaPorezom = cenaSaPorezom;
        this.poreskaStopa = poreskaStopa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Long getPredmetProdajeID() {
        return predmetProdajeID;
    }

    public void setPredmetProdajeID(Long predmetProdajeID) {
        this.predmetProdajeID = predmetProdajeID;
    }

    public BigDecimal getCenaBezPoreza() {
        return cenaBezPoreza;
    }

    public void setCenaBezPoreza(BigDecimal cenaBezPoreza) {
        this.cenaBezPoreza = cenaBezPoreza;
    }

    public BigDecimal getCenaSaPorezom() {
        return cenaSaPorezom;
    }

    public void setCenaSaPorezom(BigDecimal cenaSaPorezom) {
        this.cenaSaPorezom = cenaSaPorezom;
    }

    public PoreskaStopa getPoreskaStopa() {
        return poreskaStopa;
    }

    public void setPoreskaStopa(PoreskaStopa poreskaStopa) {
        this.poreskaStopa = poreskaStopa;
    }

    @Override
    public String getTableName() {
        return "predmet_prodaje";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "PredmetProdajeID, Naziv, CenaBezPoreza, CenaSaPorezom, PoreskaStopaID";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + predmetProdajeID + "', '" + naziv + "', '" + cenaBezPoreza + "', '" + cenaSaPorezom + "', '" + poreskaStopa.getPoreskaStopaID() + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setPredmetProdajeID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "Naziv = '" + naziv + "', CenaBezPoreza = '" + cenaBezPoreza + "', CenaSaPorezom = '" + cenaSaPorezom + "', PoreskaStopaID = '" + poreskaStopa.getPoreskaStopaID() + "' ";
    }

    @Override
    public Long getObjectIDValue() {
        return predmetProdajeID;
    }

    @Override
    public String getObjectIDName() {
        return "PredmetProdajeID";
    }

}
