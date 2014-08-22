package HojaDeTrabajo;

/*
Vidal Villegas 131023
Kevin Garcia 13177
*/


public class Nodo<T> extends BaseNodo {
   
    
    public Nodo()
    
    {
        _valor = null;
        _siguiente = null;
    }
    
    public Nodo(T valor, Nodo<T> siguiente)
    {
   
        _valor = valor;
        _siguiente = siguiente;
    }
    
    
    public Nodo(T valor){
        _valor = valor;
        _siguiente = null;
       
    }
   
    public void setSiguiente(Nodo<T> _siguiente) {
        this._siguiente = _siguiente;
    }
    
    
}