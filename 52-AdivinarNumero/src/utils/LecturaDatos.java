package utils;

import java.util.Scanner;

//ESTO HA SIDO MANGADO
public class LecturaDatos {
	
	@SuppressWarnings("resource")
	public static int LeerInt(){
		return new Scanner(System.in).nextInt();
	}
	
	public static int LeerInt(String msg){
		System.out.println(msg);
		return LeerInt();
	}	
	
	public static String LeerTexto(){
		Scanner teclado=new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static String LeerTexto(String msg){
		System.out.println(msg);
		return LeerTexto();
	}
}
