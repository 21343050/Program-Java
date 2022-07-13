package com.tutor;

/**
 * Lain
 */
public class Lain {

    // bagian ini dapat diakses oleh siapapun
    public static void methodPublic() {
        System.out.println("Lain:Public");
        methodPrivate();
    }

    // hanya dapat diakses oleh class yg bersangkutan
    private static void methodPrivate() {
        System.out.println("Lain:Private");
    }

    // ini hanya dapat diakses diakses package yg sama
    static void methodDefault() {
        System.out.println("Lain:Default");
    }

    // ini hanya dapat diakses oleh package yg sama dan subclass nya
    protected static void methodProtected() {
        System.out.println("Lain:Protected");
    }
}