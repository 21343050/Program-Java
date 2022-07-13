package com.tutorial;


class Player {
    String name; //default, dia akan bisa dibaca dan ditulis
    public int exp; //public, dia akan bisa dibaca dan ditulis
    private int health; //private, hanya bisa dibaca dan ditulis didalam class saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    //default modifier accses
    void display() {
        tambahExp();
        System.out.println("\nName\t: " +this.name);
        System.out.println("Exp\t: " +this.exp);
        System.out.println("Health\t: " +this.health); //membaca, tapi didalam class
    }
    
    //public
    public void ubahName(String nameBaru) {
        this.name = nameBaru;
    }

    //private
    private void tambahExp() {
        this.exp += 100;
    }
}


public class Main {

    public static void main(String[] args) {
        //default
        Player player1 = new Player("Heri", 0, 100); //membaca data
        System.out.println(player1.name);
        player1.name = "Surti"; //menulis data
        System.out.println(player1.name);
        
        //public 
        System.out.println(player1.exp);
        player1.exp = 100; //menulis data
        System.out.println(player1.exp);
        
        // //private (tidak bisa diakses)
        // System.out.println(player1.health);
        // player1.health = 200; //menulis data
        // System.out.println(player1.health);
        
        //methods

        //default
        player1.display();

        //public
        player1.ubahName("Joni");
        player1.display();

        // //private (tidak bisa diakses)
        // player1.tambahExp();
    }
}