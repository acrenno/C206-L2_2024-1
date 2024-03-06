package org.example;

public class Main {
    public static void main(String[] args) {

        //criando dois funcionarios a partir do construtor com paramentros
        Funcionario func1 = new Funcionario("Gabriel", 21, 1100);
        Funcionario func2 = new Funcionario("Eduardo", 20, 800);


         /*
        Funcionario func1 = new Funcionario();
        func1.nome = "Eduardo";
        func1.idade = 20;
        func1.salario= 1100;

        Funcionario func2 = new Funcionario();
        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;

         */


        //saindo com caracteristica dos funcionarios
        System.out.println("Saindo com caracteristicas dos funcionarios");
        System.out.println("O nome do funcionario é " + func1.nome);
        System.out.println("A idade do funcionario é " + func1.idade);
        System.out.println("O salario do funcionario é " + func1.salario);
        //System.out.println(func1); //saindo com o endereço de memoria do funcionario
        System.out.println();
        System.out.println("O nome do funcionario é " + func2.nome);
        System.out.println("A idade do funcionario é " +func2.idade);
        System.out.println("O salario do funcionario é " + func2.salario);
        //System.out.println(func2); //endereço de memoria do funcionario 2


        //saindo com os salarios anuais
        System.out.println("O salario anual do " + func1.nome + " é " + func1.calculaSalarioAnual());
        System.out.println("O salario anual do " + func2.nome + " é " + func2.calculaSalarioAnual());

        //saindo com os salarios mais decimo terceiro
        System.out.println("Salario com decimo terceiro do " + func1.nome + " é " + func1.calculaDecimoTerceiro());
        System.out.println("Salario com decimo terceiro do " + func2.nome + " é " + func2.calculaDecimoTerceiro());


    }
}