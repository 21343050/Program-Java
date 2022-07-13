package com.tutor;

class Player {
    String name;
    double health;

    //objek
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void pakaiWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    void pakaiArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nNama    : " + this.name);
        System.out.println("Health  : " + this.health+" hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon {
    String name;
    double damage;

    Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    void display() {
        System.out.println("Nama Senjata: " + this.name+ " , Damage: "+this.damage);
    }
}

class Armor {
    String name;
    double deff;

    Armor(String name, double deff) {
        this.name = name;
        this.deff = deff;
    }

    void display() {
        System.out.println("Nama Armor: " + this.name+ ", Defence: "+this.deff);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Heri Ramadhan", 100);
        Player player2 = new Player("Septian Dani", 80);

        Weapon Sword = new Weapon("Iron Sword", 80);
        Weapon Silver = new Weapon("Iron Silver", 77);

        Armor Iron = new Armor("Iron Armor", 79);
        Armor Leather = new Armor("Leather Armor", 71);

        player1.pakaiWeapon(Sword);
        player1.pakaiArmor(Iron);
        player1.display();

        player2.pakaiWeapon(Silver);
        player2.pakaiArmor(Leather);
        player2.display();
    }
}
