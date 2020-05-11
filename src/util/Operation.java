/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author anakl
 */
public class Operation implements Serializable {

    public static final int OPERATION_LOGIN = 1;
    public static final int OPERATION_INSERT_DOMAIN_OBJECT = 2;
    public static final int OPERATION_INSERT_LIST_DOMAIN_OBJECT = 3;
    public static final int OPERATION_UPDATE_DOMAIN_OBJECT = 4;
    public static final int OPERATION_DELETE_DOMAIN_OBJECT = 5;
    public static final int OPERATION_GENERATE_DOMAIN_OBJECT = 6;

    public static final int OPERATION_SEARCH_CLIENTS_WITH_CRITERIA = 7;
    public static final int OPERATION_SELECT_ALL_CLIENTS = 8;

    public static final int OPERATION_SELECT_ALL_MEDICAL_RECORDS = 9;
    public static final int OPERATION_SEARCH_MEDICAL_RECORDS_WITH_CRITERIA = 10;

    public static final int OPERATION_SELECT_ALL_PETS = 11;
    public static final int OPERATION_SEARCH_PETS_WITH_CRITERIA = 12;

    public static final int OPERATION_SEARCH_CLIENTS_PET = 13;

    public static final int OPERATION_SELECT_ALL_WORKERS = 14;
    public static final int OPERATION_SEARCH_WORKER_WITH_CRITERIA = 15;

    public static final int OPERATION_SEARCH_BILL_WITH_CRITERIA = 16; //datum od-do
    public static final int OPERATION_SELECT_ALL_BILLS = 17;

    public static final int OPERATION_SELECT_ALL_OBJECT_OF_SALE = 18; //pretraga po nazivu
    public static final int OPERATION_SEARCH_OBJECT_OF_SALE_WITH_CRITERIA = 19;

    public static final int OPERATION_SELECT_ALL_TAXES = 20;

    public static final int OPERATION_SET_STORNO_BILL = 21;
    public static final int OPERATION_SAVE_BILL_AND_BILL_ITEMS = 22;

//    public static final int OPERATION_SAVE_RADNIK = 2;
//    public static final int OPERATION_GET_ALL_RADNICI = 3;
//    public static final int OPERATION_GET_ALL_RADNICI_FILTER = 4;
//    public static final int OPERATION_UPDATE_RADNICI = 5;
//    public static final int OPERATION_SAVE_KLIJENT = 6;
//    public static final int OPERATION_SAVE_ZIVOTINJA = 7;
//    public static final int OPERATION_GET_ALL_KLIJENTI = 8;
//    public static final int OPERATION_GET_ALL_ZIVOTINJE_PO_KLIJENTU = 10;
//    public static final int OPERATION_UPDATE_ZIVOTINJA = 11;
//    public static final int OPERATION_UPDATE_KLIJENT = 12;
//    public static final int OPERATION_SAVE_KARTON = 13;
//    public static final int OPERATION_UPDATE_KARTON = 14;
//    public static final int OPERATION_GET_ALL_KARTONI = 15;
//    public static final int OPERATION_SAVE_RACUN = 16;
//    public static final int OPERATION_SAVE_STAVKA_RACUNA = 17;
//    public static final int OPERATION_GET_ALL_PREDMET_PRODAJE = 18;
//    public static final int OPERATION_GET_ALL_RACUNI = 19;
//    public static final int OPERATION_SAVE_DOMAIN_OBJECT = 20;
//    public static final int OPERATION_GET_ALL_PORESKA_STOPA = 21;
//    public static final int OPERATION_UPDATE_DOMAIN_OBJECT = 22;
//    public static final int OPERATION_INSERT_LIST_DOMAIN_OBJECT = 23;
//    public static final int OPERATION_INSERT_DOMAIN_OBJECT = 24;
//    public static final int OPERATION_SAVE_PRODUCT=3;
//    public static final int OPERATION_GET_ALL_PRODUCTS=4;
//    public static final int OPERATION_SAVE_INVOICE=5;
}
