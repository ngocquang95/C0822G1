package ss5_static_access_modifier._static;

public class StaticStudy {
    static int a; // Biến của class
    static {
        a = 100;
    }
    private int b;
    public void test() {
        b = 10;
    }
    public static void main(String[] args) {
        System.out.println("GIá trị của a: " + a);
//        double d = 10.0;

//        int a = InputUtil.inputPositive("a");
//        Math.sqrt(d);
//        Math.PI;
        Student s1 = new Student(1, "Nguyễn Văn A"); // s1 => Biến cục bộ
        Student s2 = new Student(2, "Nguyễn Văn B");

        System.out.println("Thông tin s1");
        System.out.println("id: " + s1.id);
        System.out.println("name: " + s1.name);
        System.out.println("class name: " + Student.className);

        System.out.println("Thông tin s2");
        System.out.println("id: " + s2.id);
        System.out.println("name: " + s2.name);
        System.out.println("class name: " + Student.className);
    }
}
