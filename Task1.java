import java.util.Scanner;

public class Task1 {
    public static int addition(int num1,int num2){
        return num1+num2;
    }
    public static int subtract(int num1,int num2){
        return num1-num2;
    }
    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static int divide(int num1,int num2){
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
            int num1=sc.nextInt();
            System.out.print("Enter the operator (+ , - , * , /) : ");
            char op=sc.next().charAt(0);
            System.out.print("Enter the second number : ");
            int num2=sc.nextInt();
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
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String answer = sc.next();
            if (!answer.equalsIgnoreCase("yes")) {
                calculator = false;
                System.out.println("Calculator closed.");
            }
        }

    }
}
