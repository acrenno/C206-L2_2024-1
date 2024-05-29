package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Arquivo a = new Arquivo();

        Funcionario f1 = new Funcionario("Jose", "0000000", 20);
        Funcionario f2 = new Funcionario("Lucas", "111111", 22);

        a.escrever(f1);
        a.escrever(f2);

        ArrayList<Funcionario> funcionarios = a.ler();

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("nome : " + funcionarios.get(i).getNomeFunc());
            System.out.println("cpf : " + funcionarios.get(i).getCpfFunc());
            System.out.println("idade : " + funcionarios.get(i).getIdadeFunc());

        }

    }
}