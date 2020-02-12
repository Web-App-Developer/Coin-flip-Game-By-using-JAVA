import java.lang.Math; 
public class Coin{
	
	private enum Sel{
		Head,Tail
	};
	public static void main(int v, int user){
		int initial_bet_salary = v;
		int vv = user;
		Coin game = new Coin();
		game.startGame(vv,initial_bet_salary);
	}
	public void startGame(int v, int initial_bet_salary){
		Sel guess;
		String output = "";
		Sel toss = tossCoin();
		System.out.println(toss);
		if( v == 0){
			guess = Sel.Head;
		}else{
			guess = Sel.Tail;
		}
		if ( guess  == toss){
			int out_value = 2 * initial_bet_salary;
			output = "You won!\n" + out_value;
			
		}else{
			output = "Sorry, it was selected another than that you select.You lost! Please try again ";
		}
		System.out.println(output);
	}
	private Sel tossCoin(){
		int coin_flip  = (int)(Math.random()*2);
		if (coin_flip == 1){
			return Sel.Head;
		}else{
			return Sel.Tail;
		}
		
	}
}