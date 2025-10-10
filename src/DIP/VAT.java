package DIP;

public class VAT {
	private float vat = 0.16f;

	public float calcVAT(float billAmount) {
		return (float) (billAmount * vat);
	}
}
