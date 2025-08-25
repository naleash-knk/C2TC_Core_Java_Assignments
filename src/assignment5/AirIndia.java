package assignment5;

public class AirIndia extends Planes {
    
    public AirIndia(int hours, double cph) {
        super(hours, cph);  
    }
    
    @Override
    public double calculateAmount() {
        return getHours() * getCostPerHour();
    }
}
