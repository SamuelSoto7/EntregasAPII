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
	
	public void addPais(String name, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals, int femaleGoldMedals, int femaleSilverMedals, int femaleBronzeMedals) {
		
		Pais newPais = new Pais(name, femaleBronzeMedals, femaleBronzeMedals, femaleBronzeMedals, femaleBronzeMedals, femaleBronzeMedals, femaleBronzeMedals);
		countries.add(newPais);
		
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
	
	
	public void sortByGold() {
		Collections.sort(countries, new Comparator<Pais>(){
			@Override
			public int compare(Pais A,Pais B) {
				return A.getMaleGoldMedals()-B.getMaleGoldMedals();
				
				
			}
		});
		
		
	}
	
	public void sortByName() {
		Collections.sort(countries, new Comparator<Pais>(){
			@Override
			public int compare(Pais A,Pais B) {
				return A.getName().compareToIgnoreCase(B.getName());
				
			}
		});
	}
	
	
	
	
	
	
}
