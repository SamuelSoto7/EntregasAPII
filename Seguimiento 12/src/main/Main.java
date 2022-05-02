package main;

import java.util.Scanner;

import structures.ShiftSystem;

public class Main {
Scanner sc=new Scanner(System.in);
ShiftSystem shift = new ShiftSystem();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.menu();
	}
	
	public void menu() {
		
		System.out.println("Qué desea hacer?\n");
		System.out.println("1. Dar turno\r\n"
				+ "2. Mostrar turno\r\n"
				+ "3. Pasar turno\r\n"
				+ "4. Eliminar turno actual\r\n"
				+ "");
		
		int option =sc.nextInt();
		
		switch(option) {
		case 1:
			darTurno();
			menu();
		case 2:
			mostrarTurno();
			menu();
		case 3:
			pasarTurno();
			menu();
		case 4: 
			eliminarTurno();
			menu();
		}
		
		
		
		
	}
	
	

	public void darTurno() {
		if(shift.addShift()) {
			System.out.println("Ya no se pueden añadir más turnos.");
		} else {
			System.out.println("Un nuevo turno ha sido añadido.\n");
		}
		
	}
	
	
	private void mostrarTurno() {
		if(shift.printShift()==-1) {
			System.out.println("Aún no se han añadido turnos.");
		} else {
			System.out.println("Siguiente turno: " + shift.printShift());
		}
			
	}
	
	private void pasarTurno() {
		
		int auxTurn = shift.printShift();
		
		if(shift.passShift()) {
			System.out.println("Turno " + auxTurn + " pasado al final de la lista.");
			System.out.println("Nota: Solo puede pasar 3 veces el mismo turno. Despues de esto, se eliminará.");
		} else {
			System.out.println("No hay ningun turno por pasar.");
			
		}
	}
	
	private void eliminarTurno() {
		
		if(shift.deleteActualShift()) {
			System.out.println("No hay ningun turno por eliminar.");
		} else {
			System.out.println("Turno eliminado.");
		}
			
	}
	
	
	
}