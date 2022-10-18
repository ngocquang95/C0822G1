package ss7_abstract_interface;

public interface Flyable {
    // public abstract void fly2();
    void fly();

    static void fly2() {
        System.out.println("Có thể bay");
    }

    /*
    Có 100 class => Flyable
    Thêm 1 chức năng => 50class phải ghi đè lại
     */
    default void flyDefault() {
        System.out.println("Có thể bay");
    }

    //public static final int SPEED = 80;
    int SPEED = 80;
}
