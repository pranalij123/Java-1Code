class AddOfNaturalNoInRange{
public static void main(String [] aonn){
int a=5;
int b=15;
// According to formula for sum of n natural number (n*(n+1)/2)
int c=((b*(b+1))/2);//((15*(15+1))/2)=120
//Sum of n natural number upto starting range of number
int d=((a*(a-1))/2);//((5*(5-1))/2)=10
//Addition of natural number in given range
int result=c-d;//120-10=110
System.out.println("Addintion of natural number in given range "+"("+a+","+b+")"+"is "+result); 

}
}
/*Output:
comile time:success
Run time:Addition of natural number in given range(5,15) is 110
*/


