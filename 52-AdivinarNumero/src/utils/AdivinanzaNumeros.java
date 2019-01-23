package utils;

import java.util.InputMismatchException;
import java.util.Random;


/*//Agregar logger para segunda version
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/
//JAVA TIENE SU PROPIO LOGGER

public class AdivinanzaNumeros {
	public static void adivinarNumero() throws FueraRangoException {
		final int minNum = 1;
		final int maxNum = 100;
		
		Random randomNum = new Random();
		int userNum = 0;
		int intentos = 0;
		
		int cpuNum = randomNum.nextInt((maxNum - minNum) + minNum) + minNum;
		System.out.println("Numero CPU: " + cpuNum); //trampita
		
		do {
			try {				
				userNum = LecturaDatos.LeerInt("Di un numero del 1 al 100");				
				try {
					if (userNum < minNum || userNum > maxNum) 
						throw new FueraRangoException("Rango entre " + minNum + " y " + maxNum); 						
				} catch (FueraRangoException a) {
					System.out.println("Has superado el rango. Error: " + a); //el mensaje de error meh
				}				 
			} catch (InputMismatchException e) {
				System.out.println("Tienes que introducir un numero. Error: " + e);
				
			} finally {
				
				if (cpuNum == userNum) {
					intentos++;
					System.out.println("¡Has acertado! Y solo en " + intentos + " intentos. El numero era " + cpuNum + "."); //se podria usar un metodo Writer
				} else {
					System.out.println("¡No has acertado! Vuelve a intentarlo.");
					intentos++;
				}	
			}					
			
		} while (cpuNum != userNum);
	}
}
