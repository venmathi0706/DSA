import java.io.*;
import java.util.*;
class grade{
public static void main(String args[]){
 System.out.println("Enter the mark:");
 Scanner sc = new Scanner(System.in);
 int mark=sc.nextInt();
 if(mark>=90)
 {
     System.out.println("Grade A");
 }
 else if(mark>=80)
 {
     System.out.println("Grade B");
 }
else if(mark>=60)
 {
     System.out.println("Grade C");
 }
else if(mark>=35)
 {
     System.out.println("Grade D");
 }
else
 {
     System.out.println("Fail");
 }}
}
