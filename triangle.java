import java.io.*;
import java.util.*;
class triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angles");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int sum=a1+a2+a3;
        if(sum==180){
            System.out.println("Triangle can be formed");
            
        }
        else{
            System.out.println("Triangle can't be formed");
        }
    }
}
