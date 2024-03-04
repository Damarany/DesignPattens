package DesignPattens.Builder;

public class Car implements IBuilder {
    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }

    @Override
    public void startOperation() {
        product.add("startOperation for: " + this.brandName);
    }

    @Override
    public void buildBody() {
        product.add("Body added");
    }

    @Override
    public void insertWheel() {
        product.add("Body added");
    }

    @Override
    public Product getproduct() {
        return product;
    }
}
