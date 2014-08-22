/*
Vidal Villegas 131023
Kevin Garcia 13177
*/


package HojaDeTrabajo;


public class StackLista<T> extends AbstractStack<T> {
    
    private int sp;
    private AbstractList<T> _pila;
    
    
    public StackLista(int tipoLista,T valor)
    {
        FactoryListas _nFactory = new FactoryListas();
        //se implementa el tipo Integer
        //si se quiere cambiar el tipo, basta con cambiar este tipo, las entradas 
        //y el parametro del bubblesort
         _pila = _nFactory.getLista(tipoLista, 3);
         for (int i = 0; i < 100; i++)
            _pila.AgregarFinal(valor);
         sp = _pila.getTamaño()-1;
        
    }

    @Override
    public T pop() {
       
    {
        T dato = null;
        if ((this.sp < _pila.getTamaño()) && (this.sp > 0))
        {            
            sp++;
            dato = (T)  _pila.get(sp);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }
}

    @Override
    public void push(T dato) 
    {
         
         if ((this.sp < _pila.getTamaño()) && (this.sp >0))
        {           
            _pila.set(dato, sp);            
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    public boolean isEmpty() {
        return _pila.isEmpty();
    }

}
