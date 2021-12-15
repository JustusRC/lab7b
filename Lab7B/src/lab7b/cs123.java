package lab7b;

import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		//Array Declaration 
        int[] marks= new int[6];
        int[] pass= new int[6];
        int[] fail= new int[6];
        //Variable Declaration
        int passCount=0,failCount=0;
       
        Scanner pam= new Scanner(System.in); 
        //Prompt for user to enter grade points
        System.out.print("Enter the grade points of 6 students: ");
        //For loop to see if grades are passing or failing
        for(int i=0;i<6;i++)
        {
           marks[i]=pam.nextInt();
           
           if(marks[i]>=70)
           {
        	   pass[passCount]=marks[i];  
        	   passCount++;
           }
           else
           {
        	   fail[failCount]=marks[i];
        	   failCount++;
           }
        }
        //Output of number of students who passed and what the grade are
        System.out.println("Number of students passed: "+passCount);
        System.out.print("The passing grades are: ");
        for(int i=0;i<passCount;i++){
            System.out.print(pass[i]+" ");
        }
  
        //Output of number of students who failed and what the grades are
        System.out.println("\nNumber of Students failed: "+failCount);
        System.out.print("The failing grades are: ");
        for(int i=0;i<failCount;i++){
            System.out.print(fail[i]+" ");
        }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}