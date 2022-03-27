package model;

public class Pais {

	
	private String name;
	private int maleGoldMedals;
	private int maleSilverMedals;
	private int maleBronzeMedals;
	private int femaleGoldMedals;
	private int femaleSilverMedals;
	private int femaleBronzeMedals;
	
	public Pais(String name, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals, int femaleGoldMedals, int femaleSilverMedals, int femaleBronzeMedals) {
		
		this.name = name;
		this.maleGoldMedals = maleGoldMedals;
		this.maleSilverMedals = maleSilverMedals;
		this.maleBronzeMedals = maleBronzeMedals;
		this.femaleGoldMedals = femaleGoldMedals;
		this.femaleSilverMedals = femaleSilverMedals;
		this.femaleBronzeMedals = femaleBronzeMedals;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaleGoldMedals() {
		return maleGoldMedals;
	}

	public void setMaleGoldMedals(int maleGoldMedals) {
		this.maleGoldMedals = maleGoldMedals;
	}

	public int getMaleSilverMedals() {
		return maleSilverMedals;
	}

	public void setMaleSilverMedals(int maleSilverMedals) {
		this.maleSilverMedals = maleSilverMedals;
	}

	public int getMaleBronzeMedals() {
		return maleBronzeMedals;
	}

	public void setMaleBronzeMedals(int maleBronzeMedals) {
		this.maleBronzeMedals = maleBronzeMedals;
	}

	public int getFemaleGoldMedals() {
		return femaleGoldMedals;
	}

	public void setFemaleGoldMedals(int femaleGoldMedals) {
		this.femaleGoldMedals = femaleGoldMedals;
	}

	public int getFemaleSilverMedals() {
		return femaleSilverMedals;
	}

	public void setFemaleSilverMedals(int femaleSilverMedals) {
		this.femaleSilverMedals = femaleSilverMedals;
	}

	public int getFemaleBronzeMedals() {
		return femaleBronzeMedals;
	}

	public void setFemaleBronzeMedals(int femaleBronzeMedals) {
		this.femaleBronzeMedals = femaleBronzeMedals;
	}
	
	public String toString() {
		return "Pais [name=" + name + ", maleGoldMedals=" + maleGoldMedals + ", maleSilverMedals=" + maleSilverMedals
				+ ", maleBronzeMedals=" + maleBronzeMedals + ", femaleGoldMedals=" + femaleGoldMedals
				+ ", femaleSilverMedals=" + femaleSilverMedals + ", femaleBronzeMedals=" + femaleBronzeMedals + "]";
	}
	
	
	
}
