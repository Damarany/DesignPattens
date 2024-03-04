package DesignPattens.Prototype;

public abstract class Person implements Cloneable {
    private String name;

    protected Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
   public Person clone(){
        try {
            return (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
