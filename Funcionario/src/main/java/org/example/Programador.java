package org.example;

public class Programador extends Funcionario {
    private double valorBonus;

    public Programador(String name, double valorHora, double valorBonus){
        super(name,valorHora);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas){
        double salarioBase = super.calcularSalario(horasTrabalhadas);
        return salarioBase + valorBonus;
    }


    @Override
    public String toString() {
        return "Programador [nome=" + getName() + ", valorHora=" + getValorHora() + ", valorBonus=" + valorBonus + "]";
    }

}
