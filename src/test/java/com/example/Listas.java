package com.example;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Eleitor> ListaEleitor = new ArrayList<>();
        Eleitor joao = new Eleitor();
        Eleitor maria = new Eleitor();
        joao.setNomeCandidato("joao lucas");
        maria.setNomeCandidato("maria clara");

        ListaEleitor.add(joao);
        ListaEleitor.add(maria);
        ListaEleitor.add(joao);
        ListaEleitor.add(joao);
        ListaEleitor.add(joao);

        System.out.println(ListaEleitor);
    }
}
