import java.util.*;
public class calculater {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
    System.out.println("Enter a First Number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter a Second number:");
        double num2 = sc.nextDouble();
        System.out.println("Choose a operator(+,-,*,/):");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;
            case '-':
                result = num1 + num2;
                System.out.println("Subraction = " + result);
                break;
                case'*':
                result = num1 + num2;
                System.out.println("Multiplication = " + result);
                break;
                case'/':
                if(num2 !=0) {
                System.out.println("Division = " + result);
        } else {
                System.out.println("Not divisble by zero!");
        }
        break;
        default:
            System.out.println("Invalid Operator!");
            sc.close();
        }
        
                
                
    }
}
