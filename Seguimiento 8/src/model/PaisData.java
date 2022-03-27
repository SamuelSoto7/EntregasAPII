package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaisData {

	private ArrayList <Pais> countries;
	private ArrayList <Pais> countries2;
	
	public PaisData() {
		countries = new ArrayList<>();
		countries2 = new ArrayList<>();
	}
	
	public ArrayList getPais() {
		return countries;
	}
	
	public void addPais(Pais p) {
		countries.add(p);
	}
	
	
	public void printMale() {
		System.out.println("\n*Masculino*\n");
		for (Pais p:countries) {
			System.out.println(p.getName() +" "+ p.getMaleGoldMedals() +" "+ p.getMaleSilverMedals() +" "+ p.getMaleBronzeMedals());
		}
	}
	
	public void printFemale() {
		System.out.println("\n----------\n");
		System.out.println("*Femenino*\n");
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
	
	public void sortByComparable() {
		Collections.sort(countries);
	}
	
	
	public void sortByInsertion() {
	
		for(int i=0; i<countries.size(); i++) {
			String name = countries.get(i).getName();
			int totalGold = (countries.get(i).getMaleGoldMedals() + countries.get(i).getFemaleGoldMedals());
			int totalSilver = (countries.get(i).getMaleSilverMedals() + countries.get(i).getFemaleSilverMedals());
			int totalBronze = (countries.get(i).getMaleBronzeMedals() + countries.get(i).getFemaleBronzeMedals());
			
			Pais newPais = new Pais(name,totalGold,totalSilver,totalBronze);
			countries2.add(newPais);
		}
		
		for(int i=1; i<countries2.size(); i++) {
			for(int j=0; j<i; j++) {
				if(countries2.get(i).getTotalGoldMedals()>countries2.get(j).getTotalGoldMedals()) {
					Pais change = countries2.get(i);
					countries2.remove(i);
					countries2.add(j, change);
					break;
					
				} else if(countries2.get(i).getTotalGoldMedals() == countries2.get(j).getTotalGoldMedals()) {
					if(countries2.get(i).getTotalSilverMedals()>countries2.get(j).getTotalSilverMedals()) {
						Pais change = countries2.get(i);
						countries2.remove(i);
						countries2.add(j, change);
						break;
						
					} else if(countries2.get(i).getTotalSilverMedals() == countries2.get(j).getTotalSilverMedals()) {
						if(countries2.get(i).getTotalBronzeMedals()>countries2.get(j).getTotalBronzeMedals()) {
							Pais change = countries2.get(i);
							countries2.remove(i);
							countries2.add(j, change);
							break;
							
						} else if(countries2.get(i).getTotalBronzeMedals() == countries2.get(j).getTotalBronzeMedals()) {
							if((countries2.get(i).getName().compareTo(countries2.get(j).getName()))<0){
								Pais change = countries2.get(i);
								countries2.remove(i);
								countries2.add(j, change);
								break;
							}
						}
					}
					
				}
			}
		}
		
	}
	
	public void printInsertion() {
		System.out.println("\n----------\n");
		System.out.println("*Combinado*\n");
		for(Pais p: countries2) {
			System.out.println(p.getName() +" "+ p.getTotalGoldMedals() +" "+ p.getTotalSilverMedals() +" "+ p.getTotalBronzeMedals());
		}
	}
	
	
	
	
	
	
	
	
}
