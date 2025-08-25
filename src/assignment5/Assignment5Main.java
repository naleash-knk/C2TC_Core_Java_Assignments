package assignment5;

import java.util.Scanner;

public class Assignment5Main {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int brand = sc.nextInt();
        int hours = sc.nextInt();
        double cph = sc.nextDouble();
        
        Planes pl;
        double totalFare;
        
        switch(brand) {
            case 1:
                pl = new AirIndia(hours, cph);
                break;
            case 2:
                pl = new KingFisher(hours, cph);
                break;
            case 3:
                pl = new Indigo(hours, cph);
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }
        
        totalFare = pl.calculateAmount();
        System.out.println(totalFare);
        
        sc.close();
    }
}
