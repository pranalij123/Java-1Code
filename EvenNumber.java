import java.util.Scanner;
class EvenNumber{

public static void main(String []args)
{

Scanner sc= new Scanner(System.in);
System.out.println("enter the int value");
int b= sc.nextInt();
System.out.println("The value is "+b);

String m=(b%2==0)?("even"):("odd");
System.out.println("value is "+m);
}
}

