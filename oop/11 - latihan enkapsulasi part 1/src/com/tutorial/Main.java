package com.tutorial;


class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    //ini adalah object member
    private Weapon weapon;
    private Armor armor;


    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 50;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 25;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void display() {
        System.out.println("Player\t\t: "+this.name);
        System.out.println("Level\t\t: "+this.level);
        System.out.println("Health\t\t: "+this.getHealth()+ "/" +this.maxHealth());
        System.out.println("BaseAttack\t: "+this.maxAttack());
        System.out.println("Alive\t\t: "+this.isAlive +"\n");
    }
    
    
    public void attack(Player opponent) {
        //hitung damage
        int damage = this.maxAttack();
        
        //print event
        System.out.println(this.name +" is attacking "+opponent.getName() +" with damage " + damage);
        
        //attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }
    
    public void defence(int damage) {

        //receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " Defence power : " +defencePower);
        
        if (damage > defencePower) {
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }

        System.out.println("Damaged Earned = " +deltaDamage +"\n");

        //adding total damage
        this.totalDamage += deltaDamage;

        //check isAlive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
    
    private int maxAttack() {
        return this.baseAttack + this.level * this.incrementAttack +this.weapon.getAddPower();
    }
    
    private void levelUp() {
        this.level++;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }
    
}

class Armor{
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

    public int getDefencePower () {
        return this.strength*2;
    }
}

class Weapon{
    private String name;
    private int strength;

    public Weapon(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public int getAddPower() {
        return this.strength*2;
    }
}


public class Main {

    public static void main(String[] args) {
        
        Player player1 = new Player("Heri");
        Armor armor1 = new Armor("Anti Quirass", 5, 100);
        Weapon weapon1 = new Weapon("Endless Battle", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Trombol");
        Armor armor2 = new Armor("Blade Armor", 3, 85);
        Weapon weapon2 = new Weapon("Blade Of Despair", 9);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player2.attack(player1);
        player1.attack(player2);
    }
}