package Week2_Tutorial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    int height;
    int width;

    public Rectangle(){
        this.getHeight();
        this.getWidth();
    }

    public void getWidth() {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Please enter Width: ");
        width = kboard.nextInt();
    }

    public void getHeight() {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Please enter Height: ");
        height = kboard.nextInt();
    }

    public int calculateArea(int width, int height){
        int area;
        area = width*height;
        return (area);
    }

    public boolean isSquare(int width, int height){
        boolean square;
        if(width==height){
            square=true;
        } else {
            square = false;
        }
        return(square);
    }

    public void displayAll(){
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Area: "+calculateArea(width, height));
        System.out.println("Is it a square: "+isSquare(width,height));
    }
/*
    public static void main(String[] args) {
        // write your code here
        Rectangle rectangle = new Rectangle();
        rectangle.displayAll();
    }
 */
}
