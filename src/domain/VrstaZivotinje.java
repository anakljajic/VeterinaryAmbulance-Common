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
public enum VrstaZivotinje implements Serializable {
    Macka,
    Pas;

    @Override
    public String toString() {
        switch (this) {
            case Macka:
                return "Macka";
            case Pas:
                return "Pas";
            default:
                return "n/a";
        }
    }
}
