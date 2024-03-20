package org.example;

public class Serie {

    //Atributos da serie
    String nome;
    double note;
    int temporadas;
    boolean finalizada;

    Diretor d1;


    //construtor da serie
    public Serie(String nome, double note, int temporadas, boolean finalizada, String nomedire) {
        this.nome = nome;
        this.note = note;
        this.temporadas = temporadas;
        this.finalizada = finalizada;

        d1 = new Diretor(nomedire);
    }

    void mostrarInfo(){
        System.out.println("Informações da série");
        System.out.println("----------------------");
        System.out.println("Nome da serie: " + this.nome);
        System.out.println("Nota da serie: " + this.note);
        System.out.println("Temporadsa da serie: " + this.temporadas);
        System.out.println("Serie finalizada? " + this.finalizada);
        System.out.println("Nome do diretor: " + this.d1.nome);
    }
}
