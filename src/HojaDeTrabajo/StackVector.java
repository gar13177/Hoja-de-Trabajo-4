/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

package HojaDeTrabajo;

import java.util.Vector;


public class StackVector<T> extends AbstractStack<T> {
    
    private int sp;
    private Vector pila;
    
    public StackVector()
    {
        pila = new Vector();
        pila.setSize(10);
        sp = pila.size()-1;
    }

    public StackVector(int tamaño)
    {
        pila = new Vector(tamaño);               
        sp =  pila .size()-1;
    }
    @Override
    public T pop() 
   
    {
        T dato = null;
        if ((this.sp <  pila .size()) && (this.sp > 0))
        {            
            sp++;
            dato = (T)  pila .get(sp);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }

    @Override
    public void push(T dato) 
   
    {
        
         if ((this.sp <  pila.size() ) && (this.sp >0))
        {           
            pila .set(sp, dato);           
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    public boolean isEmpty() 
    
    {
        return  pila.isEmpty();
    }

}
