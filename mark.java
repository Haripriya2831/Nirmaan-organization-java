package day5;
import java.util.Scanner;
public class mark {
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
//		  {
//	  System.out.println("Enter the mark");for
//	  int mark=sc.nextInt();
//	  
//	  if (mark>=40) {
//		  Sustem.out.println("grade C");
//		  }
//	  else if (mark>=75) {
//    	  System.out.println("grade B");
//      }
//	  else if(mark>=95) {
//		 System.out.println("grade A");
//	 }
//	  else {
//		  System.out.println("fail");
//	  }
//		  }
// }
//}
	



     int num=0;
     for(num=0;num<=10;num++)
    	 System.out.println(num);
 System.out.println();
     
 System.out.println("Enter the table");
 //5*1=5
 int table=sc.nextInt();
 for(int i=1;i<=12;i++)
  System.out.println(table+"x"+i+"="+i*table);
  }
  }