package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import model.Pais;
import model.PaisData;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static PaisData data = new PaisData();
	
	public static void main(String[] args) {
		
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Introducir paises por consola");
		System.out.println("2. Leer archivo .txt");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			consola();
		case 2:
			try {
				archivo();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}
	
	
	
	public static void consola() {
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
			
			Pais newPais = new Pais(name,medallasPais[0],medallasPais[1],medallasPais[2],medallasPais[3],medallasPais[4],medallasPais[5]);
			data.addPais(newPais);
			
			ordenar();
		
		}
		
		
	}
	
	
	
	public static void ordenar() {
		data.sortByComparator();
		data.printMale();
		data.sortByComparable();
		data.printFemale();
		data.sortByInsertion();
		data.printInsertion();
	}
	
	
	
	public static void archivo() throws IOException{
			
		BufferedReader br = new BufferedReader (new FileReader("Paises.txt"));
		
		for(int i=0; i<25; i++) {

			String line = br.readLine();
			
			String[] datosPais = line.split(";");
			String name = datosPais[0];
			int[] medallasPais = new int[6]; 
			
			for (int j=0; j<6; j++) {	
				medallasPais[j] = Integer.parseInt(datosPais[j+1]);	
			}	
			
			Pais newPais = new Pais(name,medallasPais[0],medallasPais[1],medallasPais[2],medallasPais[3],medallasPais[4],medallasPais[5]);
			data.addPais(newPais);
		}
		
		br.close();
		ordenar();
		
		}
	
	
	}
	
	


