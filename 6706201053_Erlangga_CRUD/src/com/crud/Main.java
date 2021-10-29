package com.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Person> persons = new ArrayList<>();
    private static final Scanner userInput = new Scanner(System.in);

    private static void inputData() {
        System.out.println("\nIdentitas Baru ");
        System.out.print("Masukan nama : ");

        String nama = userInput.next();

        System.out.print("Masukan id : ");
        String id = userInput.next();

        if (cariPersonById(id) != null) {
            System.out.println("Id sudah tercatat\nSilahkan input dengan ID unik\n");
        } else {
            Person person = new Person(id, nama);
            persons.add(person);
            System.out.println("Data tersimpan\n--------------------------\n");
        }
    }

    private static void tampilkanData() {
        System.out.println("-----------------------------\nMenampilkan semua data");
        for (Person person : persons)
            System.out.println("Data: " + person.getId() + " - " + person.getNama());
        System.out.println("-----------------------------\n");
    }

    private static void cariData() {
        System.out.println("Pencarian Data");
        System.out.print("Masukan ID : ");
        String id = userInput.next();
        Person person = cariPersonById(id);
        if (person != null) {
            System.out.println("Data: " + person.getId() + " - " + person.getNama());
            System.out.print("Ubah Data ? (Y/N) :");

            if (userInput.next().equalsIgnoreCase("Y"))
                ubahData(person);

            System.out.println("Kembali ke menu utama");
        }

    }

    private static void ubahData(Person person) {
        System.out.print("Musakkan nama baru: ");
        String namaBaru = userInput.next();
        person.setNama(namaBaru);
        System.out.println("Data diubah\n");
    }

    private static Person cariPersonById(String id) {
        Person personFound = null;
        for (Person person : persons) {
            if (id.equals(person.getId()))
                personFound = person;
        }
        return personFound;
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("1. Input Data");
            System.out.println("2. Cari/Ubah Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Keluar\n\n");

            System.out.print("Masukkan pilihan: ");
            pilihan = userInput.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    cariData();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    System.out.println("Keluar aplikasi");
                    break;
                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }
        } while (pilihan != 4);

    }
}
