package DesignPattens.Builder;

import java.util.ArrayList;

public class Product {
    private ArrayList<String> parts ;

    public Product() {
        this.parts = new ArrayList<>();
    }
    public void add(String part){
        parts.add(part);
    }


    public void show() {
        for (String part:parts) {
            System.out.println(part);
        }

    }
}
