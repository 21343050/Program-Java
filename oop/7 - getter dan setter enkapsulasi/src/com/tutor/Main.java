package com.tutor;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display() {
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    //getter berupa return
    public int getIntPrivate() {
        return this.intPrivate;
    }

    //setter berupa void
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    //setter
    public void setJari2(double jari2) {
        this.diameter = jari2*2;
    }

    //getter
    public double getJari2() {
        return this.diameter/2;
    }

    //getter
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}

public class Main {

    public static void main(String[] args) {
        
        Data object = new Data();
        //public

        //read and write public
        object.intPublic = 5; //write
        System.out.println("Angka Public\t: " +object.intPublic); //read 

        //read only (bisa dengan getter)
        int angka = object.getIntPrivate();
        System.out.println("Angka Private\t: " +angka);
        
        //write only (bisa dengan setter)
        object.setDoublePrivate(0.35);
        object.display();

        //gabungkan read dan write dengan getter dan setter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari - Jari: " +object2.getJari2());
        object2.setJari2(14.3);
        System.out.println("Jari - Jari: " +object2.getJari2());
        System.out.println("Luas : "+object2.getLuas());
    }
}