package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaisData {

	public ArrayList <Pais> countries;
	
	public PaisData() {
		countries = new ArrayList<>();
	}
	
	public ArrayList getPais() {
		return countries;
	}
	
	public void addPais(Pais p) {
		countries.add(p);
	}
	
	
	public void printMale() {
		System.out.println("Masculino");
		for (Pais p:countries) {
			System.out.println(p.getName() +" "+ p.getMaleGoldMedals() +" "+ p.getMaleSilverMedals() +" "+ p.getMaleBronzeMedals());
		}
	}
	
	public void printFemale() {
		System.out.println("\n----------\n");
		System.out.println("Femenino");
		for (Pais p:countries) {
			System.out.println(p.getName() +" "+ p.getFemaleGoldMedals() +" "+ p.getFemaleSilverMedals() +" "+ p.getFemaleBronzeMedals());
		}
	}
	
	
	public void sortByComparator() {
		Collections.sort(countries, new Comparator<Pais>(){
			@Override
			public int compare(Pais p1,Pais p2) {
				if(p2.getMaleGoldMedals() == p1.getMaleGoldMedals()) {
					return p2.getMaleSilverMedals()-p1.getMaleSilverMedals();
					
				} else if(p2.getMaleSilverMedals() == p1.getMaleSilverMedals()) {
					return p2.getMaleBronzeMedals()-p1.getMaleBronzeMedals();
					
				} else if(p2.getMaleBronzeMedals() == p1.getMaleBronzeMedals()) {
					return p2.getName().compareToIgnoreCase(p1.getName());
					
				} else {
					return p2.getMaleGoldMedals()-p1.getMaleGoldMedals();
				}
			}
		});
		
		
	}
	
	
	
	
	
	
	
	
}
