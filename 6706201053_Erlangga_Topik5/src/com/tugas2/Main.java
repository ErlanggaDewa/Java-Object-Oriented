package com.tugas2;

import java.util.Scanner;

public class Main {
    private static Scanner userInput = new Scanner(System.in);

    private static SegitigaSamaSisi segitiga;

    public static void main(String[] args) {

        int pilihan;
        do {
            System.out.println("\n--------------------------------");
            System.out.println("1. Input data alas dan tinggi : ");
            System.out.println("2. Input data alas atau sisi : ");
            System.out.println("3. keluar");
            System.out.print("Masukan pilihan : ");
            pilihan = userInput.nextInt();
            switch (pilihan) {
                case 1:
                    inputAlasTinggi();
                    break;
                case 2:
                    inputSisi();
                    break;
                case 3:
                    System.out.println("Program Selesai");
                    break;
            }
        } while (pilihan != 3);
    }

    private static void inputAlasTinggi() {
        System.out.print("Masukan alas : ");
        int alas = userInput.nextInt();
        System.out.print("Masukan tinggi : ");
        int tinggi = userInput.nextInt();

        segitiga = new SegitigaSamaSisi();

        System.out.println("\nKeliling = " + segitiga.keliling(alas, tinggi));
        System.out.println("Luas = " + segitiga.luas(alas, tinggi));
    }

    private static void inputSisi() {
        System.out.print("Masukan sisi : ");
        int sisi = userInput.nextInt();

        segitiga = new SegitigaSamaSisi();

        System.out.println("\nKeliling = " + segitiga.keliling(sisi));
        System.out.println("Luas = " + segitiga.luas(sisi));
    }
}
