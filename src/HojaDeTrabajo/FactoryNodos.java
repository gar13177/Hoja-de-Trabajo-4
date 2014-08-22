package HojaDeTrabajo;
/*
Vidal Villegas 131023
Kevin Garcia 13177
*/
public class FactoryNodos<T> {

    public BaseNodo<T> getNodo(String entry, T valor, NodoDoble<T> Cola){
        switch (entry) {
            case "1":
                return new Nodo<>(valor);
            case "2":
                return new NodoDoble<>(valor, null, Cola);
            default:
                return new NodoCircular<>(valor);
        }
    }
}
