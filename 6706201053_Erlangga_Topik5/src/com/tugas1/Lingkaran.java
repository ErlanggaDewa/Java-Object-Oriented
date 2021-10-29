package com.tugas1;

public class Lingkaran {

    public static void main(String[] args) {
        System.out.println("Luas lingkaran dengan jejari 7 = " + luasLingkaran(7f));
        System.out.println("keliling lingkaran dengan jejari 7 = " + kelilingLingkaran(7f));

        System.out.println("\nLuas lingkaran dengan jejari 5.5 = " + luasLingkaran(5.5f));
        System.out.println("\nkeliling lingkaran dengan jejari 5.5 = " + kelilingLingkaran(5.5f));

        System.out.println("\nLuas lingkaran dengan diameter 20.4 = " + luasLingkaran(20.4d));
        System.out.println("keliling lingkaran dengan diameter 20.4 = " + kelilingLingkaran(20.4d));
    }

    private static double luasLingkaran(float jejari) {
        return (Math.PI * Math.pow(jejari, 2));
    }

    private static double luasLingkaran(double diameter) {
        return (0.25 * Math.PI * Math.pow(diameter, 2));
    }

    private static double kelilingLingkaran(double diameter) {
        return (Math.PI * diameter);
    }

    private static double kelilingLingkaran(float jejari) {
        return (2 * Math.PI * jejari);
    }
}
