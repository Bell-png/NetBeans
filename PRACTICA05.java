/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica05;

/**
 *
 * @author Belinda
 */
public class PRACTICA05 {

    public static void main(String[] args) {
        int[][] matriz = {
            {8, 3, 5},
            {2, 1, 9},
            {4, 6, 7}
        };

        int menor = matriz[0][0]; 
        int filaMenor = 0;
        int columnaMenor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }

        System.out.println("El menor elemento de la matriz es: " + menor);
        System.out.println("Se encuentra en la celda: (" + filaMenor + ", " + columnaMenor + ")");
    }
}