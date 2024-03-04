package DesignPattens.Builder;

public class Director {
    IBuilder builder;
    public void Contructor(IBuilder builder){
        this.builder = builder;
        builder.startOperation();
        builder.buildBody();
        builder.insertWheel();
        builder.getproduct();
    }
}
