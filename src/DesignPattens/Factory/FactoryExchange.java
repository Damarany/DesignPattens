package DesignPattens.Factory;

public class FactoryExchange implements IFactoryExchange {
    @Override
    public Exchange getExchange() {
       return new Exchange();
    }
}
