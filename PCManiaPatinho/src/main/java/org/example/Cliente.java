package org.example;

public class Cliente {

    String nome;
    long cpf;

    float soma =0;

    Computador[] computadores = new Computador[3];


    float calculaTotalCompra(){

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i]!=null){
                soma = soma + computadores[i].preco;
            }
        }

        return  soma;

    }

}