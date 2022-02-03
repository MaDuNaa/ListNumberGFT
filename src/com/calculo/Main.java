package com.calculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        Integer maiorNumero = 0;
        Integer menorNumero = null;
        Scanner scan = new Scanner(System.in);

        for(int i = 1 ; i <= 10; i++){
            System.out.println("Insira o " + i + "/10 numero -> ");
            Integer entrada = scan.nextInt();
            if(maiorNumero<entrada){
                maiorNumero=entrada;
            }
            if(menorNumero == null || menorNumero>entrada){
                menorNumero=entrada;
            }
            listInteger.add(entrada);
        }

        System.out.println("Maior numero -> ".concat(maiorNumero.toString()));
        System.out.println("Menor numero -> ".concat(menorNumero.toString()));
        printarMaioresQue(listInteger, 10);
        printarMaioresQue(listInteger, 50);
    }

    private static void printarMaioresQue(List<Integer> listInteger, Integer maioresQue) {
        List<Integer> maioresCinquentaList = listInteger.stream().filter(n -> n > maioresQue).collect(Collectors.toList());
        System.out.println("Qtd Maiores que  " + maioresQue + " ->  " + maioresCinquentaList.stream().count());
        System.out.println("Quais sao maiores que " + maioresQue);
        for (Integer i : maioresCinquentaList) {
            System.out.println(i);
        }
    }
}
