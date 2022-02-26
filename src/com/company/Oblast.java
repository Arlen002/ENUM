package com.company;

public enum  Oblast {
     OSH("Сулайман - Тоо"),
    BATKEN("Орук "),
    ZHALAL_ABAD("Сары - Челек"),
    TALAS("Манас Эстелиги"),
    NARYN("Жениш чокусу"),
    YSSYK_KOL("Ыссык - Кол"),
    CHUY("Мунара");

     private String peculiarity;

    Oblast(String peculiarity) {
        this.peculiarity = peculiarity;
    }

    public String getPeculiarity() {
        return peculiarity;
    }

    public void setPeculiarity(String peculiarity) {
        this.peculiarity = peculiarity;
    }
}
