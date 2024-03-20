package org.example;

public class Plataforma {

    //atributos da plataforma
    String nomeplat;
    Serie[] series = new Serie[10];

    void mostraInfo(){
        System.out.println("Nome da Plataforma: "+this.nomeplat);
        System.out.println("Informacoes das Serie: ");
        System.out.println("-------------------------");
        for (int i = 0; i < series.length; i++)
        {
            if(series[i]!=null)
            {
                series[i].mostrarInfo();
            }
        }
    }

    void addSerie(Serie ss){
        for (int i = 0; i < series.length; i++)
        {
            if(series[i]==null)
            {
                series[i] = ss;
                System.out.println("Serie adicionada!");
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){
        
        int maislonga = 0;
        int aux = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if (series[i].finalizada ==true) {
                    if(maislonga<series[i].temporadas){
                        maislonga = series[i].temporadas;
                        aux = i;
                    }
                }
            }
        }
        return series[aux].nome;
    }

    void mediaPorcentagem(){
        int total = 0;
        int trestemp = 0;
        double porcentagem, media, soma=0;

        for (int i = 0; i < series.length; i++) {
            if (series[i]!=null){
                total++;
                if (series[i].temporadas>=3){
                    trestemp++;
                    soma = soma + series[i].note;
                }
            }

        }
        porcentagem = (float) (trestemp/total) *100;
        media = soma/trestemp;

        System.out.println( "Porcentagem de series com 3 temporadas: " + porcentagem + "%");
        System.out.println("Media das notas: "+ media);
    }
}
