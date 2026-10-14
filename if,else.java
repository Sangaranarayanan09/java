import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int a=scan.nextInt(); //50
         System.out.println("Enter the 2nd Number");
        int b=scan.nextInt(); // 70
        System.out.println("Enter the 3rd Number");
        int c=scan.nextInt(); // 35
        if(a>b && a>c) {
            System.out.println("Grater Number is; "+a);
        }else if(b>a && b>c) {
             System.out.println("Grater Number is; "+b);
        }else {
             System.out.println("Grater Number is; "+c);
        
    }
}
}
