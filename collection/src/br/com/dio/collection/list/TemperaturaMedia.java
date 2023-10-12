package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TemperaturaMedia {
    /*

    Receba a temperatura média dos 6 primeiros  meses do ano e armazene em uma lista
    Calcule a média semestral das temperaturas e mostre todas as temperaturas acima dessa média e em que mes
    elas ocorreram

     */

    private static Double soma = 0d;


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturaMensal = new ArrayList<>();

        int count = 0;
        for (count = 0 ; count < 6; count++) {
            System.out.println("Insira a temperatura do mês " + (count+1)  + ":");
            Double valorEntrada = scan.nextDouble();

            temperaturaMensal.add(valorEntrada);
            soma += valorEntrada;
        }

        System.out.println(temperaturaMensal);
        Double temperaturaMedia = soma / 6;

        System.out.printf("A temperatura média do semestre foi: %.1f ºc. \n", temperaturaMedia);

        int contador = 0;
        for (contador = 0 ; contador < 6 ; contador++){
            if (temperaturaMedia < temperaturaMensal.get(contador)){
                System.out.println("a temperatura do mês " + (contador+1)+ " foi maior do que a média semestral, a temperatura do mês foi de " + temperaturaMensal.get(contador) +"ºC");
            }
        }

    }

}
