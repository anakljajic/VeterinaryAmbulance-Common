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
public enum RasaPsa implements Serializable {
    Domaci,
    Labrador,
    Mops,
    Samojed;

    @Override
    public String toString() {
        switch (this) {
            case Domaci:
                return "Domaci";
            case Labrador:
                return "Labrador";
            case Mops:
                return "Mops";
            case Samojed:
                return "Samojed";
            default:
                return "n/a";
        }
    }
}
