/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HojaDeTrabajo;

/**
 *
 * @author Oscar
 */
public class ListaSimple<T> extends Lista{

    @Override
    public void Agregar(Object valor) {


        NodoSimple<T> _newNodo = new NodoSimple(valor);

        

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;

        }
        
    }

    
}
