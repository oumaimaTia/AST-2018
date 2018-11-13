import java.util.Scanner;


public class Exercice4 {

	private static Scanner sc;

	public static void main(String[] args) {
		double x,radius;
		int nbr;
		sc = new Scanner(System.in);
		System.out.println("please enter the diameter of the circle ");
		x= sc.nextDouble();
		radius= x /2 ;
	    //Area = PI*radius*radius
	    double area = Math.PI * (radius * radius);
	    System.out.println("The area of circle is: " + area);
	    //Circumference = 2*PI*radius
	    double circumference= Math.PI * 2*radius;
	    System.out.println( "The circumference of the circle is:"+circumference) ;
	    System.out.println( "Please enter the number of digits after the period of Pi") ;
	    nbr = sc.nextInt();
	    
	    
      
	}

}

