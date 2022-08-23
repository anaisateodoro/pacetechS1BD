package default_package;

import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * addFirst
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirts()
		 * getLast()
		 */
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		//incluindo Mazda no início
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		//Incluindo Bugatti no fim
		cars.addLast("Bugatti");
		System.out.println(cars);
		String carro;
		carro = cars.get(3);
		System.out.println(carro);
		
		//removendo primeiro
		cars.removeFirst();
		System.out.println(cars);
		
		//removendo último
				cars.removeLast();
				System.out.println(cars);
		
		//pega o primeiro
		System.out.println(cars.getFirst());
		System.out.println(cars);
		
		//pega o último
				System.out.println(cars.getLast());
				System.out.println(cars);
	cars.clear();
	if (cars.isEmpty()) {
		System.out.println("LinkedList vazio");
	}
			}
	

}
