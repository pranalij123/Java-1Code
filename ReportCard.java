import java.util.Scanner;
class ReportCard{

public static void main(String [] args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the marks of Subject");
System.out.println("Enter the marks of Math");
int M=sc.nextInt();
System.out.println("Enter the marks of History");
int H=sc.nextInt();
System.out.println("Enter the marks of Geography");
int G=sc.nextInt();
System.out.println("Enter the marks of Science");
int S=sc.nextInt();
System.out.println("Enter the marks of English");
int E=sc.nextInt();

int marks_obtained=M+H+G+S+E;
System.out.println("Marks obtained :"+marks_obtained);
int total_marks=500;
double per=(marks_obtained*100)/total_marks;
System.out.println("Percentage:"+per);
int p =(int) per;
char grade=(p<=100 && p>=85)? ('A'):((p<85 && p>=65)? ('B'):((p<65 && p>=45)? ('C'):((p<45 && p>=35)? ('E'):('F'))));
System.out.println("Grade :"+grade);

String remark=(grade=='A')?("Very good"):((grade=='B')? ("good"):((grade=='C')? ("need to be improve"):((grade=='E')? ("work hard"):(" need not to be improve"))));
System.out.println(remark);
System.out.println("*****************************School Report Card*********************************************");
System.out.println("                          Pragati Vidyalaya Mangi                      ");
System.out.println("                            SSC Maharastra Bord                        ");
System.out.println("Name: Neha jadhav                                          Date:20/02/2024");
System.out.println("Roll No:3323                     Division:A                Exam:Prelim    ");
System.out.println("**************************************************8*********************************************");

System.out.println("Subject                          Total Marks               Marks Obtained ");
System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("1. Math                             100                         "+M        );  
System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("2. History                          100                         "+H        );              
System.out.println("-----------------------------------------------------------------------------------------------");

System.out.println("3. Geography                        100                         "+G        );  
System.out.println("-----------------------------------------------------------------------------------------------");            

System.out.println("4. Science                          100                         "+S        ); 
System.out.println("-----------------------------------------------------------------------------------------------");             

System.out.println("5. English                          100                         "+E        );   
System.out.println("***********************************************************************************************");   

System.out.println("Total                               500                     Obtained Marks: "+marks_obtained    );   
  
System.out.println("Percentage: "+per+"                                            Grade: "+grade                   );
System.out.println("Remark: "+remark+"                                           Sign: N.V.Jadhav"                  );              
              
           
        
            

}
}
