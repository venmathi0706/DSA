import java.io.*;
import java.util.*;
class loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String fn=sc.nextLine();
        System.out.println("Enter last name:");
        String ln=sc.nextLine();
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           
            System.out.println(fn+ln);
        }
    }
}