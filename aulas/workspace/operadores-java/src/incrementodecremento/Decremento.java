package incrementodecremento;

public class Decremento {
	public static void main(String[] args) {
		int x = 10;
		x--;
		System.out.println("O valor de X �: " + x);
		int y = x--;
				
	System.out.println("O valor de Y �: " + y);
		
	int z = --x;
	System.out.println("O valor de Z �: " + z);
	System.out.println("O valor de x �: " + x);
	
	int soma = 1 + --x;
	System.out.println(soma);
	}
}
	
