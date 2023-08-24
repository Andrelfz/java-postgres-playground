package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;

    double getRenda() {
        return renda;
    }

    public void setRenda(double renda){
        if (renda >= 0) {
            this.renda = renda;
    } else {
        System.out.println("Renda inválida.");
    }
}
public class AppClasses {

    
    public void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setRenda(10000);
        cliente.anoNascimento = 1980;
        cliente.sexo = 'M';
        System.out.println(cliente.getRenda());
        System.out.println(cliente.sexo);
        System.out.println(cliente.anoNascimento);
    }
}
public char getSexo() {
    return sexo;
}

public void setSexo(char sexo) {
    this.sexo = sexo;
}

public int getAnoNascimento() {
    return anoNascimento;
}

public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
} 
}

