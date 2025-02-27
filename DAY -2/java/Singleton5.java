
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is the Singleton class.");
    }

    public static void main(String[] args) {
        

        Singleton5 singleton1 = Singleton5.getInstance();
        singleton1.showMessage();

        Singleton5 singleton2 = Singleton5.getInstance();
        singleton2.showMessage();

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
