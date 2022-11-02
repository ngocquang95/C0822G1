package ss21_design_pattern._1_singleton_pattern;

public class Service {
    //Eager
//    private static Service instance = new Service();
//
//    private Service() {
//        System.out.println("Constructor Service");
//    }
//
//    public static Service getInstance() {
//        return instance;
//    }

    public static void test() {

    }

    //Lazy
    private static Service instance;

    private Service() {
        System.out.println("Constructor Service");
    }

    public synchronized static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

}
