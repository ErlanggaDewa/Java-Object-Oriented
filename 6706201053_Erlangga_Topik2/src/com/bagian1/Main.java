package com.bagian1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);

    private static final ArrayList<Buku> books = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n\n1. Input Data");
            System.out.println("2. Cari/Ubah Data");
            System.out.println("3. Tampilkan Data/Hapus Data");
            System.out.println("4. Keluar\n\n");

            System.out.print("Masukkan pilihan: ");
            pilihan = userInput.nextInt();

            switch (pilihan) {
                case 1:
                    inputBuku();
                    break;
                case 2:
                    cariBuku();
                    break;
                case 3:
                    tampilkanBuku();
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

    private static void tampilkanBuku() {
        System.out.println("\n---- Data Buku ----");
        books.forEach(book -> {
            System.out.println("ISBN : " + book.getIsbn());
            printPerBuku(book);
            System.out.print("\n");
        });
        System.out.println("-------------------");

        hapusBuku();
    }

    private static void printPerBuku(Buku book) {
        System.out.println("Judul : " + book.getJudulBuku());
        System.out.println("Pengarang : " + book.getPengarang());
        System.out.println("Tahun terbit : " + book.getTahunTerbit());
        System.out.println("Harga : " + book.getHarga());
        System.out.println("Rating : " + book.getRating());
    }

    private static void inputBuku() {
        System.out.println("\nMasukan data");
        System.out.print("ISBN : ");

        String isbn = userInput.next();
        userInput.nextLine();

        System.out.print("Judul Buku : ");
        String judulBuku = userInput.nextLine();

        System.out.print("Pengarang : ");
        String pengarang = userInput.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahunTerbit = userInput.nextInt();

        System.out.print("Rating : ");
        float rating = userInput.nextFloat();

        System.out.print("Harga : ");
        float harga = userInput.nextFloat();

        if (cariBukuByIsbn(isbn) == null) {
            books.add(new Buku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating));
        } else {
            System.out.printf("\nBuku dengan isbn : %s, sudah terdaftar. Harap input dengan isbn yang berbeda\n", isbn);
        }

    }

    private static void cariBuku() {
        System.out.print("\nMasukan Isbn : ");
        String isbn = userInput.next();

        Buku book = cariBukuByIsbn(isbn);

        if (book != null) {
            System.out.println("---- Data Buku ----");
            printPerBuku(book);

            System.out.print("\nIngin ubah data ? (Y/N) : ");
            String pilihan = userInput.next().substring(0, 1);
            userInput.nextLine();

            if (pilihan.equalsIgnoreCase("Y")) {
                ubahBuku(book);
            }
        } else {
            System.out.printf("\nBuku dengan ISBN %s tidak ditemukan\n", isbn);
        }
    }

    private static void ubahBuku(Buku book) {
        System.out.println("Ubah data");

        System.out.print("Judul Buku Baru : ");
        book.setJudulBuku(userInput.nextLine());


        System.out.print("Pengarang Baru : ");
        book.setPengarang(userInput.nextLine());

        System.out.print("Tahun Terbit Baru : ");
        book.setTahunTerbit(userInput.nextInt());

        System.out.print("Rating Baru : ");
        book.setRating(userInput.nextFloat());

        System.out.print("Harga Baru : ");
        book.setHarga(userInput.nextFloat());

        System.out.println("Data berhasil diubah");
    }

    private static Buku cariBukuByIsbn(String isbn) {
        final Buku[] bookFound = {null};
        books.forEach(book -> {
            if (book.getIsbn().equals(isbn)) {
                bookFound[0] = book;
            }
        });
        return bookFound[0];
    }

    private static void hapusBuku() {

        System.out.print("Ingin hapus buku ? (Y/N) : ");
        String choice = userInput.next().substring(0, 1);
        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("Masukan target ISBN : ");
            String isbn = userInput.next();

            Buku book = cariBukuByIsbn(isbn);

            if (book != null) {
                books.remove(book);
                System.out.printf("Buku dengan ISBN %s berhasil dihapus\n", book.getIsbn());
            } else {
                System.out.printf("\nBuku dengan ISBN %s tidak ditemukan\n", isbn);
            }
        }
    }

}
