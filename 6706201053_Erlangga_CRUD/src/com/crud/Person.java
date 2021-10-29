package com.crud;

public class Person {
    private final String id;
    private String nama;

    public Person(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
