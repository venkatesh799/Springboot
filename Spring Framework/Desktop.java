package org.example;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop Constructor..");
    }
    public void compile() {
        System.out.println("Compiling with Desktop");
    }
}
