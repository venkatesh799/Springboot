package org.example;


public class Dev {
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;

    public Dev() {
        System.out.println("Dev constructor");
    }
    public void build() {
        System.out.println("Working on awesome projects");
        com.compile();
    }
}
