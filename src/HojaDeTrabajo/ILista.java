package HojaDeTrabajo;

/**
 * Universidad Del Valle de Guatemala
 * Pablo Diaz 13203
 * Interfaz con los métodos comunes en una lista genérica
 */


/**
 *
 * @author Pablo
 * @param <T>
 */
public interface ILista<T> {
    
    
    public int getTamaño();
   // post: regresa el tamaño de la lista

   public boolean isEmpty();
   // post: regresa true si la lista esta vacía
   
   public void AgregarPrincipio(T value);
   // post: agrega un valor al principio de la lista

   public void AgregarFinal(T value);
   // post: agrega un valor al final de la lista

   public T RemoverUltimo();
   // pre: lista no está vacía
   // post: quita el último valor de la lista
   
    @Override
   public String toString();
   //post: muestra la lista
   
   public T get(int pos);
   //post: devuelve un valor en la posicion
   
   public void set(T valor, int pos);
   //post: pone un valor en la posicion
   
   public Comparable[] toArray();
   //post: mete los valores en un arreglo comparable
   
   public void Agregar(T valor, int pos);
   //post: agregar un valor en determinada posicion
         
}
