package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //Scanner para a entrada de dados
        boolean flag = true; //Flag para a estrutura de repetição do menu

        //Novas instâncias de classes
        Plataforma plataforma = new Plataforma();
        Jogo[] jogos = new Jogo[10];

        //Entrando com os dados da plataforma
        plataforma.nome = "Steam";
        plataforma.criador = "Gabe Newell";

        while(flag){
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da plataforma:");
            System.out.println("1 - Adicionar um jogo à plataforma:");
            System.out.println("2 - Mostrar as informações da plataforma e seus jogos:");
            System.out.println("3 - Nome do jogo mais barato e do mais caro:");
            System.out.println("4 - Número de jogos com DLC:");
            System.out.println("5 - Sair do menu");

            int op = cin.nextInt();
            cin.nextLine(); //Quebra de linha para entrar com String
            switch (op){
                case 1:
                    System.out.println("Entre com o nome do jogo:");
                    cin.nextLine();
                    String nome = cin.nextLine();
                    System.out.println("Entre com o gênero do jogo:");
                    String genero = cin.nextLine();
                    cin.nextLine();
                    System.out.println("Entre com o preço do jogo:");
                    double preco = cin.nextDouble();
                    cin.nextLine();
                    System.out.println("O jogo possui alguma dlc? Digite true para sim, false para não.");
                    boolean dlc = cin.nextBoolean();
                    cin.nextLine();
                    Jogo j1 = new Jogo(nome, genero, preco, dlc);
                    plataforma.adicionarJogo(j1);
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    plataforma.mostraInfo(); //mostra as informações da plataforma e seus jogos
                    System.out.println("-------------------------------------------");
                    break;
                case 3:
                    plataforma.mostraMaisCaroBarato(); //Mostra o nome do jogo mais caro e o mais barato.
                    System.out.println("-------------------------------------------");
                    break;
                case 4:
                    plataforma.calculaDlc();
                    System.out.println("-------------------------------------------");
                    break;
                case 5:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    System.out.println("-------------------------------------------");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}