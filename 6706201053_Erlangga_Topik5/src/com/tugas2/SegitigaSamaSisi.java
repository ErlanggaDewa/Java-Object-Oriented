package com.tugas2;


public class SegitigaSamaSisi {

    public SegitigaSamaSisi() {
    }

    public static double keliling(int alas, int tinggi) {
        double sisi = Math.sqrt((Math.pow((alas / 2), 2) + Math.pow(tinggi, 2)));
        return sisi * 3;
    }

    public static double keliling(int sisi) {
        return sisi * 3;
    }

    public static double luas(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double luas(int sisi) {
        double tinggi = Math.sqrt(Math.pow(sisi, 2) - Math.pow((sisi / 2), 2));
        return 0.5 * sisi * tinggi;
    }


}
