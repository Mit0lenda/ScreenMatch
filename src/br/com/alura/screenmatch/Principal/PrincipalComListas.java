package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme =new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(9);
        var filmeDoVini = new Filme("barbie",2005);
        filmeDoVini.avalia(8);
        Serie lost = new Serie("Lost",2000);

        Filme f1 = filmeDoVini;

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();

        listaDeAssistidos.add(filmeDoVini);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for(Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme  && filme.getClassificacao()>2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            //Filme filme = (Filme) item;

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Vinicius");
        buscaPorArtista.add("Nicollas");
        buscaPorArtista.add("Joao");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo :: getAnoDeLancamento));
        System.out.println("Ordenando Por Ano:");
        System.out.println(listaDeAssistidos);
    }
}
