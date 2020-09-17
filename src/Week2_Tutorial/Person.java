package Week2_Tutorial;

import java.util.Scanner;

public class Person {

    String forename;
    String surname;
    String email;
    String mobile;
    int age;

    public Person(){

        /*
        forename = "Gill";
        surname = "Blue";
        email = "g.b@gmail.com";
        age = 22;
        mobile = "079854113236";
         */
        this.getForename();
        this.getSurname();
        this.getEmail();
        this.getMobile();
        this.getAge();
    }

    public Person(String forename, String surname){

    }

    public Person(String forename, String surname, int age){

    }

    public void getForename(){
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your forename");
        forename = kboard.nextLine();
    }

    public void getSurname() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your Surname");
        surname = kboard.nextLine();
    }

    public void getEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your email");
        email = kboard.nextLine();
    }

    public void getAge() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your Age");
        age = kboard.nextInt();
        while (checkAge(age)!=true){
            System.out.println("Sorry you must be over 18");
            System.out.print("Please enter age: ");
            age = kboard.nextInt();
        }
    }

    public void getMobile() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your Mobile");
        mobile = kboard.nextLine();
    }

    public void displayPerson(){
        System.out.println("Name  : "+forename+" "+surname);
        System.out.println("Email : "+email);
        System.out.println("Mobile: "+mobile);
        System.out.println("Age   : "+age);
    }

    private boolean checkAge(int age){
        boolean OK = true;
        if(age<18){
            OK = false;
        } else {
            OK = true;
        }
        return (OK);
    }
/*
    public static void main(String[] args) {
        // write your code here
        Person person = new Person();
        person.displayPerson();
    }
 */
}
