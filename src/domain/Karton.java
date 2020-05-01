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
public class Karton implements Serializable, DomainObject {

    private Long kartonID;
    private Date datumKreiranja;
    private String napomena;
    private Radnik radnik;
    private Zivotinja zivotinja;

    public Karton() {
    }

    public Karton(Long kartonID, Date datumKreiranja, String napomena, Radnik radnik, Zivotinja zivotinja) {
        this.kartonID = kartonID;
        this.datumKreiranja = datumKreiranja;
        this.napomena = napomena;
        this.radnik = radnik;
        this.zivotinja = zivotinja;
    }

    public Long getKartonID() {
        return kartonID;
    }

    public void setKartonID(Long kartonID) {
        this.kartonID = kartonID;
    }

    public Date getDatumKreiranja() {
        return datumKreiranja;
    }

    public void setDatumKreiranja(Date datumKreiranja) {
        this.datumKreiranja = datumKreiranja;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Zivotinja getZivotinja() {
        return zivotinja;
    }

    public void setZivotinja(Zivotinja zivotinja) {
        this.zivotinja = zivotinja;
    }

    @Override
    public String getTableName() {
        return "karton";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "DatumKreiranja, Napomena, RadnikID, ZivotinjaID";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + new java.sql.Date(datumKreiranja.getTime()) + "', '" + napomena + "', '" + radnik.getRadnikID() + "', '" + zivotinja.getZivotinjaID() + "'";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setKartonID(id);
    }

    @Override
    public String getAttributeNamesForUpdate() {
        return "DatumKreiranja = '" + new java.sql.Date(datumKreiranja.getTime()) + "', Napomena= '" + napomena + "', RadnikID = '" + radnik.getRadnikID() + "', ZivotinjaID = '" + zivotinja.getZivotinjaID() + "' ";
    }

    @Override
    public Long getObjectIDValue() {
        return kartonID;
    }

    @Override
    public String getObjectIDName() {
        return "KartonID";
    }

}
