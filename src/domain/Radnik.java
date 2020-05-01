/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anakl
 */
public class Radnik implements Serializable, DomainObject {

    private Long radnikID;
    private String ime;
    private String prezime;
    private String korisnikoIme;
    private String lozinka;
    private Date datumRodjenja;
    private String adresa;
    private String telefon;
    private int administrator;

    public Radnik() {
    }

    public Radnik(Long radnikID, String ime, String prezime, String korisnikoIme, String lozinka, Date datumRodjenja, String adresa, String telefon, int administrator) {
        this.radnikID = radnikID;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnikoIme = korisnikoIme;
        this.lozinka = lozinka;
        this.datumRodjenja = datumRodjenja;
        this.adresa = adresa;
        this.telefon = telefon;
        this.administrator = administrator;
    }

    public String getKorisnikoIme() {
        return korisnikoIme;
    }

    public void setKorisnikoIme(String korisnikoIme) {
        this.korisnikoIme = korisnikoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Long getRadnikID() {
        return radnikID;
    }

    public void setRadnikID(Long radnikID) {
        this.radnikID = radnikID;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String getTableName() {
        return "radnik";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "Ime, Prezime, DatumRodjenja, Adresa, Telefon, Administrator, KorisnickoIme, Lozinka";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + ime + "', '" + prezime + "', '" + new java.sql.Date(datumRodjenja.getTime()) + "', '" + adresa + "', '" + telefon + "', '" + administrator + "', '" + korisnikoIme + "', '" + lozinka + "'";

    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setRadnikID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "Ime = '" + ime + "', Prezime='" + prezime + "', DatumRodjenja='" + new java.sql.Date(datumRodjenja.getTime()) + "', Adresa='" + adresa + "', Telefon = '" + telefon + "', Administrator = '" + administrator + "', KorisnickoIme = '" + korisnikoIme + "', Lozinka = '" + lozinka + "' ";
    }

    @Override
    public Long getObjectIDValue() {
        return radnikID;
    }

    @Override
    public String getObjectIDName() {
        return "RadnikID";
    }

}
