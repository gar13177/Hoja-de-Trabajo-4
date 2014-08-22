package HojaDeTrabajo;
/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

public class ListaCircular<T> extends AbstractList<T>{

    private NodoCircular<T> Cola;
    private int tamaño;
    FactoryNodos _nFactory = new FactoryNodos();
    
    public ListaCircular ()
    
    {
        Cola = null;
        tamaño = 0;
    }

    @Override
    public int getTamaño() 
   
    {
        return tamaño;
    }
    
    public void Agregar(T valor)
   
    {
    NodoCircular newNode = new NodoCircular(valor);
    newNode.setSiguiente(Cola);
    Cola = newNode;
    }   
    
    @Override
    public void AgregarFinal(T valor)
   
    {
        AgregarPrincipio(valor);
        
                
        Cola = (NodoCircular<T>) Cola.getSiguiente();
        
    }
    @Override
    public void AgregarPrincipio(T valor)
    
    {
       BaseNodo _newNodo = _nFactory.getNodo("3", valor,null);
       NodoCircular<T> temp = new NodoCircular<>(valor);
       if (Cola == null) { 
           Cola = temp;
           Cola.setSiguiente(Cola);
       } else { 
           temp.setSiguiente(Cola.getSiguiente());
            Cola.setSiguiente(temp);
       }
       tamaño++;
    }
       
    @Override
    public T RemoverUltimo()
   
    {
    
        NodoCircular<T> NodoActual=Cola;
        while(NodoActual.getSiguiente()!=Cola)
        {
            NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
        }
       
        if (NodoActual == Cola)
            Cola=null;
        else
        {
            NodoActual.setSiguiente(Cola.getSiguiente());
            Cola = NodoActual;
        }
        
        tamaño--;
        return (T) NodoActual.getValor();
    }
    

    @Override
    public T get(int pos) 
    
    {
         if (pos<0||pos>=getTamaño()){
           System.out.println("position out of bounds");
           System.out.println(pos);
           
        }   
    
    NodoCircular<T> NodoActual = Cola;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
    }
    return (T) NodoActual.getValor();
    }

    @Override
    public void set(T valor, int posicion) 
   
    {
        if (!(0<=posicion||posicion>=getTamaño())){
            System.out.println("Out of bounds");
        }
        NodoCircular<T> NodoActual = (NodoCircular<T>) Cola.getSiguiente();
        
        for (int i = 0; i<posicion;i++)
        {

            NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
        }
        NodoActual.setValor(valor);
    }

    
    @Override
     public void Agregar (T valor, int posicion)
    
    {
        if (!(0<=posicion||posicion>=getTamaño())){
            System.out.println("Out of bounds");
        }
        
        if (posicion==getTamaño()-1)
            AgregarFinal(valor);
        else if (posicion==0){
            AgregarPrincipio(valor); tamaño++;
        } 
        else
        {
            
            NodoCircular<T> NodoActual = Cola;
          
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
            }
         
           NodoActual.setSiguiente(new NodoCircular(valor, (NodoCircular) NodoActual.getSiguiente(),null));
           tamaño++;
        }
        
    }
   @Override
    public Comparable[] toArray()
    
    {
        NodoCircular<T> NodoActual = (NodoCircular<T>) Cola.getSiguiente();
        Comparable[] arreglo = new Comparable[getTamaño()];
        int i=0;
        while (NodoActual.getSiguiente()!=Cola.getSiguiente())
        {
            arreglo[i]=(Comparable) NodoActual.getValor();
            NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
            i++;
        }
        arreglo[i]=(Comparable) NodoActual.getValor();
        return arreglo;
    }
    @Override
    public String toString()
    
    {
        System.out.println("Lista circular");
        StringBuilder str = new StringBuilder();
        NodoCircular<T> curr = (NodoCircular<T>) Cola.getSiguiente();
        str.append("[");
        while (true) {
            str.append(curr.getValor());
            str.append(" -> ");
            curr = (NodoCircular<T>) curr.getSiguiente();
            if (curr == Cola) break;
        }
        str.append(curr.getValor());
        str.append(" null ");
        str.append("]");
        return str.toString();
    }

    @Override
    public T Remover(T valor) {
    
    {  
        NodoCircular<T> NodoActual = (NodoCircular<T>) Cola.getSiguiente();
        NodoCircular<T> NodoAnterior = null;
        while (NodoActual != null&&!NodoActual.getValor().equals(valor)){
            NodoAnterior = NodoActual;
            NodoActual = (NodoCircular<T>) NodoActual.getSiguiente();
        }   
        if (NodoActual != null){
            //si se encuentra e valor
            if (NodoAnterior  == null)//es el primero
                Cola = (NodoCircular<T>) NodoActual.getSiguiente();
            else 
                NodoAnterior.setSiguiente(NodoActual.getSiguiente());
            tamaño--;
            return (T) NodoActual.getValor();
        }
               
        return null;
    }}

    
}
