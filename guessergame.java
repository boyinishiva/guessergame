import java.util.Scanner;

class guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("guesser guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class player
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("player guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class umpire
{
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	
	void collectNumberFromGuesser() 
	{
		guesser g=new guesser();
		numberFromGuesser=g.guessNum();
	}
	void collectNumberFromPlayers() 
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
		numberFromPlayer1=p1.guessNum();
		numberFromPlayer2=p2.guessNum();
		numberFromPlayer3=p3.guessNum();10
		
	}
	void compare()
	{
		if(numberFromGuesser==numberFromPlayer1)
		{
			if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3)
			{
				System.out.print("all the players own the game");
			}
			else if(numberFromGuesser==numberFromPlayer2)
			{
				System.out.print("player1 & player2 own the game");
			}
			else if(numberFromGuesser==numberFromPlayer3)
			{
				System.out.print("player1 & player3 own the game");
			}
			else
			{
			System.out.print("player1 own the game");
			}
		}
		else if(numberFromGuesser==numberFromPlayer2)
		{
			if(numberFromGuesser==numberFromPlayer3)
			{
				System.out.print("player2&player3 own the game");
			}
			else
			{
			System.out.print("player2 own the game");
			}
		}
		else if(numberFromGuesser==numberFromPlayer3)
		{
			System.out.print("player3 own the game" );
		}
		
	}
	
	
}
public class guessergame {

	public static void main(String[] args) 
	{
		umpire u=new umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();
		
		
		

	}

}
