package com.barang;

public class Barang {

    String idProduk;
    String nama;
    Double harga;


    public Barang(String idProduk, String nama, Double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Barang(String idProduk, String nama) {
        this(idProduk, nama, null);
    }

    public static void main(String[] args) {
        Barang barang1 = new Barang("BRG-001", "Tas Guci");
        barang1.setHarga(1200d);
        System.out.println(barang1);

        Barang barang2 = new Barang("BRG-002", "Printer Epson L355");
        barang2.setHarga(200d);
        System.out.println(barang2);


        Barang barang3 = new Barang("BRG-003", "Koper", 150d);
        System.out.println(barang3);

        Barang barang4 = new Barang("BRG-004", "Helm", 20d);
        System.out.println(barang4);

        System.out.println("Total harga = " + (barang1.getHarga() + barang3.getHarga() + barang4.getHarga()));


    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getHarga() {
        return this.harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getIdProduk() {
        return this.idProduk;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "idProduk='" + getIdProduk() + '\'' +
                ", nama='" + getNama() + '\'' +
                ", harga=" + getHarga() +
                '}';
    }
}
