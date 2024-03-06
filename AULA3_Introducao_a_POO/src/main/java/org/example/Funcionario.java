package org.example;

public class Funcionario {

    //atributos do funcionario
    String nome;
    int idade;
    double salario;

    //construtor : metodo sempre chamado quando instancia um novo objeto
    public Funcionario(){
        System.out.println("Funcionario criado");
    }

    //construtor com parametros
    public Funcionario(String nome, int idade, double salario) {
        System.out.println("Funcionario criado");
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //metodo calcula salario anual
    public double calculaSalarioAnual(){
        double salaanual = salario * 12;

        return salaanual;
    }


    //metodo calcula decimo terceiro
    public double calculaDecimoTerceiro(){
        double salaanual = salario * 13;

        return salaanual;
    }
}
