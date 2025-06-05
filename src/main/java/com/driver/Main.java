package com.driver;


public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // obj.name = "Hemanth"; // ❌ Not allowed

        // ✅ Set using setter
        obj.setName("Hemanth");

        // ✅ Get using getter
        System.out.println(obj.getName()); // Output: Hemanth
    }
}
