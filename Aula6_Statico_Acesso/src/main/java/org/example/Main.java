package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste();

        int contator = Teste.contator;
        System.out.println(contator);

        Teste t4 = new Teste();
        Teste t5 = new Teste();

         */

        Funcionario f1 = new Funcionario("Jorge");
        Funcionario f2= new Funcionario("Lylian");
        Funcionario f3= new Funcionario("Lanna");

        System.out.println("Nome do funcionario " + f1.nome + " id:" + f1.id);
        System.out.println("Nome do funcionario " + f2.nome + " id:" + f2.id);
        System.out.println("Nome do funcionario " + f3.nome + " id:" + f3.id);

        System.out.println(Funcionario.getCont());
        Funcionario.setCont(0);
        System.out.println(Funcionario.getCont());



    }
}