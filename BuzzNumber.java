import java.util.Scanner;
class BuzzNumber{

public static void main(String []args)
{

Scanner sc= new Scanner(System.in);
System.out.println("enter the int value");
int b= sc.nextInt();
System.out.println("The value is "+b);
//Number which is divisible by 7 or last digit of number should be 7
String m=(b>=10 && b<=99)?((b%7==0 || b%10==7)? ("Buzz"):("not Buzz")):("invalid number");
System.out.println("value is "+m);
}
}

/*Output 1:
compile time:success;
Run time:enter the int value
68
The value is 68
value is not Buzz

output 2:
enter the int value
21
The value is 21
value is Buzz

output 3:
enter the int value
7
The value is 7
value is invalid number

*/
