import java.io.*;
import java.util.*;
class size{
public static void main(String args[]){
 System.out.println("Enter the size:");
 Scanner sc = new Scanner(System.in);
 int size=sc.nextInt();
 switch(size){
     case 30:
         System.out.println("Medium");
         break;
     case 38:
         System.out.println("Large");
         break;
     case 42:
         System.out.println("XLarge");
         break;
     default:
         System.out.println("Invalid");
 }
 }
}