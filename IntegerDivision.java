import java.util.Scanner;  

public class IntegerDivision {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the first number (Num1): ");  
        String num1Str = scanner.nextLine();  

        System.out.print("Enter the second number (Num2): ");  
        String num2Str = scanner.nextLine();  

        try {  
            int num1 = Integer.parseInt(num1Str);  
            int num2 = Integer.parseInt(num2Str);  

            if (num2 == 0) {  
                throw new ArithmeticException("Division by zero");  
            }  

            int result = num1 / num2;  
            System.out.println("Result: " + result);  

        } catch (NumberFormatException e) {  
            System.out.println("Error: Invalid number format");  
        } catch (ArithmeticException e1) {  
            System.out.println("Error: Divide by Zero  ");  
        } 
    }  
}
