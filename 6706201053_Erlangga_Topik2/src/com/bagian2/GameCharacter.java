package com.bagian2;

public class GameCharacter {
    private final String name;
    private final int attackHitPoint;
    private final int attackKickPoint;
    private int lifePoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint, int lifePoint) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this(name, attackHitPoint, attackKickPoint, 100);

    }

    public String getName() {
        return this.name;
    }

    public void hit(GameCharacter karB) {
        System.out.printf("%s melakukan pukulan kepada %s\n", this.getName(), karB.getName());
        karB.lifePoint -= this.attackHitPoint;
    }

    public void kick(GameCharacter karB) {
        System.out.printf("%s melakukan tendangan kepada %s\n", this.getName(), karB.getName());
        karB.lifePoint -= this.attackKickPoint;
    }

    public int getLifePoint() {
        
        return this.lifePoint;
    }
}
