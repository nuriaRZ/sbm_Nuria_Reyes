package pk_SuperBuscaMinas;

public class Utilidades {

	/**
	 * Método que imprime una matriz por pantalla
	 */
	public static void imprimeMatrizBotones(BotonMina[][] matrizBotones) {
		for(int i = 0; i < matrizBotones.length; i++) {
			for(int j = 0; j < matrizBotones.length; j++) {
				System.out.println(matrizBotones[j][i].toString()+" ");
			}
			System.out.println("\n");
		}
	}

}
