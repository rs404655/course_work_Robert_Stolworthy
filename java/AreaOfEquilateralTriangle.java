// Java Program to find Area of Equilateral Triangle

package Area;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	private static Scanner sc;

	public static void main(String[] args) {
		double side, Area, Perimeter, Semi, Altitude; 
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the Length of any Side: ");
		side = sc.nextDouble();

		Area = (Math.sqrt(3)/4)*(side * side);
		Perimeter = 3 * side; 
		Semi = Perimeter/2;
		Altitude = (Math.sqrt(3)/2) * side;

		System.out.format("\n The Area of a Equilateral Triangle = %.2f\n",Area);
		System.out.format("\n The Perimeter of a Equilateral Triangle = %.2f\n", Perimeter);
		System.out.format("\n The Semi Perimeter of a Equilateral Triangle = %.2f\n", Semi);
		System.out.format("\n The Altitude of a Equilateral Triangle = %.2f\n", Altitude);
	}
}