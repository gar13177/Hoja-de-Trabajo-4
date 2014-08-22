package HojaDeTrabajo;

/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

public class NodoCircular<T> extends BaseNodo{

   
    private NodoCircular<T> _anterior;

    public NodoCircular(T valor, NodoCircular<T> _siguiente, NodoCircular<T> _anterior)
    {
        this._siguiente = _siguiente;
        this._anterior = _anterior;
        _valor=valor;
    }
    
    public NodoCircular(T valor)
    {
        _valor=valor;
    }
    

    public void setSiguiente(NodoCircular<T> _siguiente) {
        this._siguiente = _siguiente;
    }

    public NodoCircular<T> getAnterior() {
        return _anterior;
    }

    public void setAnterior(NodoCircular<T> _anterior) {
        this._anterior = _anterior;
    }
}
