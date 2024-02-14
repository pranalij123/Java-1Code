class LargestNumber{
public static void main(String []args)
{
int a=45;
int b=36;
int c=23;
int d=14;
//result= 45>36?(45>23?(45>14? 45:14):(23>36? 23:36)):(36>23?(36>14? 36:14):(23>14? 23:14));
int result=a>b?(a>c?(a>d? a:d):(c>b? c:b)):(b>c?(b>d? b:d):(c>d? c:d));
System.out.println("largest number amoung 45,36,23,14 is "+result);
}
}
/*output:
compile time:success
run time:largest number amoung 45,36,23,14 is 45
*/
