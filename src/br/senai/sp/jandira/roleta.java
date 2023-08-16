package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class roleta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um numero de 1 a 10 ");
        int numeroU = teclado.nextInt();


        Random aleatorio = new Random();
        int numeroP = aleatorio.nextInt(10);


        System.out.println("Você escolheu: " + numeroU);
        System.out.println("O número aleatorio é: " + numeroP);


        if (numeroP == numeroU){
            System.out.println("vc morreu");
        }else{
            System.out.println("vc viveu");
        }


    }
}
