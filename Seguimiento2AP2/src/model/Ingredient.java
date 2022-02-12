package model;

import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		weight = weight + additionalW;
		
		if(additionalW<0){
			weight = weight-additionalW;
			throw new NegativeNumberException(this.name,additionalW);
		}
	}
	
	public void removeWeight(double removeWeight) throws NegativeNumberException {
		weight = weight - removeWeight;
		
		if(removeWeight<0){
			weight = weight+removeWeight;
			throw new NegativeNumberException(this.name,removeWeight);
		}
	}
	
}
