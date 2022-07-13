package kelasterbuka.util;

/**
 * Memasak
 */
public class Memasak {

    public static void dagingPublic() {
        System.out.println("kelas terbuka : util : public");
    }

    private static void dagingPrivate() {
        System.out.println("kelas terbuka : util : private");
    }

    static void dagingDefault() {
        System.out.println("kelas terbuka : util : default");
    }

    protected static void dagingProtected() {
        System.out.println("kelas terbuka : util : protected");
    }
}