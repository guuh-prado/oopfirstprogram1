package ion.oopfirstprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    static ArrayList<Produtos> lista = new ArrayList<Produtos>();
    static Scanner x = new Scanner(System.in);

    public static void newProducts() {

        int id = 0;
        char controle = 's';

        do {
            x.nextLine();
            System.out.println("Digite o nome do produto:");
            String n = x.nextLine();
            System.out.println("Digite a categoria do produto:");
            String c = x.nextLine();
            System.out.println("Digite a quantidade em estoque: ");
            double e = x.nextDouble();
            System.out.println("Digite a unidade de medida: ");
            double undMed = x.nextDouble();
            System.out.println("Digite o valor unitário: ");
            double vlrUnd = x.nextDouble();
            id++;
            Produtos p = new Produtos(id, n, c, e, undMed, vlrUnd);
            lista.add(p);
            System.out.println("Deseja cadastrar outro produto? [S/N]");
            controle = x.next().charAt(0);
        } while (controle == 's' || controle == 'S');
    }

    public static void allProducts() {
        for (Produtos i : lista) {
            System.out.println(i);
        }
    }

    public static void findById() {
        System.out.println("Digite o id do produto para procura-lo: ");
        int id = x.nextInt();
        System.out.println(lista.get(id - 1));
    }

    /*public static String opcoes() {
        return "Digite a opção desejada: "
                + "\n 1: Cadastrar produtos "
                + "\n 2: Ver todos produtos "
                + "\n 3: Ver produto por id "
                + "\n 4: Encerra o programa";
    }*/

    public static void selector() {
        String selecao = "Digite a opção desejada: "
                + "\n 1: Cadastrar produtos "
                + "\n 2: Ver todos produtos "
                + "\n 3: Ver produto por id "
                + "\n 4: Encerra o programa";
        int opcao = x.nextInt();
        do {
            switch (opcao) {
                case 1:
                    newProducts();
                    System.out.println(selecao);
                    opcao = x.nextInt();
                    break;
                case 2:
                    allProducts();
                    System.out.println(selecao);
                    opcao = x.nextInt();
                    break;
                case 3:
                    findById();
                    System.out.println(selecao);
                    opcao = x.nextInt();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção escolha novamente.");
                    System.out.println(selecao);
                    opcao = x.nextInt();
                    break;
            }
        } while (opcao != 4);
    }
}
