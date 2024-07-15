package org.example;

public class Holerite {
    private String nome;
    private String mesAno;
    private double valorSalario;


    public Holerite(String nome, String mesAno, double valorSalario) {
        this.nome = nome;
        this.mesAno = mesAno;
        this.valorSalario = valorSalario;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Mês/Ano: " + mesAno);
        System.out.println("Valor Salário: R$ " + valorSalario);
        System.out.println();
    }
}
