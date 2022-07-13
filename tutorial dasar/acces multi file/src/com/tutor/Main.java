package com.tutor;

import kelasterbuka.util.Memasak;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // ada public, private, default, dan protected

        // dengan acces modifier public, dapat diakses
        System.out.println("\n");
        Lain.methodPublic();

        // dengan acces modifier private tidak dapat diakses
        // Lain.methodPrivate();

        // karena ada dalam package yg sama, maka dapat diakses
        System.out.println("\n");
        Lain.methodDefault();

        // karena ada dalam package yg sama, maka dapat diakses
        // dan subclassnya
        System.out.println("\n");
        Lain.methodProtected();

        // dari package kelasterbuka>util
        System.out.println("\n");
        Memasak.dagingPublic();

        // gak bisa kalo private beda package
        // Memasak.dagingPrivate();

        // tidak bisa karna tidak dipackage sama
        // Memasak.dagingDefault();

        // tidak bisa karna tidak dipackage sama
        // Memasak.dagingProtected();
    }
}