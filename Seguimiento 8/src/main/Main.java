package main;

import java.util.Scanner;
import model.PaisData;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PaisData data = new PaisData();
		
		System.out.println("Introduzca el número de paises que se registrarán:");
		int numCountry = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Introduzca los datos de cada pais separados por punto y coma");
		
		for (int i=0; i<numCountry; i++) {
			String entrada = sc.nextLine();
			String[] datosPais = entrada.split(";");
			String name = datosPais[0];
			int[] medallasPais = new int[6]; 
			
			for (int j=0; j<6; j++) {	
				medallasPais[j] = Integer.parseInt(datosPais[j+1]);	
			}	
			
			data.addPais(name,medallasPais[0],medallasPais[1],medallasPais[2],medallasPais[3],medallasPais[4],medallasPais[5]);
		
		}
		
		
		

	}

}
