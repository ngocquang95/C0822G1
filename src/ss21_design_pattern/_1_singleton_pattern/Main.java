package ss21_design_pattern._1_singleton_pattern;

public class Main {
    public static void main(String[] args) {
        Service.test();
        Service service = Service.getInstance();
        Service service2 = Service.getInstance();
        Service service3 = Service.getInstance();
        Service service4 = Service.getInstance();
        Service service5 = Service.getInstance();
        Service service6 = Service.getInstance();

        System.out.println(service == service2);
        System.out.println(service == service3);
        System.out.println(service == service4);

    }
}
