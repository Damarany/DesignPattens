package DesignPattens.Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        Car c1 = new Car("honda");
      director.Contructor(c1);
      Product car = c1.getproduct();
      car.show();
    }

}
