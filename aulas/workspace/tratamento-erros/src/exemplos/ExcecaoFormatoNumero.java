package exemplos;

public class ExcecaoFormatoNumero {
	public static void main(String[] args) {
		try { 
		int num = Integer.parseInt("1234x56789");
		System.out.println(num);
		}catch (NumberFormatException)
	}
}
