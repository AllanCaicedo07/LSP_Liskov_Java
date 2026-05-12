package payments;

/**
 *  CreditCardProcessor — implementación correcta de PaymentProcessor
 * Cumple TODOS los contratos: procesa, reembolsa y reporta disponibilidad.
 */
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[CreditCard] Cobrando $" + amount + " con tarjeta de crédito...");
        // Simula llamada al gateway bancario
        return chargeCard(amount);
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("[CreditCard] Reembolsando $" + amount + "...");
        //  LSP: soporta reembolso correctamente
        return reverseCharge(amount);
    }

    @Override
    public boolean isAvailable() {
        return true; // Tarjeta siempre disponible
    }

    // --- Métodos privados de infraestructura (simulados) ---

    private boolean chargeCard(double amount) {
        System.out.println("[CreditCard]  Cargo aprobado por $" + amount);
        return true;
    }

    private boolean reverseCharge(double amount) {
        System.out.println("[CreditCard]  Reversa ejecutada por $" + amount);
        return true;
    }
}
