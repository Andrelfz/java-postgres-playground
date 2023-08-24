package com;

import java.util.Scanner;

class Cliente {
        private String nomeCliente;
        public String cpf;
        public int anoNascimento;

    String getCpf (){
        return cpf;
    }
    void setCpf (String cpf){
        this.cpf = cpf;
        }

    String getNomeCliente(){
        return nomeCliente;
    }
    void setNomeCliente (String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    int getAnoNascimento(){
        return anoNascimento;
    }
    void setAnoNascimento (int anoNascimento){
       if(anoNascimento >= 0) { 
        this.anoNascimento = anoNascimento;}
       else {
        System.out.println("Ano de Nascimento inválido");
    }
    } 
    }
    class Funcionario{
        private String nomeFuncionario;
        private double salario;
        private double identificador;
        public String cpf;
        public int anoNascimento;
       
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public int getAnoNascimento() {
            return anoNascimento;
        }
        public void setAnoNascimento(int anoNascimento) {
            this.anoNascimento = anoNascimento;
        }
        public String getNomeFuncionario() {
            return nomeFuncionario;
        }
        public void setNomeFuncionario(String nomeFuncionario) {
            this.nomeFuncionario = nomeFuncionario;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public double getIdentificador() {
            return identificador;
        }
        public void setIdentificador(double identificador) {
            this.identificador = identificador;
        }
       
  
    }

    
public class ClassesJava {
    public static void main(String[] args) {
        
        Cliente andre = new Cliente();
        andre.setCpf("0222227689242");
        andre.setNomeCliente("André Luiz");
        andre.setAnoNascimento(1996);
        Funcionario jorge = new Funcionario();
        jorge.setCpf("0222227689242");
        jorge.setAnoNascimento(1988);
        Scanner entradaDados = new Scanner(System.in);
        

        
       
        if(andre.getCpf().equals(jorge.getCpf())){
            System.out.println("Inválido, os CPFs são iguais!");
        } else System.out.println("Correto, os cpfs são diferentes");
       var vetorNome = andre.getNomeCliente().split(" ");
        System.out.println("Primeiro nome do Cliente: " + vetorNome[0]);
        System.out.println("Sobrenome do Cliente: " + vetorNome[1]);
        System.out.println("CPF do Cliente: " + andre.getCpf());
        System.out.println("Ano de Nascimento do Cliente: " + andre.getAnoNascimento());

        }



       
    }

