package ss7_abstract_interface;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//
//        cat.tiengKeu();
//        cat.eat();
//        Flyable.fly2();
//
//        Flyable flyable = new Bird();
//        flyable.flyDefault();

        Animal animal = new Bird();
        ((Flyable)animal).fly();

        //compile => Lúc viết code => Kiểu dữ liệu
        //runtime => Lúc chạy chương trình => Kiểu dữ liệu tham chiếu tới
    }
}
