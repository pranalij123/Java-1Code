class GradeSystem{

public static void main(String args[]){
        
        int marks=70;
        if(marks>=80 && marks<=100){
            System.out.println("A+");
        }
        else if(marks<80 && marks>=60){
           
                System.out.println("B+");
            }
            else if(marks<60 && marks>=40){
                
                    System.out.println("C+");
                }
                else if(marks<40 && marks>=35){
                    
                        System.out.println("E");
                    }
                 else{
                        System.out.println("fail");
                    }
                
            
        
        
  }
        
}


/*output
  compile time:success
  run time;
B+
*/
