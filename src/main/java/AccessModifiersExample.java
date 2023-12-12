public class AccessModifiersExample {

    // Public static method
    public static void publicMethod() {
        System.out.println("This is a public static method");
    }

    // Private static method
    private static void privateMethod() {
        System.out.println("This is a private static method");
    }

    // Main method
    public static void main(String[] args) {
        publicMethod(); // Calling public method directly
        privateMethod(); // Cannot call private method directly from outside the class
    }
}
