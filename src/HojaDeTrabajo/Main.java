/*
Vidal Villegas 131023
Kevin Garcia 13177
*/

package HojaDeTrabajo;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in  = new Scanner(System.in);
        Revision archivo = new Revision();
        String exp = archivo.Estudio();
        System.out.println("Cadena a evaluar:");
        System.out.println(exp);
        
        int opcion;
        int opcion2 = 0;        
        FactoryStack factory, factoryP;
        AbstractStack stack;
        System.out.println("Ingrese forma para guardarlo");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");        
        opcion = in.nextInt();     
        if (opcion == 3)
        {
            System.out.println("Ingrese la forma de guardado ");
            System.out.println("1. Lista Sencilla");
            System.out.println("2. Lista Doblemente enlazada");
            System.out.println("3. Lista D. Circular");       
            opcion2 = in.nextInt();
        }       
        try 
        {
            factory = new FactoryStack();
            stack = factory.getStack(opcion, opcion2);
            
            double respuesta;
            respuesta = stack.eval(exp,stack);        
            System.out.println("Respuesta: " + respuesta);
        }
        catch (SingletonException e)
        {
            System.out.println(e.getMessage());
        }        
    }
}
