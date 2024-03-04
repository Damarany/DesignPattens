package DesignPattens.Factory;

public class MainFactory {
    public static void main(String[] args) {
        try {
            FactoryExchange exchangeFactory = new FactoryExchange();
            IExchange exchange = exchangeFactory.getExchange();
            exchange.setName("Rehab");
            exchange.addGPON("01-03-205-950");
            exchange.addGPON("01-03-205-951");
            exchange.showGPON();


            exchange.setName("Badr");
            exchange.addGPON("01-03-301-60");
            exchange.addGPON("01-03-301-62");
            exchange.showGPON();

            exchange.setName("shrouk");
            exchange.addGPON("01-03-301-60");
            exchange.addGPON("01-03-301-62");
            exchange.showGPON();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}