
class NoOfEvenOdd{

  public static void main(String[] args) {
    int a = 2345;
   int even=0;
int odd=0;
    do {

      int r=a%10;
if(r%2==0){
even++;
}
else{
odd++;
}

      
      a=a/10;

     
  }while(a>0);


  System.out.println("Even:"+even);
System.out.println("odd:"+odd);
  }
}


/*output:
                                  > cd "c:\Users\Pranali Jadhav\Desktop\" ; if ($?) { javac Number.java } ; if ($?) { java Number }
Even:2
odd:2

*/
