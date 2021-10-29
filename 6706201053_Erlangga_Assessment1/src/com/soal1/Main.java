package com.soal1;

public class Main {
    public static void main(String[] args) {

        Pengiriman asuransiDropship = new Pengiriman(
                "N0001",
                "JNE",
                21000d,
                "Eiger",
                "Bandung Kopo",
                "Bejo",
                "DayeuhKolot",
                "Dropship1",
                "Surabaya",
                40000d);
        asuransiDropship.printPengiriman();

        Pengiriman asuransi = new Pengiriman(
                "N0003",
                "J&T",
                21000d,
                "Eiger",
                "Bandung Kopo",
                "Tini",
                "DayeuhKolot",
                40000d);
        asuransi.printPengiriman();

        Pengiriman normal = new Pengiriman(
                "N0004",
                "Pos Indonesia",
                23000d,
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "DayeuhKolot");
        normal.printPengiriman();

        Pengiriman dropship = new Pengiriman(
                "N0002",
                "siCepat",
                24000d,
                "Eiger",
                "Bandung Kopo",
                "Joko",
                "DayeuhKolot",
                "Dropship2",
                "Pontianak");
        dropship.printPengiriman();


    }


}

