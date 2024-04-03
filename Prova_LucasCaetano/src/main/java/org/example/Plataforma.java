package org.example;

public class Plataforma {
    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];

    void mostraInfo(){
        System.out.println("Nome da plataforma: " + this.nome);
        System.out.println("Nome do criador: " + this.criador);
        System.out.println("Informações dos Jogos: ");
        System.out.println("---------------------------------");
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null){
                jogos[i].mostraInfo(); //Mostra a info de cada jogo
            }
        }
    }

    void adicionarJogo(Jogo jogo){
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] == null){
                jogos[i] = jogo;
                System.out.println("Jogo adicionado!");
                break;
            }
        }
    }

    void mostraMaisCaroBarato(){
        String nomeMaisCaro = "";
        String nomeMaisBarato = "";
        double Caro = 0f;
        double Barato = 1000f;
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null) {
                if (jogos[i].preco < Barato){
                    Barato = jogos[i].preco;
                    nomeMaisBarato = jogos[i].nome;
                    if (jogos[i].preco > Caro){
                        Caro = jogos[i].preco;
                        nomeMaisCaro = jogos[i].nome;
                    }
                }
            }
        }
        System.out.println("Jogo mais caro: " + nomeMaisCaro);
        System.out.println("Jogo mais barato: " + nomeMaisBarato);
    }

    void calculaDlc(){
        int aux = 0;
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null){
                if(jogos[i].dlc){
                    aux ++;
                }
            }
        }
        System.out.println("Há no total " + aux + " jogos com dlcs na plataforma");
    }
}