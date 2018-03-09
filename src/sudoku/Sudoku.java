/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Iniciar/Reiniciar");
        String menudeinicio = teclado.nextLine();
        if (menudeinicio.equals("Iniciar")) {
            
        }
        if (menudeinicio.equals("Reiniciar")) {
            
        }
        System.out.println("Coordenadas de la casilla para la colocacion del numero");
        String coordenadas=teclado.nextLine();
        
    }

}
