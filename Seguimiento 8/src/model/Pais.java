package model;

public class Pais implements Comparable <Pais>{

	
	private String name;
	private int maleGoldMedals;
	private int maleSilverMedals;
	private int maleBronzeMedals;
	private int femaleGoldMedals;
	private int femaleSilverMedals;
	private int femaleBronzeMedals;
	private int totalGoldMedals;
	private int totalSilverMedals;
	private int totalBronzeMedals;
	
	public Pais(String name, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals, int femaleGoldMedals, int femaleSilverMedals, int femaleBronzeMedals) {
		
		this.name = name;
		this.maleGoldMedals = maleGoldMedals;
		this.maleSilverMedals = maleSilverMedals;
		this.maleBronzeMedals = maleBronzeMedals;
		this.femaleGoldMedals = femaleGoldMedals;
		this.femaleSilverMedals = femaleSilverMedals;
		this.femaleBronzeMedals = femaleBronzeMedals;
		
	}
	
	public Pais(String name, int totalGoldMedals, int totalSilverMedals, int totalBronzeMedals) {
		
		this.name = name;
		this.totalGoldMedals = totalGoldMedals;
		this.totalSilverMedals = totalSilverMedals;
		this.totalBronzeMedals = totalBronzeMedals;
		
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
	
	public int getTotalGoldMedals() {
		return totalGoldMedals;
	}

	public void setTotalGoldMedals(int totalGoldMedals) {
		this.totalGoldMedals = totalGoldMedals;
	}

	public int getTotalSilverMedals() {
		return totalSilverMedals;
	}

	public void setTotalSilverMedals(int totalSilverMedals) {
		this.totalSilverMedals = totalSilverMedals;
	}

	public int getTotalBronzeMedals() {
		return totalBronzeMedals;
	}

	public void setTotalBronzeMedals(int totalBronzeMedals) {
		this.totalBronzeMedals = totalBronzeMedals;
	}
	
	public String toString() {
		return "Pais [name=" + name + ", maleGoldMedals=" + maleGoldMedals + ", maleSilverMedals=" + maleSilverMedals
				+ ", maleBronzeMedals=" + maleBronzeMedals + ", femaleGoldMedals=" + femaleGoldMedals
				+ ", femaleSilverMedals=" + femaleSilverMedals + ", femaleBronzeMedals=" + femaleBronzeMedals + "]";
	}
	
	
	@Override
	public int compareTo(Pais p) {
		
		Pais A = this;
		Pais B =p;
		
		int output=(A.femaleGoldMedals-B.femaleGoldMedals);
	
		if(output==0) {
			int output2= A.femaleSilverMedals-B.femaleSilverMedals;
			
			if(output2==0) {
				int output3 = A.femaleBronzeMedals-B.femaleBronzeMedals;
				
				if(output3==0) {
					return A.name.compareToIgnoreCase(B.name);
				
				} else {
					return output3;
				}
			} else {
				return output2;
			}
			
		} else {
			return output;
		}
		
		
	}
	
}
