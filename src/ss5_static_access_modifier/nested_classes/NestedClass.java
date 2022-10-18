package ss5_static_access_modifier.nested_classes;

public class NestedClass {
    private boolean isNonStatic;

    private class InnerClass {
        public InnerClass() {
            System.out.println("Constructor InnerClass");
        }
    }

    private static boolean isStatic;

    private static class StaticNestedClass {
        public StaticNestedClass() {
            System.out.println("Constructor StaticNestedClass");
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.isNonStatic = true;


        isStatic = true;
    }
}
