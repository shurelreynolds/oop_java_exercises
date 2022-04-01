package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    @Override
    public String getSetting() {
        return "domestic";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
