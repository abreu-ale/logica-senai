package exercicios;

public class Teste {

	public static void calcular(double valor ) {
		
		
		
	int[] cedulas = {100,50,20,10,5,2,1};
		
		for(int i = 0; i < cedulas.length; i++){
			if( valor >= cedulas[i] ){
				System.out.println( (int)valor/cedulas[i] + " notas de " + cedulas[i]);
				valor = valor % cedulas[i];
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		calcular(1233);
	}

	}
