//Here I will import the scanner 

import java.util.Scanner;


public class App {
    public static void main(String[] args) 
     {
        Scanner input = new Scanner(System.in);
        String name;
        String address;
        String zipCode;
        String city;
        String state;
        int unitsTaken;
        int newUnitsTaken = 0;
        double pricePerunit = 100.50;
        int twentyfourhour= 150;
        double tuition;
        double tuition1 = 0;
        double monthlypayment =0;
        double afterDiscount = 0;

        System.out.println("****Please note the current inquiry will increase student units taken by 1.*");

        System.out.println(" Please enter the student zip Code");
        zipCode =  input.nextLine();

        System.out.println("Please  enter the student state.");
        state = input.nextLine();
       

        System.out.println(" Please enter the student name.");
        name = input.nextLine();

        System.out.println("Please enter the student Address.");
        address = input.nextLine();

        System.out.println("Please enter the student city.");
        city = input.nextLine();

        System.out.println("Please enter the number of units taken.");
        unitsTaken = input.nextInt();
        newUnitsTaken = unitsTaken + 1;
        if (newUnitsTaken<=23) {
        tuition = pricePerunit *newUnitsTaken;
        monthlypayment = tuition / 12;
        } else {
        tuition = pricePerunit *newUnitsTaken;
        tuition1 = tuition - twentyfourhour;
        afterDiscount = tuition1;
        monthlypayment = afterDiscount / 12;
        }
    
        
        System.out.println();

       System.out.printf("State: ");
       System.out.println(state);
       System.out.println();
       System.out.printf("Name:  ");
       System.out.println(name);
       System.out.println();
       System.out.printf("City:  ");
       System.out.println(city);
       System.out.println();
       System.out.println("Number of Units Taken: ");
       System.out.println(newUnitsTaken);
       System.out.println();
       System.out.println("Student address: ");
       System.out.println(address);
       System.out.println();
       System.out.printf("Zip Code:  ");
       System.out.println(zipCode);
       System.out.println();
       if (newUnitsTaken<=23) { 
        System.out.println("Tuition before discount");
        System.out.print("$ ");
        System.out.printf("%.2f",tuition);
        System.out.println();
        System.out.println("Does not Qualify for Discount.");
        System.out.println();
       } else {
        System.out.println("Tuition before discount:   ");
        System.out.print("$ ");
        System.out.printf("%.2f",tuition);
        System.out.println();
        System.out.println("Tuition after discount:   ");
        System.out.print("$ ");
        System.out.printf("%.2f",afterDiscount);
        System.out.println();
       }
       System.out.println("Monthly Payment:  ");
       System.out.print("$ ");
       System.out.printf("%.2f",monthlypayment);
    }
}
