package org.example;

public class Funcionario{
    private String name;
    private double valorHora;

    public Funcionario(String name, double valorHora){
        this.name = name;
        this.valorHora = valorHora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        return horasTrabalhadas * valorHora;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double salario = calcularSalario(horasTrabalhadas);
        Holerite holerite = new Holerite(name, mesAno, salario);
        return new Holerite(name, mesAno, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }

}