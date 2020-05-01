/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author anakl
 */
public enum BojaZivotinja implements Serializable {
    Crna,
    Bela,
    Braon,
    Šarena,
    Žuta;

    @Override
    public String toString() {
        switch (this) {
            case Crna:
                return "Crna";
            case Bela:
                return "Bela";
            case Braon:
                return "Braon";
            case Šarena:
                return "Šarena";
            case Žuta:
                return "Žuta";
            default:
                return "n/a";
        }
    }
}
