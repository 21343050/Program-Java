package com.tutor;


public class Main {
    public static void main(String[] args) {
        
        //membuat object player
        Player player1 = new Player("Heri", 100);
        Player player2 = new Player("Dani", 100);

        //membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon panah = new Weapon("panah", 10);

        //membuat object armor
        Armor bajuBesi = new Armor("baju besi", 8);
        Armor bajuKulit = new Armor("baju kulit", 4);

        //equip senjata dan armor
        System.out.println("Data Player");
        System.out.println("====================================");
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(panah);
        player2.equipArmor(bajuKulit);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("====================================");
        System.out.println("\nAttacking - 1");
        player1.attack(player2);
        player2.display();
        System.out.println("\nAttacking - 2");
        player2.attack(player1);
        player1.display();
    }
}
