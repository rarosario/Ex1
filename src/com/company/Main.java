package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double fabrica;
        double precoProduto;
        double lucro = 25;

        lucro = lucro / 100;

        System.out.print("Digite o valor: ");
        precoProduto = teclado.nextDouble();

        System.out.print("Digite a fabrica: ");
        fabrica = teclado.nextDouble();


        if (fabrica == 1){
            precoProduto = (precoProduto + (precoProduto * 7 /100)) + ((precoProduto +(precoProduto * 7 / 100 )) * lucro);
            System.out.println("A distância é de 500 km, o valor do frete será = 7%");
        } else if (fabrica == 2){
            precoProduto = (precoProduto + (precoProduto * 15 /100)) + ((precoProduto +(precoProduto * 15 / 100 )) * lucro);
            System.out.println("A distância é de 780 km, o valor do frete será = 15%");
        } else if (fabrica == 3){
            precoProduto = (precoProduto + (precoProduto * 22 /100)) + ((precoProduto +(precoProduto * 22 / 100 )) * lucro);
            System.out.println("A distância é de 1200 km, o valor do frete será = 22%");
        } else if (fabrica > 3){
            System.out.println("Fabrica não encontrada");
        }

        System.out.println("o Preço total é " + precoProduto);
    }
}
