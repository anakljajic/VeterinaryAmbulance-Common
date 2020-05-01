/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author anakl
 */
public class Klijent implements Serializable, DomainObject {

    private Long klijentID;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private String adresa;
    private String mesto;
    private String telefon;

    public Klijent() {
    }

    public Klijent(Long klijentID, String ime, String prezime, Date datumRodjenja, String adresa, String mesto, String telefon) {
        this.klijentID = klijentID;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.adresa = adresa;
        this.mesto = mesto;
        this.telefon = telefon;
    }

    public Long getKlijentID() {
        return klijentID;
    }

    public void setKlijentID(Long klijentID) {
        this.klijentID = klijentID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return ime + ", " + prezime;
    }

    @Override
    public String getTableName() {
        return "klijent";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "Ime, Prezime, DatumRodjenja, Adresa, Telefon, Mesto";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + ime + "', '" + prezime + "', '" + new java.sql.Date(datumRodjenja.getTime()) + "', '" + adresa + "', '" + telefon + "', '" + mesto + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setKlijentID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "Ime = '" + ime + "', Prezime = '" + prezime + "', DatumRodjenja = '" + new java.sql.Date(datumRodjenja.getTime()) + "', Adresa = '" + adresa + "', Telefon = '" + telefon + "', Mesto = '" + mesto + "'";
    }

    @Override
    public Long getObjectIDValue() {
        return klijentID;
    }

    @Override
    public String getObjectIDName() {
        return "KlijentID";
    }

}
