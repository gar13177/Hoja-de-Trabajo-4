package HojaDeTrabajo;


/*
Vidal Villegas 131023
Kevin Garcia 13177
*/


public abstract class AbstractList<T> implements ILista<T>{
    private Nodo<T> Cabeza;
    private int tamaño;
      
 
   @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return getTamaño() == 0;
   }
   
   public abstract T Remover(T valor);
}
