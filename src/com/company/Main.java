package com.company;

public class Main {

    public static void main(String[] args) {
	Villa villa1 = new Villa(75, 300000, 4);
	Butik butik1 = new Butik(40, 1000000, 160);
	Etage etage1 = new Etage(25, 1750000, 90, 4);
	villa1.prisPrKvm();
	butik1.prisPrKvm();
	etage1.prisPrKvm();
    }
}
