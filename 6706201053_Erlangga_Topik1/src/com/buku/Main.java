package com.buku;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000d);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000d);

        System.out.println(buku1);
        System.out.println(buku2);
    }
}
