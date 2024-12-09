package Day4;

import java.util.Scanner;

public class Simplecalculator {


  public static void main(String args[]) {
	  
	  Scanner sc=new Scanner (System.in);
	  while(true) {
	  System.out.println("Enter your choice");
	  System.out.println("Enter 0 is add");
	  System.out.println("Enter 1 is sub");
	  System.out.println("Enter 2 is mul");
	  System.out.println("Enter 3 is div");
	  System.out.println("Enter 4 is mod");
	  
	  int key =sc.nextInt();
	
	  if (key==0)
	  {
		  System.out.println("enter thefirstnum");
		  int firstnum=sc.nextInt();
		  System.out.println("enter the secondnum");
		  int secondnum=sc.nextInt();
		  
		  int total=firstnum+secondnum;
		  System.out.println("addition:"+total);
	  }
	  else if (key==1)
	  {
		  System.out.println("enter thefirstnum");
		  int firstnum=sc.nextInt();
		  System.out.println("enter the secondnum");
		  int secondnum=sc.nextInt();
		  
		  int total=firstnum-secondnum;
		  System.out.println("subract:"+total);
	  }
	 
	  else if (key==2)
	  {
		  System.out.println("enter thefirstnum");
		  int firstnum=sc.nextInt();
		  System.out.println("enter the secondnum");
		  int secondnum=sc.nextInt();
		  
		  int total=firstnum*secondnum;
		  System.out.println("multiple:"+total);
	  }
	  else if (key==3)
	  {
		  System.out.println("enter thefirstnum");
		  int firstnum=sc.nextInt();
		  System.out.println("enter the secondnum");
		  int secondnum=sc.nextInt();
		  
		  int total=firstnum/secondnum;
		  System.out.println("div:"+total);
	  }
	  else if (key==4)
	  {
		  System.out.println("enter thefirstnum");
		  int firstnum=sc.nextInt();
		  System.out.println("enter the secondnum");
		  int secondnum=sc.nextInt();
		  
		  int total=firstnum%secondnum;
		  System.out.println("mod:"+total);
	  }
	  }
	  
  }
}



