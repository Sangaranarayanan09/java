 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.println("Enter the size");
        int n=scan.nextInt();
        int mark[]=new int[n];
       
        for(int i=0;i<mark.length;i++){ 
            System.out.println("Enter the "+i+"index values");
            mark [i]=scan.nextInt();
        }
       System.out.println(Arrays.toString(mark));
        
              
    }
}
                        
