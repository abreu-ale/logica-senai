package incrementodecremento;

public class Decremento {
	public static void main(String[] args) {
		int x = 10;
		x--;
		System.out.println("O valor de X é: " + x);
		int y = x--;
				
	System.out.println("O valor de Y é: " + y);
		
	int z = --x;
	System.out.println("O valor de Z é: " + z);
	System.out.println("O valor de x é: " + x);
	
	int soma = 1 + --x;
	System.out.println(soma);
	}
}
	
