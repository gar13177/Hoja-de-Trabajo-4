package HojaDeTrabajo;

/*
Vidal Villegas 131023
Kevin Garcia 13177
*/
public class FactoryListas<T> {

    public AbstractList<T> getLista(int  entry,int entry2){
        switch (entry2) {
            case 1:
                if (entry == 1)
                    return (AbstractList<T>) new Lista<Integer>();
                 if (entry==2)
                    return (AbstractList<T>) new ListaDoble<Integer>();
                if (entry==3) 
                    return (AbstractList<T>) new ListaCircular<Integer>();
            case 2:
                if (entry==1)
                    return (AbstractList<T>) new Lista<String>();
                if (entry==2)
                    return (AbstractList<T>) new ListaDoble<String>();
                if (entry==3)
                  return (AbstractList<T>) new ListaCircular<String>();
            case 3:
                if (entry==1)
                    return (AbstractList<T>) new Lista<Double>();
                if (entry==2)
                    return (AbstractList<T>) new ListaDoble<Double>();
                else
                    return (AbstractList<T>) new ListaCircular<Double>();
                
            default: 
                System.out.println("Opción incorrecta");
                return null;
                    }
    }
}
