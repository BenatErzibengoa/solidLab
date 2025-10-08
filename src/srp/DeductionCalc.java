package srp;

public class DeductionCalc {

	public float calculateBillDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
		
		//Sistema aldatuko bagenu, kode hau goiko lerroagatik ordezkatu beharko genuke
		/*
		if (billAmount >50000){
			return billDeduction = (billAmount * deductionPercentage +5) / 100;
		}
		else{
			return billDeduction = (billAmount * deductionPercentage) / 100;
		}
		*/
	}
}
