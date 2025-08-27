package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator(double taxRate) {
        String taxRateProperty = System.getProperty("tax.rate");
        this.taxRate = taxRate;
    }

    public double calculateTaxRate(double subtotal) {
        return subtotal * this.taxRate;
    }

}
