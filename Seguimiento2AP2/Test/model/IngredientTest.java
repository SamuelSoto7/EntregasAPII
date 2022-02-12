package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	
	//State
	private Ingredient ingredient;
	//Stages
	public void setupStage1() {
		ingredient = new Ingredient("Tomate", 245);
	}
	
	
	//Proof Cases
	@Test
	void addWeightTest() {
		setupStage1();
		try {
			ingredient.addWeight(54);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
		//Asserts
		assertNotNull(ingredient);
		assertEquals(299, ingredient.getWeight());
		
	}
	
	@Test
	void addNegativeWeightTest() {
		setupStage1();
		try {
			ingredient.addWeight(-100);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
		//Asserts 
		assertEquals(245, ingredient.getWeight());
		
	}
	
	@Test
	void removeWeightTest() {
		setupStage1();
		try {
			ingredient.removeWeight(45);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}	
		
		//Asserts 
		assertEquals(200, ingredient.getWeight());
		
	}
	
	@Test
	void removeWithNegativeWeightTest() {
		setupStage1();
		try {
			ingredient.removeWeight(-100);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}	
		
		//Asserts 
		assertEquals(245, ingredient.getWeight());
		
	}
	
}
	
		
