package Week2_Tutorial;

import java.util.Scanner;

class main {

    public static void main(String[] args) {
        int choice = 0;
        Scanner kboard = new Scanner(System.in);

        while (choice != 3) {
            System.out.println("Shape Problem");
            System.out.println("Press 1 for Rectangle, 2 for Circle, 3 to exit");
            choice = kboard.nextInt();

            if (choice==1) {
                Rectangle rectangle = new Rectangle();
                rectangle.displayAll();
            }
            if (choice==2) {
                Circle circle = new Circle();
                circle.displayAll();
            }
            if (choice==3){
                break;
            }
        }
    }
}