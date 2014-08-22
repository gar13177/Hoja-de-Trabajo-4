package HojaDeTrabajo;

/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

public class NodoDoble<T> extends BaseNodo{

   
    private NodoDoble<T> _anterior;
    
    public NodoDoble()
   
    {
        _valor=null;
        _siguiente=null;
        _anterior=null;
    }
    
    public NodoDoble(T valor)
    
    {
        _valor=valor;
        _siguiente = null;
        _anterior = null;
    }
    public NodoDoble (T valor, NodoDoble<T> siguiente, NodoDoble<T> anterior)
   
    {
      _valor = valor;
      _siguiente = siguiente;
      _anterior=anterior;
     
    }
    
    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }

    
    public NodoDoble<T> getAnterior() {
        return _anterior;
    }

    public void setAnterior(NodoDoble<T> _anterior) {
        this._anterior = _anterior;
    }
    
    public void setSiguiente(NodoDoble<T> _siguiente) {
        this._siguiente = _siguiente;
    }
    
}
