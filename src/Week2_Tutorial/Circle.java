package Week2_Tutorial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    DecimalFormat df = new DecimalFormat("#.##");
    double radius;

    public Circle(){
        this.getRadius();
    }

    public void getRadius(){
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter radius of the circle: ");
        radius = kboard.nextDouble();
    }

    public String calculateArea(double radius){
        double area;
        area = 2*3.14+radius;
        return df.format(area);
    }

    public void displayAll(){
        System.out.println("Radius: "+df.format(radius));
        System.out.println("Area: "+calculateArea(radius));
    }
/*
    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle();
        circle.displayAll();
    }
 */
}
