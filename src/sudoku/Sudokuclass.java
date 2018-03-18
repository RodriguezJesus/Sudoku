/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;

/**
 *La clase Sudokuclass donde vamos a montar la estructura funcional del sudoku
 * @author user
 */
public class Sudokuclass {
    ArrayList<ArrayList> matrizsudoku=new ArrayList<>();
    
    /**
     * Un metodo o constructor de la clase Sudokuclass donde inicializaremos los valores por defecto
     */
    public Sudokuclass() {
    this.matrizsudoku=matrizsudoku;
    }
/**
 * El metodo inicializar el cual inicializara el sudoku 
 */
    public void inicializar() {
        
    }
/**
 * Un metodo to String que va a escribir en pantalla lo elegido y lo devolvera
 * @return 
 */
    @Override
    public String toString() {
        String resultadoFinal = "";
        return resultadoFinal;
    }
/**
 * Metodo modificarElemento que lanza una excepcion , se le pasa por parametros una fila una columna y el propio elemento
 * @param fila
 * @param columna
 * @param elemento
 * @throws SudokuException 
 */
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException {
    }
/**
 * Un metodo vaciarElemento al que se le pasa dos elementos la fila y columna, y vacia el numero del elemento seleccionado
 * @param fila
 * @param columna 
 */
    public void vaciarElemento(int fila, int columna) {
    }
/**
 * Un metodo comprobarFila al que se le pasa una fila y un elemento y el cual tiene que comprobar que ese elemento no se repite en las filas o en las columnas,devuelve el resultado
 * @param fila
 * @param elemento
 * @return 
 */
    private boolean comprobarFila(int fila, int elemento) {
        boolean resultado = true;
        return resultado;
    }
/**
 * Un metodo comprobar columna al cual se le pasan el elemento y la columna y este busca el elemento en esa columna y devuelve el resultado
 * @param columna
 * @param elemento
 * @return 
 */
    private boolean comprobarColumna(int columna, int elemento) {
        boolean resultado = true;
        return resultado;
    }
/**
 * Un metodo comprobar cuandrante el cual comprobara las celdas encadenadas de 9x9 tanto sus filas como sus columnas naturalmente pasandole un elemento que es devuelto
 * @param fila
 * @param columna
 * @param elemento
 * @return 
 */
    private boolean comprobarCuadrante(int fila, int columna, int elemento) {
        boolean resultado = true;
        return resultado;
    }
/**
 * Un metodo puedoInsertar el cual inserta la fila la columna y el elemento y comprueba si se puede poner ese elemento o no devolviendolo
 * @param fila
 * @param columna
 * @param elemento
 * @return 
 */
    private boolean puedoInsertar(int fila, int columna, int elemento) {
        boolean resultado = false;
        return resultado;
    }
}
