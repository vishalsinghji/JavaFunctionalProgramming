package DesignPatterns.IteratorDP;

public class IteratorPattern {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("This");
        list.add("Is");
        list.add("Java");
        list.forEach(System.out::println);
    }
}
