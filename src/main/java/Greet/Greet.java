package Greet;

public class Greet {
    public static String greet(String name) {
        return greet(name, "Hello");
    }

    public static String greet(String name, String greeting) {
        return String.format("%s, %s!", greeting, name);
    }
}