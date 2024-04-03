package org.example;

public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    void mostraInfo(){
        System.out.println("Informações do jogo:");
        System.out.println("---------------------------------");
        System.out.println("Nome do jogo: " + this.nome);
        System.out.println("Gênero do jogo: " + this.genero);
        System.out.println("Preço do jogo: " + this.preco);
        System.out.println("O jogo tem DLC? " + this.dlc);
        System.out.println("---------------------------------");
    }
}