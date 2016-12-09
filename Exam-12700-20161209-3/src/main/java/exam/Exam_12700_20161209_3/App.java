package exam.Exam_12700_20161209_3;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner input=new Scanner(System.in);
         System.out.print("请输入日期：");
         String str=input.nextLine();
         String[] strs=str.split("-");
         int year=Integer.parseInt(strs[0]);
         int month=Integer.parseInt(strs[1]);
         int day=Integer.parseInt(strs[2]);
         int sum=0;
         
        	switch (month-1) {
			case 11:
				sum+=30;
           case 10:
				sum+=31;
           case 9:
        	   sum+=30;
		
           case 8:
        	   sum+=31;
				
           case 7:
        	   sum+=31;
				
           case 6:
        	   sum+=30;
				
           case 5:
        	   sum+=31;
			
           case 4:
        	   sum+=30;
			
           case 3:
        	   sum+=31;
				
           case 2:
         if((year%4==0)&&(year%100!=0) || (year%400==0)){
    	   sum+=29; 
        	   }
         else{
    	   sum+=28; 
       }
			
           case 1:
        	  
        	   sum+=31;
			
			default:
				break;
			}
        	
       System.out.println("您输入的日期为当年的第 "+(sum+day)+"天");
         }
    }

