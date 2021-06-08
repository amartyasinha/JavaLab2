//Create a class TwoDim which contains private members as x and y coordinates in package P1.
//Define the default constructor, a parameterized constructor and override toString() method
//to display the co-ordinates. Now reuse this class and in package P2 create another class ThreeDim,
//adding a new dimension as z as its private member. Define the constructors for the subclass and
//override toString() method in the subclass also. Write appropriate methods to show dynamic method
//dispatch. The main() function should be in a package P.
package P2;

import P1.TwoDim;
import java.util.Scanner;

public class ThreeDim extends TwoDim{
    private int z;

    Scanner sc = new Scanner(System.in);

    public ThreeDim(){
        super(0, 0);
        z = 0;
    }

    public ThreeDim(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public void input(){
        super.input();
        System.out.print("Enter z: ");
        z = sc.nextInt();
    }

    @Override
    public String toString(){
        return (super.toString() + ", z: " + z);
    }
}