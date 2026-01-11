/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstAssigment;
import java.util.Scanner;
        
public class Main {
    public static void main(String [] args){
       Scanner input =new Scanner(System.in);
//     Question 1
       System.out.print("Obtained marks:");
       int obtained=input.nextInt();
       System.out.print("Total marks:");
       int total=input.nextInt();
       float e=(obtained*100)/total;
       System.out.println("Your Percentage is"+e);
       
//       Queation 2
       System.out.print("Radius of circle:");
       int radius=input.nextInt();
       double pi=3.142;
       double circumfarence=2*pi*radius;
       double area=pi*(radius*radius);
       System.out.println("circumfaraance of circle is "+circumfarence);
       System.out.println("area of circle is "+area);
       
       
//       Question 3
         System.out.print("Orignal price of product:");
         int orignal=input.nextInt();
         System.out.print("Discout Percentage:");
         int discount=input.nextInt();
         int price=((orignal*(100-discount))/100);
         System.out.println("Price after discount is:"+price);
//      Question 4         
         System.out.print("Discount price of product:");
         int price2=input.nextInt();
         System.out.print("Discout Percentage:");
         int discount2=input.nextInt();
         int orignal2=((price2*100)/(100-discount2));
         System.out.println("Orignal price of product is:"+orignal2);
//       Question 5
         System.out.print("Voltage of Voltmer:");
         int volt=input.nextInt();
         System.out.print("Current of Ammeter:");
         int current=input.nextInt();
         double W=(volt*current);
         System.out.println("Power=:"+W+"Watt");
//       Question 6
         System.out.print("Enter first side of Triangle:");
          int d=input.nextInt();
          System.out.print("Enter Second side of Triangle:");
          int e1=input.nextInt();
          System.out.print("Enter Third side of Triangle:");
          int h=input.nextInt(); 
//       Question 7
         System.out.print("Enter any Integer number:");
         int number=input.nextInt();
         if (number%2==0)
             System.out.println("EVEN");
         else
             System.out.println("ODD");
//       Question 8
          System.out.print("Enter first side of Triangle:");
          int a=input.nextInt();
          System.out.print("Enter Second side of Triangle:");
          int b=input.nextInt();
          System.out.print("Enter Third side of Triangle:");
          int c=input.nextInt();
          int s=(a+b+c)/2;
          double area1=(s*(s-a)*(s-b)*(s-c));
          double n= Math.pow(area1, 0.5);
          System.out.println ("Area of triangle is"+n);
          
          
          
         
         
         
    }
}
