package com.company;

public abstract class Ejendom {
    protected int beboelsesareal;
    protected double pris;

    public Ejendom(int beboelsesareal, double pris) {
        this.beboelsesareal = beboelsesareal;
        this.pris = pris;
    }

    public abstract void prisPrKvm();
}
