package com.company;

public class Butik extends Ejendom{
    protected int butiksareal;

    public Butik(int beboelsesareal, double pris, int butiksareal) {
        super(beboelsesareal, pris);
        this.butiksareal = butiksareal;
    }

    @Override
    public void prisPrKvm() {
        System.out.println("Butik:");
        double prisPrKvm = pris/(beboelsesareal + butiksareal);
        System.out.println("Pris pr kvadratmeter: " + prisPrKvm + "\n");
    }
}
