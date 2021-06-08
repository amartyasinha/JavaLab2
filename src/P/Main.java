//Create a class TwoDim which contains private members as x and y coordinates in package P1.
//Define the default constructor, a parameterized constructor and override toString() method
//to display the co-ordinates. Now reuse this class and in package P2 create another class ThreeDim,
//adding a new dimension as z as its private member. Define the constructors for the subclass and
//override toString() method in the subclass also. Write appropriate methods to show dynamic method
//dispatch. The main() function should be in a package P.
package P;

import P1.TwoDim;
import P2.ThreeDim;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TwoDim ref;

        int choice;
        char repeat;

        do{
            System.out.println("Select Option");
            System.out.println("1. TwoDim Default Constructor");
            System.out.println("2. ThreeDim Default Constructor");
            System.out.println("3. TwoDim Parameterized Constructor");
            System.out.println("4. ThreeDim Parameterized Constructor");
            System.out.println("5. User Input TwoDim");
            System.out.println("6. User Input ThreeDim");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> {
                    ref = new TwoDim();
                    System.out.println(ref);
                }

                case 2 -> {
                    ref = new ThreeDim();
                    System.out.println(ref);
                }

                case 3 -> {
                    ref = new TwoDim(2, 3);
                    System.out.println(ref);
                }

                case 4 -> {
                    ref = new ThreeDim(1, 5, 9);
                    System.out.println(ref);
                }

                case 5 -> {
                    ref = new TwoDim();
                    ref.input();
                    System.out.println(ref);
                }

                case 6 -> {
                    ref = new ThreeDim();
                    ((ThreeDim) ref).input();
                    System.out.println(ref);
                }

                default -> System.out.println("Wrong Choice!");
            }
            System.out.print("Do you want to Return to Main Menu? Y/N: ");
            repeat = sc.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');
    }
}