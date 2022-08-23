package default_package;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 *  
 */

public class ArrayListCArros {

	public static void main(String[] args) {
		// construindo um arrayList para os carros
		ArrayList<String>	carros = new ArrayList<>();	
		
		
		//adicionando Carros ao arraylist
		carros.add("Fluence");
		carros.add("Kombi");
		carros.add("Jaguar");
		carros.add("BMW");
		carros.add("Mercedes");
		carros.add("Fusca");
		carros.add("Vectra");
		carros.add("Sandero");
		//mostrar array
		System.out.println(carros);
		
		//substituir FUSCA por Mitsubishi
		carros.set(4,"Mitsubishi");
		//mostra array
		System.out.println(carros);
		
		//remover VECTRA
		carros.remove("Vectra");
		//mostra array
		System.out.println(carros);
		/*
		//adicionando Carros ao arraylist com JOPtionPane
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		//mostra array
		System.out.println(carros);
		/*
		//esvaziando o array
		carros.clear();
		//mostra array
		System.out.println(carros);
		
		//verificar se o array está vazio
		if(carros.isEmpty()) {
			System.out.println("O vetor está vazio");
		}*/
		System.out.println(carros.size());
		
		if (carros.contains("BMW")) {
			//substituindo quando não se sabe a posição
			for(int i=0; i<carros.size();i++) {
				if("BMW".equals(carros.get(i))) {
					carros.set(i, "Bugatti");
					break;
				}
			}
		} else {
		System.out.println("Não encontrei o argumento pesquisado!");
		}
		//mostra array
		System.out.println(carros);
			}
}
