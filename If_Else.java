import java.util.Scanner;

class If_Else{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two digit number");
		int num= sc.nextInt();
		if((num/100==0) && (num%10!=num))//if condition is true ,it will execute this block
		{

			if(num%2==0)
			{
				System.out.println("Number is even");
			}

			else
			{
				System.out.println("Number is odd");
			}


		}

		else
		{
			System.out.println("Number is invalid");

		}


}
}

/*OUTPUT1:
Enter the two digit number
23
Number is odd

OUTPUT2:
Enter the two digit number
3
Number is invalid

*/
