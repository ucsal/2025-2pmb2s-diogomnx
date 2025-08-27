package br.com.mariojp.solid.srp;

public class ReceiptService {
	private final TaxCalculator taxCalculator;
	private final ReceiptFormatter receiptFormatter;

	public ReceiptService() {
		this.taxCalculator = new TaxCalculator();
		this.receiptFormatter = new ReceiptFormatter();
	}
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = this.taxCalculator.calculateTaxRate(subtotal);
		double total = subtotal + tax;

		return this.receiptFormatter.format(order.getItems(), subtotal, total, tax);
    }
}
