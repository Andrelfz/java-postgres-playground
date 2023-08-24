package com.example;

public class AppFor {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        
       for (int i = 0; i < vetor.length; i++) {
        vetor[i] = vetor[i] + 1;
        vetor[i] = vetor[i]++;
       } 
       System.out.println(vetor[2]);
    }
}
