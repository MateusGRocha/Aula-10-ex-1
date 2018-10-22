
public class Matematica {
	/**
	 * Criando um Enum para Conversao de grau para radiano
	 *
	 */
	public enum TipoAngulo {
		GRAU, 
		RADIANOS;
	}
	
		Double converterAngulo(Double angulo, TipoAngulo tipo) {
			if(TipoAngulo.GRAU == tipo) {
				return Math.toRadians(angulo);
			}
			else {
				return Math.toDegrees(angulo);
			}
		}
		
		/**
		 * Metodo Para somar 3 valores do tipo Integer
		 * @param n1
		 * @param n2
		 * @param n3
		 * @return
		 */
		
		public static Integer somar(Integer n1, Integer n2, Integer n3) {
			return n1 + n2 + n3;
		}
		
		/**
		 * Metodo para Converter um numero de Binario para Int
		 * @param numBinario
		 * @return converter
		 */
		
		public static Integer converterBinarioParaDecimal(String numBinario) {
			Integer converter = Integer.parseInt(numBinario, 2);
			return converter;	
		}
}