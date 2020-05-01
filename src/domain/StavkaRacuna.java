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
public class StavkaRacuna implements Serializable, DomainObject {

    private Racun racun;
    private Long stavkaRacunaID;
    private int kolicina;
    private BigDecimal cenaPoJediniciSaPorezom;
    private BigDecimal cenaPoJediniciBezPoreza;
    private BigDecimal ukupnaCenaSaPorezom;
    private BigDecimal ukupnaCenaBezPoreza;
    private PredmetProdaje predmetProdaje;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Racun racun, Long stavkaRacunaID, int kolicina, BigDecimal cenaPoJediniciSaPorezom, BigDecimal cenaPoJediniciBezPoreza, BigDecimal ukupnaCenaSaPorezom, BigDecimal ukupnaCenaBezPoreza, PredmetProdaje predmetProdaje) {
        this.racun = racun;
        this.stavkaRacunaID = stavkaRacunaID;
        this.kolicina = kolicina;
        this.cenaPoJediniciSaPorezom = cenaPoJediniciSaPorezom;
        this.cenaPoJediniciBezPoreza = cenaPoJediniciBezPoreza;
        this.ukupnaCenaSaPorezom = ukupnaCenaSaPorezom;
        this.ukupnaCenaBezPoreza = ukupnaCenaBezPoreza;
        this.predmetProdaje = predmetProdaje;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public Long getStavkaRacunaID() {
        return stavkaRacunaID;
    }

    public void setStavkaRacunaID(Long stavkaRacunaID) {
        this.stavkaRacunaID = stavkaRacunaID;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getCenaPoJediniciSaPorezom() {
        return cenaPoJediniciSaPorezom;
    }

    public void setCenaPoJediniciSaPorezom(BigDecimal cenaPoJediniciSaPorezom) {
        this.cenaPoJediniciSaPorezom = cenaPoJediniciSaPorezom;
    }

    public BigDecimal getCenaPoJediniciBezPoreza() {
        return cenaPoJediniciBezPoreza;
    }

    public void setCenaPoJediniciBezPoreza(BigDecimal cenaPoJediniciBezPoreza) {
        this.cenaPoJediniciBezPoreza = cenaPoJediniciBezPoreza;
    }

    public BigDecimal getUkupnaCenaSaPorezom() {
        return ukupnaCenaSaPorezom;
    }

    public void setUkupnaCenaSaPorezom(BigDecimal ukupnaCenaSaPorezom) {
        this.ukupnaCenaSaPorezom = ukupnaCenaSaPorezom;
    }

    public BigDecimal getUkupnaCenaBezPoreza() {
        return ukupnaCenaBezPoreza;
    }

    public void setUkupnaCenaBezPoreza(BigDecimal ukupnaCenaBezPoreza) {
        this.ukupnaCenaBezPoreza = ukupnaCenaBezPoreza;
    }

    public PredmetProdaje getPredmetProdaje() {
        return predmetProdaje;
    }

    public void setPredmetProdaje(PredmetProdaje predmetProdaje) {
        this.predmetProdaje = predmetProdaje;
    }

    @Override
    public String getTableName() {
        return "stavka_racuna";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "RacunID, StavkaRacunaID, Kolicina, CenaPoJediniciSaPorezom, UkupnaCenaSaPorezom, PredmetProdajeID, CenaPoJediniciBezPoreza, UkupnaCenaBezPoreza";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + racun.getRacunID() + "', '" + stavkaRacunaID + "', '" + kolicina + "', '" + cenaPoJediniciSaPorezom +"', '" + ukupnaCenaSaPorezom + "', '" + predmetProdaje.getPredmetProdajeID() + "', '" + cenaPoJediniciBezPoreza + "', '" + ukupnaCenaBezPoreza + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return false;

    }

    @Override
    public void setObjectId(Long id) {
        setStavkaRacunaID(stavkaRacunaID);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "";
    }

    @Override
    public Long getObjectIDValue() {
        return 0l;

    }

    @Override
    public String getObjectIDName() {
        return "";
    }

}
