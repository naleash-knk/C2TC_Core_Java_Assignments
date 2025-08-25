package assignment5;

public class Indigo extends Planes {
    
    public Indigo(int hours, double cph) {
        super(hours, cph);  
    }
    
    @Override
    public double calculateAmount() {
        return getHours() * getCostPerHour() * 8;
    }
}
