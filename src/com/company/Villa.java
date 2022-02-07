package com.company;

public class Villa extends Ejendom{
    private int rum;

    public Villa(int beboelsesareal, double pris, int rum) {
        super(beboelsesareal, pris);
        this.rum = rum;
    }

    @Override
    public void prisPrKvm() {
        double prisPrKvm = pris/beboelsesareal;
        System.out.println("Pris pr kvadratmeter: " + prisPrKvm);
    }
}
