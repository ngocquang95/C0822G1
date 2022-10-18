package ss7_abstract_interface;

//Generic
public class Bird extends Animal implements Flyable, Flyable2 {
    @Override
    public void tiengKeu() {
        System.out.println("Chíp chíp");
    }

    @Override
    public void fly() {
        System.out.println("Chi có thể bay");
    }

    public void flyDefault(){
        System.out.println("class Bird");
    }
}
