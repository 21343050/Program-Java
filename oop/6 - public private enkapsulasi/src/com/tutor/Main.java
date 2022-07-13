package com.tutor;

class Player {
    String name; //default. bs dibaca dan ditulis dari luar class
    public int exp; //public, b dibaca dan ditulis dari luar class
    private int health; //private, hanya bisa dibaca dan ditulis didalam class saja

    Player(String name, int exp, int healt) {
        this.name = name;
        this.exp = exp;
        this.health = healt;
    }

    void display() { //default modifier acces
        tambahExp(); //contoh akses private method
        System.out.println("\nName\t: " +this.name);
        System.out.println("Exp\t: " +this.exp);
        System.out.println("Health\t: " +this.health);
    }

    public void ubahNama(String nameBaru) {
        this.name = nameBaru;
    }

    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Heri", 100, 100);

        //default
        System.out.println(player1.name);
        player1.name = "Surti";
        System.out.println(player1.name);

        //exp
        System.out.println(player1.exp);
        player1.exp = 200;
        System.out.println(player1.exp);

        //private (tidak bisa diakses)
        // System.out.println(player1.health);
        // player1.health = 23;
        // System.out.println(player1.health);

        //untuk method, default
        player1.display();

        //public
        player1.ubahNama("nono");
        player1.display();

        //private (tdk bs karna diluar class)
        // player1.tambahExp();
    }
}