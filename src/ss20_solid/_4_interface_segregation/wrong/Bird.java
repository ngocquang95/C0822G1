package ss20_solid._4_interface_segregation.wrong;

public class Bird implements Activity {
    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() { // Bị dư thừa mã nguồn => Chim không biết bơi

    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
}
