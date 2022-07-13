package com.tutor;

import java.util.Scanner;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display() {
        System.out.println("Player\t\t: " +this.name);
        System.out.println("Level\t\t: " +this.level);
        System.out.println("Max Health\t: " +this.maxHealth());
        System.out.println("Attack\t\t: " +this.getAttackPower()+"\n");
    }

    public void levelUp() {
        System.out.println("\n++Level Up++");
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    public int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strength*10 + this.health;
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
}

public class Main {

    public static void main(String[] args) {
        //objek player1
        Player player1 = new Player("her1god");
        Armor armor1 = new Armor("Radiant Armor", 5, 100);
        Weapon weapon1 = new Weapon("Blade Of Dispair", 19);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        //objek player2
        Player player2 = new Player("Ramadhan");
        Armor armor2 = new Armor("Anti Quiras", 7, 87);
        Weapon weapon2 = new Weapon("Dagger", 15);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display(); player1.levelUp(); player1.display();
        player2.display(); player2.levelUp(); player2.display();
    }
}