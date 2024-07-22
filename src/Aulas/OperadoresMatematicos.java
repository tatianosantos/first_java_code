package Aulas;

public class OperadoresMatematicos {
	
	/*
	 * 
	 / Divisao
	 * Multiplicacao
	 + Adicao
	 - Subtracao
	 */

	public static void main(String[] args) {

		int orange_qtd = 3000;
		int lime_qtd = 1500;
		int guava_qtd =1200;
		double orange_price = 0.89;
		double lime_price = .68;
		double guava_price = 2.5;
		int orange_sold = 1658;
		int lime_sold = 964;
		int guava_sold = 348;
		
		int orange_storage = orange_qtd - orange_sold;
		int lime_storage = lime_qtd - lime_sold;
		int guava_storage = guava_qtd - guava_sold;
		
		
		
		double orange_profit = orange_sold * orange_price;
		double lime_profit = lime_sold * lime_price;
		double guava_profit = guava_sold * guava_price;
		
		double day_profit = orange_profit + lime_profit + guava_profit;
		
		System.out.println("Orage Storage: " + orange_qtd);
		System.out.println("Lemon Storage: " + lime_qtd);
		System.out.println("guava Storage: " + guava_qtd);
		System.out.println("===================================================================");
		System.out.println("Lucro do Laranja " + orange_profit);
		System.out.println("Lucro do Limao " + lime_profit);
		System.out.println("Lucro do Goiaba " + guava_profit);
		System.out.println("===================================================================");
		System.out.println("Lucro do Dia " + day_profit);
		System.out.println("===================================================================");
		System.out.println("Estoque Proximo Dia de Laranjas: " + orange_storage);
		System.out.println("Estoque Proximo Dia de Limoes: " + lime_storage);
		System.out.println("Estoque Proximo Dia de Goiabas: " + guava_storage);
		
		/*
		 * Venda de frutas

			quantidade de laranjas = 3000 
			quantidade de limoes = 1500
			quantidade de goiabas = 1200
			
			preco de laranjas = 1.5
			preco de limoes = 1.2
			preco de goiabas = 2.5
			
			--------------------------------------------------------
			
			laranjas vendidas = 1658
			limoes vendidos = 964
			goiabas vendidas = 348
			
			--------------------------------------------------------
			
			Lucro do dia
					 */
		
		/*
		
		int anoNascimento = 1982;
		int anoAtual = 2024;
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println(idade);
		
		*/
		
	
	
	}
}
