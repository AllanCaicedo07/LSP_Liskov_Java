package payments;

/**
 * ✅ PayPalProcessor — implementación correcta de PaymentProcessor
 * Cumple el contrato completo, incluyendo refund() vía API de PayPal.
 */
public class PayPalProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[PayPal] Iniciando pago de $" + amount + " via PayPal API...");
        return callPayPalApi(amount);
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("[PayPal] Solicitando reembolso de $" + amount + " a PayPal...");
        // ✅ LSP: también soporta reembolso
        return initiateRefund(amount);
    }

    @Override
    public boolean isAvailable() {
        return checkPayPalStatus();
    }

    // --- Métodos privados de infraestructura (simulados) ---

    private boolean callPayPalApi(double amount) {
        System.out.println("[PayPal] ✅ API respondió OK para $" + amount);
        return true;
    }

    private boolean initiateRefund(double amount) {
        System.out.println("[PayPal] ✅ Reembolso iniciado por $" + amount);
        return true;
    }

    private boolean checkPayPalStatus() {
        System.out.println("[PayPal] Estado del servicio: OK");
        return true;
    }
}
