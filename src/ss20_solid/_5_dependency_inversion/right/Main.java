package ss20_solid._5_dependency_inversion.right;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Cường", 5.2, new LaptopDell());
        Student student2 = new Student(2, "Cường", 5.2, new LaptopMacbook());

        double score = 10; // điểm = 10
        double score2 = 0; // điểm = 0

        Double score3 = null;//
    }
}
