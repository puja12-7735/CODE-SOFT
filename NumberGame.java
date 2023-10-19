import java.util.*;
class NumberGame
{
	public static void main(String[]args)
{
		Random random=new Random();
		int computerNumber=random.nextInt(99)+1;
		Scanner sc=new Scanner(System.in);

		int i;
		int T=3;
		
		for(i=0;i<T;i++)
	{
			System.out.println("Guess a number between 1 and 100:");
			int userNumber=sc.nextInt();
			if(userNumber==computerNumber)
		{
				System.out.println("You got it right!");
				break;
		}
		else if(Math.abs(userNumber-computerNumber)<5)
		{

				System.out.println("Almost got it!");
     }
	 else
		{

				System.out.println("You got it wrong!");
		}
	}
	if(i==T)
	{				
		System.out.println("You exhusted all of your trials.");
		System.out.println("The number is :"+computerNumber);
	}
}
}

