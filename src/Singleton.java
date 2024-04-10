public class Singleton {
    private final Singleton singleton = new Singleton(); //  создает новый обьект

        private static final Singleton s = new Singleton();

    public static Singleton getInstance() {
        return s;

    }
}
