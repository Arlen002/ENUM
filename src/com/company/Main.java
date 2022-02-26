package com.company;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
    Oblast oblast = Oblast.OSH;

    switch (oblast){
        case OSH -> System.out.println(Oblast.OSH.getPeculiarity());
        case CHUY -> System.out.println(Oblast.CHUY.getPeculiarity());
        case TALAS -> System.out.println(Oblast.TALAS.getPeculiarity());
        case NARYN -> System.out.println(Oblast.NARYN.getPeculiarity());
        case BATKEN -> System.out.println(Oblast.BATKEN.getPeculiarity());
        case YSSYK_KOL -> System.out.println(Oblast.YSSYK_KOL.getPeculiarity());
        case ZHALAL_ABAD -> System.out.println(Oblast.ZHALAL_ABAD.getPeculiarity());
    }
    }
}
