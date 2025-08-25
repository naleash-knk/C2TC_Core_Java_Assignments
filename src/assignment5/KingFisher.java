package assignment5;

public class KingFisher extends Planes {
    
    public KingFisher(int hours, double cph) {
        super(hours, cph);  
    }
    
    @Override
    public double calculateAmount() {
        return getHours() * getCostPerHour() * 4;
    }
}
