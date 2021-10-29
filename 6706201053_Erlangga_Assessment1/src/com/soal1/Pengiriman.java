package com.soal1;

public class Pengiriman {
    static int noTransaksi = 0;
    String namaPenjual, alamatPenjual;
    String namaPembeli, alamatPembeli;
    String namaDropshipper, alamatDropshipper;
    String namaEkpedisi, noResi;
    boolean statusAsuransi = true, statusDropshipper = true;
    double ongkosKirim, biayaAsuransi;

    public Pengiriman(String noResi, String namaEkpedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, String namaDropshipper, String alamatDropshipper, double biayaAsuransi) {
        noTransaksi++;
        this.noResi = noResi;
        this.namaEkpedisi = namaEkpedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.biayaAsuransi = biayaAsuransi;
    }

    public Pengiriman(String noResi, String namaEkpedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, String namaDropshipper, String alamatDropshipper) {
        this(
                noResi,
                namaEkpedisi,
                ongkosKirim,
                namaPenjual,
                alamatPenjual,
                namaPembeli,
                alamatPembeli,
                namaDropshipper,
                alamatDropshipper,
                0);
        this.statusAsuransi = false;
    }

    public Pengiriman(String noResi, String namaEkpedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double biayaAsuransi) {
        this(
                noResi,
                namaEkpedisi,
                ongkosKirim,
                namaPenjual,
                alamatPenjual,
                namaPembeli,
                alamatPembeli,
                null,
                null,
                biayaAsuransi);

        this.statusDropshipper = false;
        this.statusAsuransi = true;
    }

    public Pengiriman(String noResi, String namaEkpedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli) {
        this(
                noResi,
                namaEkpedisi,
                ongkosKirim,
                namaPenjual,
                alamatPenjual,
                namaPembeli,
                alamatPembeli,
                null,
                null,
                0);
        this.statusDropshipper = false;
        this.statusAsuransi = false;
    }


    public void printPengiriman() {
        if (statusDropshipper && statusAsuransi) System.out.println("\nAsuransi dan Dropship");
        else if (statusDropshipper) System.out.println("\nDropship");
        else if (statusAsuransi) System.out.println("\nAsuransi");
        else System.out.println("\nNormal");

        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + this.noResi);
        System.out.println("Nama Ekpedisi : " + this.namaEkpedisi);
        System.out.println("Ongkos Kirim : " + (this.ongkosKirim > 20000 && this.statusAsuransi && !this.statusDropshipper ? this.ongkosKirim - 5000 : this.ongkosKirim));
        System.out.println("Nama Pengirim : " + (this.statusDropshipper ? this.namaDropshipper : this.namaPenjual));
        System.out.println("Alamat Pengirim : " + (this.statusDropshipper ? this.alamatDropshipper : this.alamatPenjual));
        System.out.println("Nama Penerima : " + this.namaPembeli);
        System.out.println("Alamat Penerima : " + this.alamatPembeli);
        if (this.statusAsuransi)
            System.out.println("Nominal Asuransi : " + this.biayaAsuransi);
    }


}
