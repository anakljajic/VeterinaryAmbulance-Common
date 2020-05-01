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
public enum RasaMacke implements Serializable {
    Domaca,
    Persijska,
    Sijamska,
    Savana;

    @Override
    public String toString() {
        switch (this) {
            case Domaca:
                return "Domaca";
            case Persijska:
                return "Persijska";
            case Sijamska:
                return "Sijamska";
            case Savana:
                return "Savana";
            default:
                return "n/a";
        }
    }
}
