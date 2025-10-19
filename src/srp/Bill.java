package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	DeductionCalc deductionCalc = new DeductionCalc();
	VATCalc vatCalc = new VATCalc();
	TotalCalc totalCalc = new TotalCalc();

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = deductionCalc.calculateBillDeduction(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VAT = vatCalc.calculateVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = totalCalc.calculateTotal(billAmount, billDeduction, VAT);
	}
}