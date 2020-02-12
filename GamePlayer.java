
import java.util.Random;
import java.util.Scanner;
class GamePlayer{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int bet_salary,user;
		System.out.println("Enter your initial bet value for the coin toss to the nearest dollar=====>.\n");
		bet_salary = in.nextInt();
		System.out.println(" Now enter your guess, enter 0 for heads or 1 for tails=====>.\n");
		user = in.nextInt();
		Coin creat_coin = new Coin();
		creat_coin.main(bet_salary,user);
		
	}
}