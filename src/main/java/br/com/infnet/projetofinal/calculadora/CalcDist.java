package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalcDist {
    //deve calcular a distancia entre dois pontos no plano cartesiano
    //usando a formula
    public void distancia(){
        Ponto pontoA, pontoB;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os valores de X e Y do primeiro ponto, separados por virgula X,Y");
        String[] temp = entrada.next().split(",");
        pontoA = new Ponto(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));

        System.out.println("Digite os valores de X e Y do segundo ponto, separados por virgula X,Y");
        temp = entrada.next().split(",");
        pontoB = new Ponto(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));

        System.out.println("A distância entre os dois pontos é de " + calcularDistanciaFormatada(pontoA, pontoB) + " unidades");
    }

    String calcularDistanciaFormatada(Ponto pontoA, Ponto pontoB){
        double distancia = Math.sqrt(Math.pow((pontoB.getX() - pontoA.getX()), 2) +  Math.pow((pontoB.getY() - pontoA.getY()), 2));
        NumberFormat formatter = new DecimalFormat("#0.0000");
        return formatter.format(distancia);
    }

    public static void main(String[] args) {
        CalcDist calcDist = new CalcDist();
        calcDist.distancia();
    }
}
