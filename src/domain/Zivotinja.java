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
public class Zivotinja implements Serializable, DomainObject {

    private Long zivotinjaID;
    private String ime;
    private String vrsta;
    private String rasa;
    private String boja;
    private String pol;
    private Date datumRodjenja;
    private Klijent klijent;

    public Zivotinja() {
    }

    public Zivotinja(Long zivotinjaID, String ime, String vrsta, String rasa, String boja, String pol, Date datumRodjenja, Klijent klijent) {
        this.zivotinjaID = zivotinjaID;
        this.ime = ime;
        this.vrsta = vrsta;
        this.rasa = rasa;
        this.boja = boja;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.klijent = klijent;
    }

    public Long getZivotinjaID() {
        return zivotinjaID;
    }

    public void setZivotinjaID(Long zivotinjaID) {
        this.zivotinjaID = zivotinjaID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    @Override
    public String toString() {
        return ime;
    }

    @Override
    public String getTableName() {
        return "zivotinja";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "Ime, Rasa, Boja, Pol, DatumRodjenja, KlijentID, Vrsta";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + ime + "', '" + rasa + "', '" + boja + "', '" + pol + "', '" + new java.sql.Date(datumRodjenja.getTime()) + "', '" + klijent.getKlijentID() + "'" + ", '" + vrsta + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setZivotinjaID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "Ime = '" + ime + "', Rasa= '" + rasa + "', Boja = '" + boja + "', Pol= '" + pol + "', DatumRodjenja = '" + new java.sql.Date(datumRodjenja.getTime()) + "', KlijentID = '" + klijent.getKlijentID() + "', Vrsta = '" + vrsta + "'";
    }

    @Override
    public Long getObjectIDValue() {
        return zivotinjaID;
    }

    @Override
    public String getObjectIDName() {
        return "ZivotinjaID";
    }

}
