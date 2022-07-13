package tutor.com;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        fungsiVoid("Assalamualaikum Warahmatullahi Wabarakatu");
        selamatPagi("Heri Ramadhan");
        System.out.println(simpel());
    }

    private static void fungsiVoid(String kata){
        System.out.println(kata);
    }

    private static void selamatPagi(String nama){
        System.out.println(nama);
    }

    private static float simpel(){
        return 10.4f;
    }
}