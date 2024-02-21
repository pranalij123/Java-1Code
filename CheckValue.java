import java.util.Scanner;
class CheckValue{

public static void main(String []args)
{
char a='A';
Scanner sc= new Scanner(System.in);
System.out.println("enter the int value");
int b= sc.nextInt();

String m=(a==b)?("Yes"):("No");
System.out.println(a+" & "+b+" are equal: "+m);
}
}

/*Output 1:
compile time:success;
Run time:enter the int value
65
A & 65 are equal: Yes

*/
