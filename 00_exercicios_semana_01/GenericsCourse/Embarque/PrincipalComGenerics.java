package Embarque;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Controle.AeronavesComGenerics;

/*
 * Informar a quantidade de aeronaves no pátio, o nr dos vôos por ordem de chegada.
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai.
 * Mostrar qual o primeiro vôo a decolar.
 * 
 */
public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AeronavesComGenerics<String> air = new AeronavesComGenerics<>();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		//adicionando voos
		for(int i = 0; i < nrAeronaves;i++) {
			String nrVoo = JOptionPane.showInputDialog("Informe o nr do voo");
			air.addVoo(nrVoo);
			}
		air.primeiroVoo();
		String x = (String) air.primeiroVoo();
		System.out.println("O primeiro a decolar é o voo :" + x);
		air.listaVoos();
		sc.close();

	}

}
