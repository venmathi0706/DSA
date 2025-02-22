import java.io.*;
import java.util.*;
class loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int x=sc.nextInt();
        int y=x;
        for(int i=2;y<=1000;i++){
           
            System.out.println(y);
             y=x*i;
        }
    }
}