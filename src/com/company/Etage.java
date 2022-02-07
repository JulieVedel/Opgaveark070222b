package com.company;

public class Etage extends Butik{
    private int antalEtager;

    public Etage(int beboelsesareal, double pris, int butiksareal, int antalEtager) {
        super(beboelsesareal, pris, butiksareal);
        this.antalEtager = antalEtager;
    }

    @Override
    public void prisPrKvm() {
        double prisPrKvm = pris/(beboelsesareal + butiksareal)/antalEtager;
        System.out.println("Pris pr kvadratmeter: " + prisPrKvm);
    }
}
