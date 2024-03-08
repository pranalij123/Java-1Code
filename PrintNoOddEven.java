
class PrintNoOddEven {

  public static void main(String[] args) {
    int a = 2345;
  int b=1;
    do {

      int r=a%10;
      if(r%2==0){
      System.out.println("number is even:"+r);
      }
      else{
        System.out.println("number is odd:"+r);
      }
      a=a/10;

     
  }while(a>0);


  System.out.println("task done");
  }
}
/*output:
number is odd:5
number is even:4
number is odd:3
number is even:2
task done


*/
