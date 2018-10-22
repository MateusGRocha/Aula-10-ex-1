
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando novo Objeto
		Matematica teste = new Matematica();
		
		//convertendo Para Grau e Radiano
		Double t1 = teste.converterAngulo(100.0, Matematica.TipoAngulo.GRAU);
		Double t2 = teste.converterAngulo(120.0, Matematica.TipoAngulo.RADIANOS);
		
		
		//Imprimindo os Resultados
		System.out.println(t1);
		System.out.println("-------\n" + t2);
		System.out.println("-------\n" + Matematica.somar(4, 5, 3));
		System.out.println("-------\n" + Matematica.converterBinarioParaDecimal("0011"));		
	}

}
