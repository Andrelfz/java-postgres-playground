package com.example;

import java.time.LocalDate;
import java.util.Scanner;

class Eleitor {
    public String nomeCandidato;
    public LocalDate dataNascimento;
    public int anoNascimento;
    public int anoAtual;

    public int getAnoAtual() {
        return anoAtual;
    }
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    public String getNomeCandidato() {
        return nomeCandidato;
    }
    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public  int calcularIdade(){
        int calcularIdade = anoAtual - anoNascimento;

        if (calcularIdade < 16){
            System.out.println("Não pode votar");
        } 
        else if (calcularIdade > 15 && calcularIdade < 18) {
            System.out.println("Eleitor facultativo");
        } else if (calcularIdade >=18 && calcularIdade <= 70) {
            System.out.println("Eleitor obrigatorio");
            
        } else {
            
        }
          return calcularIdade;
    }
}
    



public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        Eleitor candidato = new Eleitor();
        System.out.print("Digite seu nome: ");
        candidato.setNomeCandidato(entradaDados.nextLine());
        System.out.print("Digite seu ano de nascimento: ");
        candidato.setAnoNascimento(entradaDados.nextInt());
        System.out.print("Digite o ano atual: ");
        candidato.setAnoAtual(entradaDados.nextInt());
        System.out.println("Nome do candidato: " + candidato.getNomeCandidato());
        System.out.println("Sua idade é: " + candidato.calcularIdade());
    }
    
}

