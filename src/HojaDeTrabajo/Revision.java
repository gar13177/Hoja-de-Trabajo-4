
package HojaDeTrabajo;

import java.util.Scanner;
import java.io.*;

public class  Revision {
	private Scanner lector_prohibido;
	private String tempo;
	private int contador;
	private String ultimo;

	



	
	public Revision (){
				ultimo ="";
	}

	public String  Estudio () throws IOException{
		
		lector_prohibido = new Scanner (new BufferedReader(new FileReader("texto.txt")));

		do{
			String tempo = lector_prohibido.nextLine();
			if(tempo != " "){
				ultimo = ultimo + tempo + " ";
			}


		}while (lector_prohibido.hasNext() );
		return ultimo;	
	}
}
