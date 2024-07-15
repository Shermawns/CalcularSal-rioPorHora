package org.example;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 50);
        Holerite holerite = f1.gerarHolerite(23,"05/07");
        holerite.imprimir();
        System.out.println(f1.toString());


        Programador p1 = new Programador("Shermann",65,300);
        Holerite holerite1 = p1.gerarHolerite(23,"10/07");
        holerite1.imprimir();
        System.out.println(p1.toString());
    }
}
