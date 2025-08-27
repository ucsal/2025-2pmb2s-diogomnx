package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator() {
        String taxRateProperty = System.getProperty("tax.rate");
        this.taxRate = Double.parseDouble(taxRateProperty);
    }

    public double calculateTaxRate(double subtotal) {
        return subtotal * this.taxRate;
    }

}
