package com.soal2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ShowroomJaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n--------------------------------");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Lihat Stok");
            System.out.println("3. Beli Mobil");
            System.out.println("4. Display Info");
            System.out.println("5. Keluar");
            System.out.print("Masukan pilihan : ");
            pilihan = userInput.nextInt();
            System.out.println("\n--------------------------------");
            userInput.nextLine();
            switch (pilihan) {
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    viewStok();
                    break;
                case 3:
                    beliMobil();
                    break;
                case 4:
                    detailMobil();
                    break;
                case 5:
                    System.out.println("Program Selesai");
                    break;
            }
        } while (pilihan != 5);
    }

    private static void tambahMobil() {
        System.out.println("\nMasukan data mobil");
        System.out.print("Merek : ");
        String merk = userInput.nextLine();


        System.out.print("Harga : ");
        double harga = userInput.nextDouble();

        System.out.print("Tahun Keluaran : ");
        String tahunKeluaran = userInput.next();

        System.out.print("Jumlah stok : ");
        int stok = userInput.nextInt();
        userInput.nextLine();

        arrMobil.add(new Mobil(merk, harga, tahunKeluaran, stok));
    }

    private static void beliMobil() {
        System.out.println("Showroom Mobil Jaya - Penjualan");
        System.out.println("INPUT");
        System.out.print("Merek : ");
        String merk = userInput.nextLine();

        System.out.print("Tahun Keluaran : ");
        String tahunKeluaran = userInput.next();

        System.out.print("Jumlah : ");
        int jumlahBeli = userInput.nextInt();


        for (Mobil mobil : arrMobil) {
            if (mobil.getMerk().equalsIgnoreCase(merk) && mobil.getTahunKeluaran().equalsIgnoreCase(tahunKeluaran)) {
                printInfoBeli(mobil, jumlahBeli);
                return;
            }
        }

        System.out.println("Maaf mobil yang anda beli tidak ditemukan");
    }

    private static void printInfoBeli(Mobil mobil, int jumlahBeli) {
        double jumlahDiskon = 0;

        if (jumlahBeli == 2) jumlahDiskon = 10;
        else if (jumlahBeli > 2) jumlahDiskon = 20;

        double totalHarga = mobil.getHarga() * jumlahBeli;
        double totalDiskon = totalHarga * (jumlahDiskon / 100);
        double totalBayar = totalHarga - totalDiskon;

        if (jumlahBeli <= mobil.getStok()) {
            System.out.println("\nOUTPUT");
            System.out.println("Merek : " + mobil.getMerk());
            System.out.printf("Harga Satuan : %.1f\n", mobil.getHarga());
            System.out.println("Tahun Keluaran :" + mobil.getTahunKeluaran());
            System.out.println("Jumlah Beli : " + jumlahBeli);
            System.out.printf("Total Harga : %.1f\n", totalHarga);
            System.out.printf("Diskon : %.1f persen\n", jumlahDiskon);
            System.out.printf("Total Diskon : %.1f\n", totalDiskon);
            System.out.printf("Total Bayar : %.1f\n", totalBayar);

            mobil.setStok(mobil.getStok() - jumlahBeli);
        } else {
            System.out.println("\nMaaf, Jumlah Stok Tidak Mencukupi");
        }

    }

    private static void viewStok() {
        System.out.println("\nInformasi Mobil :\n");
        arrMobil.forEach(mobil -> {
            System.out.println("Merek : " + mobil.getMerk());
            System.out.printf("Harga : %.1f\n", mobil.getHarga());
            System.out.println("Tahun Keluaran :" + mobil.getTahunKeluaran());
            System.out.println("Sisa Stok : " + mobil.getStok() + "\n");
        });
    }

    public static void detailMobil() {
        System.out.println("\nDetail Mobil : ");

        AtomicInteger index = new AtomicInteger(1);
        arrMobil.forEach(mobil -> System.out.println(index.getAndIncrement() + ". " + mobil.getMerk() + " - " + mobil.getTahunKeluaran()));

        System.out.print("\nMasukan nomor yang anda pilih : ");
        index.set(userInput.nextInt() - 1);

        arrMobil.get(index.get()).displayInfo();
    }
}
