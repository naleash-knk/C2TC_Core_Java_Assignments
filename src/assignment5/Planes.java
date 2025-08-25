package assignment5;

public class Planes implements Airfare {
    
    private int hours;         
    private double costPerHour; 
    
    public Planes(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public double getCostPerHour() {
        return costPerHour;
    }
    
    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }
}
