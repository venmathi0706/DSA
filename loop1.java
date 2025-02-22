import java.io.*;
import java.util.*;
class loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for x and y:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}