package exercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String nome;
		int quantidadeNomes;

		System.out.print("Digite a quantidade de nomes que deseja cadastrar em sua lista: ");
		quantidadeNomes = sc1.nextInt();
        System.out.println("");

		Set<String> colecaoNome = new HashSet<String>();
		for (int i = 0; i < quantidadeNomes; i++) {
			System.out.print("Digite o " + (i + 1) + "º nome: ");
			nome = sc2.nextLine();
			colecaoNome.add(nome.toUpperCase());
		}
        System.out.println("");
		System.out.println("Os nomes inseridos na lista foram:" + colecaoNome);

		sc2.close();
		sc1.close();
	}

}
