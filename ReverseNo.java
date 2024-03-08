
class Reverse {

  public static void main(String[] args) {
    int a = 2345;
  int b=0;
System.out.println("orignal number:"+a);
    do {

      int r=a%10;
      
      
b=(b*10)+r;
      
     
      a=a/10;

     
  }while(a>0);

System.out.println("reverse value:"+b);
  System.out.println("task done");
  }
}
/*output:
orignal number:2345
reverse value:5432
task done

*/
