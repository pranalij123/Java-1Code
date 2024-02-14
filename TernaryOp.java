class TernaryOp{
public static void main(String []args)
{
int a=12;
int b=13;
int c=a+b;//12+13=25
int d=c/10;//25/10=2
int e=c%10;//25%10=5
int f=d+e;//2+5=7
String result=(f%2==0)? ("number is even"):("Number is odd");//7%2==1
System.out.println(result);
}
}

/*OUTPUT:
compile time:success
run time:Number is odd
*/
