package com.bagian2;

public class Main {
    public static void main(String[] args) {
        GameCharacter karA = new GameCharacter("Raiden", 10, 20);
        GameCharacter karB = new GameCharacter("Sub-Zero", 5, 25);

        karA.kick(karB);
        karB.kick(karA);

        for (int i = 0; i < 3; i++) {
            karB.hit(karA);
        }
        for (int i = 0; i < 4; i++) {
            karA.kick(karB);
        }

        checkLifePoint(karA);
        checkLifePoint(karB);

        checkWinner(karA, karB);

    }

    private static void checkWinner(GameCharacter karA, GameCharacter karB) {
        if (karA.getLifePoint() < karB.getLifePoint()) {
            System.out.println("\n" + karB.getName() + " keluar sebagai pemenang");
        } else if (karA.getLifePoint() > karB.getLifePoint()) {
            System.out.println("\n" + karA.getName() + " keluar sebagai pemenang");
        } else {
            System.out.println("\n" + karA + " dan " + karB + " imbang");
        }
    }

    private static void checkLifePoint(GameCharacter kar) {
        System.out.printf("\nLife point %s tersisa %d\n", kar.getName(), kar.getLifePoint());
    }
}