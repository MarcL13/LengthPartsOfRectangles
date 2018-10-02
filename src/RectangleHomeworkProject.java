/**
 * 
* @author Marc Lussier, Period 7
 * 
 * 
 */


 
import java.util.Scanner;

public class RectangleHomeworkProject {

	public static void main(String[] args)
	{
		System.out.println("The length of the side lengths of a rectangle.");
		System.out.println("Area, perimeter, diagonal on own line.");
		System.out.println("Each value round to 2 places, aligned vertically.");
		
		Scanner in = new Scanner(System.in);
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("Length: " + length);
		double width = in.nextDouble();
		in.nextLine();
		System.out.println("Width: " + width);
		System.out.println("");
		
		double area = width * length;
		double perimeter = ((width*2) + (length*2));
		double c = ((width*width) + (length*length));
		double diagonal = Math.sqrt(c);
				
		System.out.printf("Area: %13.2f", area);
		System.out.println("");
		System.out.printf("Perimeter: %8.2f", perimeter);
		System.out.println("");
		System.out.printf("Diagonal: %9.2f", diagonal);
		
		
	}

}
