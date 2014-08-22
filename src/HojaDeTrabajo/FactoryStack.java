/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

package HojaDeTrabajo;


public class FactoryStack<T> {
    
    //such that only one instance can ever exist
    static boolean instance_flag=false; //true if 1 instance
    
    public FactoryStack() throws SingletonException
    {
        if (instance_flag)
            throw new SingletonException("Solo se acepta un Stack");
        else
            instance_flag = true; //set flag for 1 instance
        
       
    }
    
    public void finalize()
    {
        instance_flag = false; //clear if destroyed
    }
    
    public AbstractStack<T> getStack(int entry, int tipoLista)
    {
        switch (entry)
        {
            case 1:
                return new StackArrayList<>(1);                                            
            case 2:
                return new StackVector<>();                  
            case 3:
                return new StackLista(tipoLista,0);
                         
            default:
                System.out.println("No se reconoce el ingreso");
                return null;
        }
    }
}
