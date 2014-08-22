package HojaDeTrabajo;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Kevin
 */
public class  Revision {
	private Scanner lector_prohibido;
	private String tempo;
	private String ultimo;

	



	
	public Revision ()throws IOException{
		
	}

	public String  Estudio () throws IOException{
		lector_prohibido = new Scanner (new BufferedReader(new FileReader("texto.txt")));


		do{
			tempo = lector_prohibido.nextLine();
			if(!" ".equals(tempo)){
				ultimo = ultimo + tempo + " ";
			}


		}while (lector_prohibido.hasNext() );
		return ultimo;	
	}
}
