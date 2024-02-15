class GradeSystem{
public static void main(String []args){
int cyberSecurity=100;
int artificialInteligence=88;
int webTechnology=100;
int dataScience=60;
int computerNetwork=90;

//Percentage=(sum of all marks *100)/Total marks
//((100+88+100+60+90)*100)/500
double percentage=((cyberSecurity+artificialInteligence+webTechnology+dataScience+computerNetwork)*100)/500;

int marks=(int) percentage;//Type casting (Narrowing)
System.out.println("Marks "+ marks);

char result=((marks>=90 && marks<=100)? 'A':((marks>=75 && marks<90)? 'B':((marks>=55 && marks<75)? 'C':((marks>=35 && marks<55)? 'E':'F'))));
System.out.println("Grade is "+ result);

}
}
/* OUTPUT:
compile time success;
Run time :Marks 87
Grade is B
*/
