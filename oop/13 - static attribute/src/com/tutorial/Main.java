package com.tutorial;



class Display{
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void setType(String typeInput) {
        // type = typeInput;
        // this.type = typeInput;
        Display.type = typeInput;
    }

    void show() {
        System.out.println("Display Name : "+this.name);
    }
}

public class Main {

    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        display1.setType("Monitor");

        System.out.println("\nMenampilkan Static = ");
        System.out.println(Display.type);
        System.out.println(display1.type);
        System.out.println(display2.type);
    }
}