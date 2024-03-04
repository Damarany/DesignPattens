package DesignPattens.Factory;

import java.util.ArrayList;

public  class Exchange implements IExchange{
    private String Exchangename;
    private ArrayList<String> GponName;

    public Exchange(){

    }
    @Override
    public void setName(String name) {
        this.Exchangename = name;
        this.GponName = new ArrayList<>();
    }

    @Override
    public void addGPON(String newGPON) {
        GponName.add(newGPON);
    }
    public void showGPON(){
        System.out.println(Exchangename + ":");
        for (String newGPON:GponName) {
            System.out.println( newGPON);
        }
    }
}
