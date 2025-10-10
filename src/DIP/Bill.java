package DIP;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VATAmount;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc(Deduction d, VAT vat) {
		// Dedukzioa kalkulatu
		billDeduction = d.calcDeduction(billAmount ,deductionPercentage);
		// VAT kalkulatzen dugu
		VATAmount = vat.calcVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VATAmount;
	}
}
