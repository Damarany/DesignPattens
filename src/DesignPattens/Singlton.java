package DesignPattens;

public class Singlton {
    private static Singlton instance = null;
    private int count = 0;

    private Singlton() {

    }

    public int getCount() {
         return count;
    }
    public void addCount(){
        count++;
    }
    public static Singlton getInstance(){
        if (instance == null){
            synchronized (Singlton.class){
                if (instance == null) {
                    instance = new Singlton();
                }
            }

        }
        return instance;
    }
}
