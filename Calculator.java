

import java.util.Scanner;
 class Calculator
  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose operation (1:+,2:-,3:*,4: /):");
        int operator = scanner.nextInt();
        
        double result = 0;
        switch(operator) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                else
                {
                    System.out.println("Error: Division by zero!");
                break;
                }
            default:
                System.out.println("Invalid operator!");
        }
        
        
        
    }
}
/*OUTPUT:
compile time:success
  run time:
Enter first number:
34
Enter second number:
56
Choose operation (1:+, 2:-,3:*, 4:/):
1
Result: 90.0

*/
