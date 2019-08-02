/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testrepo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Juego {
    public static void main(String[] args) {
        
        int numeroaleatorio, numero;
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int contador = 0;
        do{
        System.out.println("Dame un número entre uno y veinte");
        numero = Integer.parseInt( teclado.nextLine());
        numeroaleatorio = r.nextInt(20)+1;
        if (numero == numeroaleatorio){
            System.err.println("Ganaste con el número "+numero);
        }
        else{
            System.err.println("Pailas, el número correcto era "+numeroaleatorio+" y no "+numero);
        }
        contador++;
        }
        while (numero != numeroaleatorio);
    }
}
