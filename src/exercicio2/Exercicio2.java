package exercicio2;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio2 {
	
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        int opcao, quantidade = 0;
        String nome;

        HashMap<String,Integer> carrinhoCompra = new HashMap<String, Integer>();

        do {
            System.out.println("-- MENU DE OPÇÕES --");
            System.out.println("");
            System.out.println("1 - Incluir Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = sc1.nextInt();
            System.out.println("");
            if (opcao == 1) {

                System.out.print("Digite o nome do produto: ");
                nome = sc2.nextLine();
                System.out.println("");
                
                if (carrinhoCompra.containsKey(nome) ) {
                   carrinhoCompra.put(nome, ++quantidade);
                   System.out.println("O Produto "+ nome + " foi incrementado com +1");
                   System.out.println("");
                }
                else {
                    carrinhoCompra.put(nome,quantidade=1);
                    System.out.println("O Produto "+ nome + " foi criado com Sucesso");
                    System.out.println("");
                }
            }
            
            else if (opcao == 2) {
                System.out.println(carrinhoCompra);
                System.out.println("");
                System.out.print("Digite o nome do Produto que deseja remover: ");
                nome = sc2.nextLine();
                System.out.println("");
                
                if (carrinhoCompra.containsKey(nome) && carrinhoCompra.get(nome) > 1) {
                    int valor = carrinhoCompra.get(nome) - 1;
                    carrinhoCompra.replace(nome, valor);
                    System.out.println("O Produto "+ nome +" Foi decrementado em -1");
                    System.out.println("");
                }
                else if (carrinhoCompra.containsKey(nome) && carrinhoCompra.get(nome) == 1) {
                    carrinhoCompra.remove(nome);
                    System.out.println("O Produto "+ nome + " Foi removido da sua lista");
                    System.out.println("");
                }
                else {
                    System.out.println("O Produto Não existe, tente novamente");
                    System.out.println("");
                }
            }
            else if (opcao == 3) {
                for (String produto: carrinhoCompra.keySet()){
                    System.out.println(carrinhoCompra.get(produto)+" Unidade(s) do Produto " + produto);
                }
                System.out.println("");
            }
            else if (opcao == 4) {
                System.out.println("FIM DO PROGRAMA!");
            }
            else {
                System.out.println("Opção Inválida. Tente Novamente!");
                System.out.println("");
            }

        }while (opcao != 4);
        
        sc2.close();
        sc1.close();
    }

}
