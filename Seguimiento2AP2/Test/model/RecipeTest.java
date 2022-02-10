package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {


	//State
	private Recipe recipe;
	//Stages
	public void setupStage1() {
		recipe= null;
	}
	public void setupStage2() {
		
		recipe = new Recipe();
		
		recipe.addIngredient("Cebolla",315.0);
		recipe.addIngredient("Ajo",58);
		recipe.addIngredient("Arroz",520);
			
	}	
	
	//Proof Cases
	@Test
	void Test() {
		
		
	
		
	}

}
