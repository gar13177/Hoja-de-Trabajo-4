import java.util.Scanner;
import java.io.File;
import java.io.*;

public class  Revision {
	private Scanner lector_prohibido;
	private String tempo;
	private int h,k;
	private boolean valor;



	
	public Revision (){
		
	}

	public boolean Estudio (int x,int  y) throws IOException{
		lector_prohibido = new Scanner (new BufferedReader(new FileReader("texto.txt")));
		do{
			String tempo = lector_prohibido.nextLine();
		
			if (tempo.length()==7)
			{
				char[] arregloCoordenadas = tempo.toCharArray();
				h = Character.getNumericValue(arregloCoordenadas[0])*100+Character.getNumericValue(arregloCoordenadas[1])*10+Character.getNumericValue(arregloCoordenadas[2]);
				k = Character.getNumericValue(arregloCoordenadas[4])*100+Character.getNumericValue(arregloCoordenadas[5])*10+Character.getNumericValue(arregloCoordenadas[6]);
				//Se compara la posible posicion del pacman con una lista de posicionesdonde si puede viajar y devuelve un true si esta posibilitado para hacerlo

				if ((x  == h) && (y == k)){
					
					valor = true;
				}
			else{
					valor = false;
				}
			}
		}while (lector_prohibido.hasNext() && (valor == false ));
		return valor;	
	}
}
