import java.util.Scanner;


public class Exercice1 {
	private static Scanner readme;
	private static Scanner sc;

	public static void main(String[] args) {
		int n,count;
		// question 1 
		readme = new Scanner(System.in);
	    System.out.println("Enter an integer between 1 and 100 ");   
	    n = readme.nextInt();
	    
	    // question 2 
	    int [] ArrayForInteger = new int[n];
	    for (count=0; count<n; count++) {
	    	System.out.println ("Enter the "+ count + " integer");
	    	sc = new Scanner (System.in);
	    	ArrayForInteger[count] = sc.nextInt();
	    	} 
	    // question 3 
	    int a,sum = 0 , product = 1,average,variance = 0,minimum,maximum;
	    // show input values
	    System.out.println("the input values : ");
	    for (count=0; count<n; count++) {
	    	 
	    	 System.out.println(ArrayForInteger[count]);
	    	
	    	}
	    for (count=0; count<n; count++) {
	    	// sum 
	    	sum = sum + ArrayForInteger[count];
	    	
	    	// product 
	    	product = product * ArrayForInteger[count];
	    	
	    	}
	    System.out.println("the sum is : " + sum);
	    System.out.println("the product is : " + product);
	    // average
	    average = sum / n ;
	    System.out.println("the average is : " + average);
	    // variance
	    for (count=0; count<n; count++) {
	    	a= ArrayForInteger[count] - average;
	    	variance = (variance + a *a);
	    }
	    variance= variance / n-1 ; 
	    System.out.println("the variance is : " + variance);
	    // the smallest and the largest value 
	 
	    minimum = ArrayForInteger[0];
	    maximum = ArrayForInteger[0];
	    for (count=1; count<n; count++) {
	    	minimum =  Math.min(minimum,ArrayForInteger[count] );
	    	maximum =  Math.max(maximum,ArrayForInteger[count] );
	   	    }
	    System.out.println("the minimum is : " + minimum);
	    System.out.println("the maximum is : " + maximum);
	    
		
		
	}

	

}

