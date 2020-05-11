/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anakl
 */
public class Racun implements Serializable, DomainObject {

    private Long racunID;
    private BigDecimal ukupnaCenaSaPorezom;
    private BigDecimal ukupnaCenaBezPoreza;
    private BigDecimal porez;
    private boolean obradjen = false;
    private boolean storniran = false;
    private Radnik radnik;
    private Karton karton;
    private Date datumKreiranja;
    private List<StavkaRacuna> stavkeRacuna;

    public Racun() {
    }

    public Racun(Long racunID, BigDecimal ukupnaCenaSaPorezom, BigDecimal ukupnaCenaBezPoreza, BigDecimal porez, boolean obradjen, boolean storniran, Radnik radnik, Karton karton, Date datumKreiranja, List<StavkaRacuna> stavkeRacuna) {
        this.racunID = racunID;
        this.ukupnaCenaSaPorezom = ukupnaCenaSaPorezom;
        this.ukupnaCenaBezPoreza = ukupnaCenaBezPoreza;
        this.porez = porez;
        this.obradjen = obradjen;
        this.storniran = storniran;
        this.radnik = radnik;
        this.karton = karton;
        this.datumKreiranja = datumKreiranja;
        this.stavkeRacuna = stavkeRacuna;
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    public Date getDatumKreiranja() {
        return datumKreiranja;
    }

    public void setDatumKreiranja(Date datumKreiranja) {
        this.datumKreiranja = datumKreiranja;
    }

    public Long getRacunID() {
        return racunID;
    }

    public void setRacunID(Long racunID) {
        this.racunID = racunID;
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

    public BigDecimal getPorez() {
        return porez;
    }

    public void setPorez(BigDecimal porez) {
        this.porez = porez;
    }

    public boolean isObradjen() {
        return obradjen;
    }

    public void setObradjen(boolean obradjen) {
        this.obradjen = obradjen;
    }

    public boolean isStorniran() {
        return storniran;
    }

    public void setStorniran(boolean storniran) {
        this.storniran = storniran;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Karton getKarton() {
        return karton;
    }

    public void setKarton(Karton karton) {
        this.karton = karton;
    }

    @Override
    public String getTableName() {
        return "racun";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "UkupnaCenaSaPorezom, UkupnaCenaBezPoreza, Porez, Obradjen, Storniran, RadnikID, KartonID, DatumKreiranja ";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + ukupnaCenaSaPorezom + "', '" + ukupnaCenaBezPoreza + "', '" + porez + "', '" + obradjen + "'" + "', '" + storniran + "', '" + radnik.getRadnikID() + "', '" + karton.getKartonID() + "', '" + new java.sql.Date(datumKreiranja.getTime()) + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setRacunID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "UkupnaCenaSaPorezom = " + ukupnaCenaSaPorezom + " , UkupnaCenaBezPoreza= " + ukupnaCenaBezPoreza + " , Porez= " + porez + " , Obradjen =" + obradjen + " , Storniran = " + storniran + " , RadnikID = " + radnik.getRadnikID() + " , KartonID = " + karton.getKartonID() + " , DatumKreiranja = '" + new java.sql.Date(datumKreiranja.getTime()) + "'";
    }

    @Override
    public Long getObjectIDValue() {
        return racunID;
    }

    @Override
    public String getObjectIDName() {
        return "RacunID";
    }
}
