/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *La main clase sudoku
 * @author Jesus
 */
public class Sudoku {

    /**
     * El metodo main donde escribimos todo lo deseado en el main
     * @param args 
     */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Iniciar sudoku \n"
                + "2.Reiniciar sudoku \n" +
                    "3. Realizar movimiento\n" +
                    "4. Vaciar casilla \n" +
                    "5. Mostrar sudoku \n" +
                    "6. Terminar");
        int menu=teclado.nextInt();
        /**
          * Menu switch para la eleccion simple de cada apartado
          */
        switch(menu)
        {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
        }    
    }

}
