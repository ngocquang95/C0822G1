package ss20_solid._5_dependency_inversion.wrong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Cường", 5.2, new LaptopDell());
//        Student student2 = new Student(2, "Cường", 5.2, new LaptopMacbook());
    }
}
