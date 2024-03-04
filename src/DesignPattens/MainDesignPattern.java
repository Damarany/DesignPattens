package DesignPattens;

public class MainDesignPattern {
    public static void main(String[] args) {
        Singlton c1 = Singlton.getInstance();
        System.out.println("now " + c1.getCount());
        c1.addCount();
        System.out.println("from C1: " + c1.getCount());
        Singlton c2 = Singlton.getInstance();
        c2.addCount();
        System.out.println("from C2: " + c2.getCount());




    }
}
