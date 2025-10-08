package srp;

public class TotalCalc {

	public float calculateTotal(float billAmount, float billDeduction, float VAT) {
		return (billAmount - billDeduction) + VAT;
	}
}
