public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1 
		// Integer
		
            int i,j,n_dividers;
             
            for(i=0;i<=Integer.MAX_VALUE ;i++)

            {   n_dividers=0;

                for(j=1;j<=i;j++)
                {
                  if(i%j==0)

                  n_dividers=n_dividers+1;

                 }
                  
                 if(n_dividers==2)

                	System.out.println(i+" is a prime number \n");
             }
             

          
	
	//long integer
	 for(i=0;i<=Long.MAX_VALUE ;i++)

     {   n_dividers=0;

         for(j=1;j<=i;j++)
         {
           if(i%j==0)

           n_dividers=n_dividers+1;

          }
           
          if(n_dividers==2)

         	System.out.println(i+" is a prime number \n");
      }
      
	 // Question 2 
	 // For integer 
	 long start, elapsedTime;
	 start = System.nanoTime(); 
	 for(i=Integer.MIN_VALUE;i<=Integer.MAX_VALUE ;i++)
     { }
	 elapsedTime = System.nanoTime() - start;
	 System.out.println("the time needed to count from the smallest to the largest integer is : "+ elapsedTime);
	 
	 // For Long integer 
	 Long ii;
	 start = System.nanoTime(); 
	 for(ii=Long.MIN_VALUE;ii<=Long.MAX_VALUE ;ii++)
     { }
	 elapsedTime = System.nanoTime() - start;
	 System.out.println("the time needed to count from the smallest to the largest Long is : "+ elapsedTime);

   }

	

}

