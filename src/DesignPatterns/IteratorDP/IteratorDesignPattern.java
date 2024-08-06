package DesignPatterns.IteratorDP;

import java.util.*;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("dick");
        list.add("harry");
        list.add("john");

        Iterator<String> itr = list.iterator();
        System.out.println("Concreate Iterator we get is ::"+itr.toString());
        while (itr.hasNext()){
            System.out.println("Name ::"+itr.next());
        }

        Set<String> set = new HashSet<>();
        set.add("toms");
        set.add("dicks");
        set.add("harrys");

        Iterator<String> setItr = set.iterator();
        System.out.println("Concreate Iterator we get is ::"+setItr.toString());
        while (setItr.hasNext()){
            System.out.println("Name ::"+setItr.next());
        }

    }
}
