

public class Examen {

	public static void main(String[] args) {
		
		// Ejemplos de los metodos
		/*
		Examen a = new Examen(); 
		System.out.println(a.primeraMayuscula("anita lava la tina"));
		System.out.println(a.invertirCadena("aguacate con sal"));
		System.out.println(a.vocalesMayuscula("Hasta luego cocodrilo"));
		a.fizzBuzz();
		System.out.println(a.palindromo("Sugus"));
		*/
		
	}
	public String  primeraMayuscula(String myString) {
		String[] words = myString.split("");
		String resultado = words[0].toUpperCase();
		for(int i = 1; i <= words.length-1; i++) {
			resultado = resultado + words[i];
		}
		return resultado;
	}
	public String invertirCadena(String myString) {
		String[] words = myString.split("");
		String resultado = "";
		for(int i = words.length-1; i >= 0; i--) {
			resultado = resultado + words[i];
		}
		return resultado;
	}
	public String vocalesMayuscula(String myString) {
		String cambioA = myString.replace("a", "A");
		String cambioE = cambioA.replace("e", "E");
		String cambioI = cambioE.replace("i", "I");
		String cambioO = cambioI.replace("o", "O");
		String cambioU = cambioO.replace("u", "U");
		return cambioU;
	}
	public void fizzBuzz() {
		for(int i = 1; i<= 100; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("FissBuzz");
				continue;
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
				continue;
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);	
		}
	}
	public boolean palindromo(String myString) {
		String minuscula = myString.toLowerCase();
		String todoJunto = minuscula.replace(" ", "");
		String[] words = todoJunto.split("");
		String resultado = "";
		for(int i = words.length-1; i >= 0; i--) {
			resultado = resultado + words[i];
		}
		Boolean result = todoJunto.equals(resultado);
		return result;
	}
}
