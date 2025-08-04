import java.util.Scanner;

public class Task1 {
    public static double addition(double num1,double num2){
        return num1+num2;
    }
    public static double subtract(double num1,double num2){
        return num1-num2;
    }
    public static double multiply(double num1,double num2){
        return num1*num2;
    }
    public static double divide(double num1,double num2){
        if(num2==0){
            System.out.println("Error: Cannot divide by zero!");
        }
        return num1/num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean calculator=true;
        while(calculator){
            System.out.print("Enter the first number : ");
            double num1=sc.nextDouble();
            System.out.print("Enter the operator (+ , - , * , /) : ");
            char op=sc.next().charAt(0);
            System.out.print("Enter the second number : ");
            double num2=sc.nextDouble();
            double result;
            switch (op){
                case '+':
                    result=addition(num1,num2);
                    break;
                case '-':
                    result=subtract(num1,num2);
                    break;
                case '*':
                    result=multiply(num1,num2);
                    break;
                case '/':
                    result=divide(num1,num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }
            System.out.println(result);
            System.out.print("Do you want to calculate again? Type 'yes' or 'y' to continue: ");
            String answer = sc.next();
            if (!(answer.equals("yes") || answer.equals("y"))) {
                calculator = false;
                System.out.println("Calculator closed.");
            }
        }

    }
}
