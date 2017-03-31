import java.util.Random;

public class DH{
	public static void main(String args[]){
		
		Random randNum = new Random();
		int N1 = randNum.nextInt(1000)+1;
		int N2 = randNum.nextInt(1000)+1;
		
		
		if (args.length ==1){
			int private_key = Integer.parseInt(args[0]);
			int public_key = (N1^private_key) % N2;
			System.out.println("public key -> "+public_key);
		}
		else if(args.length == 2){
			
			int private_key = Integer.parseInt(args[0]);
			int public_key = Integer.parseInt(args[1]);
			int session_key = (public_key^private_key) % N2;
			System.out.println("session key -> "+session_key);
		}
		
	}

}
