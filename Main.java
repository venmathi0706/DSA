
import java.util.Scanner;
import java.io.*;
class Main {
    public static void main(String[] args) {
        
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=reader.nextInt();
        reader.nextLine();
        System.out.println("Enter a string:");
        String s=reader.nextLine();
        System.out.println("Enter a character:");
        char ch=reader.next().charAt(0);
        System.out.println(num);
        System.out.println(s);
        System.out.println(ch);
        
        
        
    }
}