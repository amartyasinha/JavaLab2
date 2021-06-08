//Create a class TwoDim which contains private members as x and y coordinates in package P1.
//Define the default constructor, a parameterized constructor and override toString() method
//to display the co-ordinates. Now reuse this class and in package P2 create another class ThreeDim,
//adding a new dimension as z as its private member. Define the constructors for the subclass and
//override toString() method in the subclass also. Write appropriate methods to show dynamic method
//dispatch. The main() function should be in a package P.
package P1;

import java.util.Scanner;

public class TwoDim {
    private int x;
    private int y;

    Scanner sc = new Scanner(System.in);

    public TwoDim(){
        x = 0;
        y = 0;
    }

    public TwoDim(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void input(){
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
    }

    @Override
    public String toString(){
        return ("Coordinate x: " + x + ", y: " + y);
    }
}