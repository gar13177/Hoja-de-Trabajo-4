package HojaDeTrabajo;

/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

public class Lista<T> extends AbstractList<T>{
    
    private Nodo<T> Cabeza;
    private int tamaño;
    FactoryNodos _nFactory = new FactoryNodos();
 
    public Lista(){
    
        Cabeza = null;
        tamaño = 0;
    }

    @Override
    public void AgregarFinal(T valor){
    
        
        BaseNodo _newNodo = _nFactory.getNodo("1", valor,null);
        
        
        if (Cabeza != null){
           
            Nodo<T> NodoActual = Cabeza;
            while(NodoActual.getSiguiente()!=null){
                NodoActual = (Nodo<T>) NodoActual.getSiguiente();
            }
            NodoActual.setSiguiente((Nodo<T>) _newNodo);
        }
        else
            Cabeza = (Nodo<T>) _newNodo;
        
        tamaño++;
    }
    
    @Override
    public int getTamaño()
    
    {
        int elemento=0;
        Nodo<T> NodoActual = Cabeza;
        while (NodoActual!=null)
        {
            elemento++;
            NodoActual=(Nodo<T>) NodoActual.getSiguiente();
        }
        return elemento;
    }
    
    public boolean contieneValor(T valor){
        
        Nodo<T> NodoActual=Cabeza;
        while(NodoActual!=null&&!NodoActual.getValor().equals(valor))
        {
            NodoActual= (Nodo<T>) NodoActual.getSiguiente();
        }
        return NodoActual!=null;
    }
    
     public T Cabeza()
    
    {
        return (T) Cabeza.getValor();
    }
    
    @Override
    public void AgregarPrincipio(T valor)
    
    {
       
        Cabeza = new Nodo(valor, Cabeza);
        tamaño++;
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
            
            Nodo<T> NodoActual = Cabeza;
            
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = (Nodo<T>) NodoActual.getSiguiente();
            }
           NodoActual.setSiguiente(new Nodo(valor, (Nodo) NodoActual.getSiguiente()));
           tamaño++;
        }
        
    }
    
    @Override
    public void set(T valor, int posicion)
   
    {
        if (!(0<=posicion||posicion>=getTamaño())){
            System.out.println("Out of bounds");
        }
        Nodo<T> NodoActual = Cabeza;
        
        for (int i = 0; i<posicion;i++)
        {

            NodoActual = (Nodo<T>) NodoActual.getSiguiente();
        }
        NodoActual.setValor(valor);
    }
    
    public T RemoverPrimero()
    
    {
        Nodo<T> temp = Cabeza;
        Cabeza = (Nodo<T>) Cabeza.getSiguiente();
        tamaño--;
        return (T) temp.getValor();
    }
    
    
    @Override
    public T RemoverUltimo()
    
    {
        Nodo<T> NodoActual = Cabeza;
        Nodo<T> NodoAnterior = null;
        while (NodoActual.getSiguiente()!=null)
        {
            NodoAnterior= NodoActual;
            NodoActual = (Nodo<T>) NodoActual.getSiguiente();
        }
        
        if (NodoAnterior == null)
        {
           
            Cabeza= null;
        }
        else
        {
            NodoAnterior.setSiguiente(null);
        }
        tamaño--;
        return (T) NodoActual.getValor();
        
    }
   
    public T Remover (T valor)
    
    {
        Nodo<T> NodoActual = Cabeza;
        Nodo<T> NodoAnterior = null;
        while (NodoActual != null&&!NodoActual.getValor().equals(valor)){
            NodoAnterior = NodoActual;
            NodoActual = (Nodo<T>) NodoActual.getSiguiente();
        }   
        if (NodoActual != null){
            //si se encuentra e valor
            if (NodoAnterior  == null)//es el primero
                Cabeza = (Nodo<T>) NodoActual.getSiguiente();
            else 
                NodoAnterior.setSiguiente(NodoActual.getSiguiente());
            tamaño--;
            return (T) NodoActual.getValor();
        }
               
        return null;
    }
   

   


    @Override
    public T get(int pos)
    {
       if (pos<0||pos>=getTamaño()){
           System.out.println("position out of bounds");
           System.out.println(pos);
           
        }
    
    Nodo<T> NodoActual = Cabeza;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = (Nodo<T>) NodoActual.getSiguiente();
    }
    return (T) NodoActual.getValor();
          
     
    }
    
    public int indexOf(Object inputData) {
       Nodo<T> currentNode = this.Cabeza;
        int position = 0;
        boolean found = false;

        for (; ; position++) {
          if (currentNode == null) {
            break;
          }

          if (inputData.equals(currentNode.getValor())) {
            found = true;
            break;
          }

          currentNode = (Nodo<T>) currentNode.getSiguiente();
        }

        if (!found) {
          position = -1;
        }
        
        return position;
      }
    @Override
    public Comparable[] toArray()
    
    {
         Nodo<T> NodoActual = Cabeza;
        Comparable[] arreglo = new Comparable[getTamaño()];
        int i=0;
        while (NodoActual.getSiguiente()!=null)
        {
            arreglo[i]=(Comparable) NodoActual.getValor();
            NodoActual = (Nodo<T>) NodoActual.getSiguiente();
            i++;
        }
        arreglo[i]=(Comparable) NodoActual.getValor();
        return arreglo;
    }
    
    
    @Override
    public String toString(){
       Nodo Inicio = Cabeza;
       String strLista = "";
        System.out.println("Lista simple:");
       StringBuilder _sb = new    StringBuilder();
       _sb.append("[");
        if (Inicio != null){        
            while (true)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                
                if (Inicio.getSiguiente()==null)
                    break;
                Inicio = (Nodo) Inicio.getSiguiente();
            }
        }

    _sb.append(" null");
    _sb.append("]");
    return _sb.toString();
    }

    
}

