package com.tutor;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);
        
        System.out.println();
        builder.append(" Heri");
        printData(builder);

        System.out.println();
        builder.insert(5, "Selamat ");
        printData(builder);

        System.out.println();
        builder.delete(0, 4);
        printData(builder);

        System.out.println();
        builder.setCharAt(3, 'Z');
        printData(builder);

        System.out.println();
        builder.replace(0, 6, "yahaha");
        printData(builder);

        //casting menjadi string
        System.out.println();
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addresString = System.identityHashCode(kalimat);
        System.out.println("Address: " +Integer.toHexString(addresString));

        //casting menjadi builder lagi
        System.out.println();
        StringBuilder back = new StringBuilder(kalimat);
        printData(back);














    }
    public static void printData(StringBuilder dataBuilder) {
        System.out.println("Data: "+dataBuilder);
        System.out.println("Panjang: "+dataBuilder.length());
        System.out.println("Kapasitas: "+dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("Address: "+ Integer.toHexString(addressBuilder));
    }
}