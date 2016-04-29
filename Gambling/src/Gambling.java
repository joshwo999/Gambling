import java.util.Scanner;
public class Gambling {
	static double bet;
	static int randomNumber;
	static Scanner userInput;
	static double money;
	public static void main(String[] args) {
		
	 userInput=new Scanner(System.in);
	 money=100;
	 greetUser();
	 decideOutcome();
		
		
	}
	public static void takeBet()
	{
		System.out.println("Tell me how much money you want to bet.");
		bet=userInput.nextDouble();

		if(bet>money)
		{
			System.out.println("You don't have that much money.");
			takeBet();
		}
		if(bet<0)
		{
			System.out.println("You can't do that!");
			takeBet();
			System.out.println();
		}
		
	}
	public static void greetUser()
	{
		System.out.println("Hello let's play a game. I'm going to think of a number, either one, two, or three. If you guess what I'm thinking correctly, I'll double the money you bet. If you guess incorrectly I'll take away the amount of money you bet. You have $100 to start.");
	}
	public static void decideOutcome()
	{
		while(money>0)
		{
			takeBet();
			randomNumber=(int)(Math.random()*3)+1;
			System.out.println("Ok now guess what I'm thinking. (Either 1, 2, or 3.)");
			int guess=userInput.nextInt();		
			
			if(guess==randomNumber)
			{
				System.out.println("Wow! You got it! Let's go again.");
				money=money+bet*2;
				System.out.println("You now have "+money+" dollars.");
			}
			else
			{
				System.out.println("Awww you guessed incorrectly. Let's try again.");
				money=money-bet;
				System.out.println("You now have "+money+" dollars.");
			}
			
		}
		System.out.println("Sorry, you have no more money, try again later.");
	}
	
	}

	
	