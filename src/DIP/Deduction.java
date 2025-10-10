package DIP;

public class Deduction {
	public float calcDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
}
