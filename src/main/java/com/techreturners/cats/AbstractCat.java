package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    protected boolean sleep = false;

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public void goToSleep() {
        sleep = true;
    }

    @Override
    public void wakeUp() {
        sleep = false;
    }


    public abstract String getSetting();


    public abstract int getAverageHeight();


    public abstract String eat();
}
