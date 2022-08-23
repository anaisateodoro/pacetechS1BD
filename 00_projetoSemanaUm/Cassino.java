/* Cassino de Las Vegas
 * Um Cassino de Las Vegas solicitou um sistema para armazenar os números sorteados no Bingo.
 * Para isto, o software a ser desenvolvido deve atender aos seguintes requisitos:
 * 1. O sistema deve permitir ao usuário digitar todos números que foram sorteados (não existe um limite de números que o usuário pode digitar).
 * 2. Quando o usuário digitar o número -1, o sistema deve entender que a digitação dos números foi finalizada.
 * 3. Após a digitação dos números, o sistema deve imprimir todos os números digitados pelo usuário na sequência em que eles foram sorteados.
 * 4. O sistema deve informar a quantidade de números digitados.
 * 5.O sistema deve informar o maior número digitado.
 * 6. O sistema deve informar o menor número digitado.
 * Exemplo de resultado de exucação dos sistema para os números sorteados:
 * Esperado após digitação dos números sorteados
 * "Os números sorteados foram: 55,6,47,3,12,22,5
 * Menor número:3
 * Maior número:55
 * Total de números:7
 * 
 * */

package projetoCassino;

import javax.swing.JOptionPane;

/*
 * @author Anaísa 
 */
public class Cassino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosSorteados;
		Bingo jogo = new Bingo();
		
		boolean continuar = true;
		
		while(continuar) {
			numerosSorteados = Integer.parseInt(JOptionPane.showInputDialog("Digite os números para Bingo. Para sair/finalizar digite -1"));
		if(numerosSorteados ==-1) {
			continuar=false;
			System.out.println("");
			System.out.println("===================Programa finalizado==================");
			
		}else {
			jogo.setAddNumeroBingo(numerosSorteados);
		}
		}
		System.out.println("");
		System.out.println("Números sorteados :" + jogo.getJogoBingo());
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("");
		System.out.println("Total de números sorteados :" + jogo.getQuantosNumeroSorteados());
		System.out.println("====================================================");
		System.out.println("");
		System.out.println("Maior número sorteado :" + jogo.getMaiorNumeroSorteado());
		System.out.println("====================================================");
		System.out.println("");
		System.out.println("Menor número sorteado  :" + jogo.getMenorNumeroSorteado());
		System.out.println("");

	}

}
