package srp;

public class VATCalc {
	
	private float vat = 0.16f;

	public float calculateVAT(float billAmount) {
		return (float) (billAmount * vat);
	}

}
