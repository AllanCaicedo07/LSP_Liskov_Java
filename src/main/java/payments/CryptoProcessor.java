package payments;

/**
 *  CryptoProcessor — VIOLACIÓN DEL LSP
 *
 * CryptoProcessor implementa PaymentProcessor pero NO puede cumplir
 * el contrato de refund(). Lanzar UnsupportedOperationException
 * rompe el LSP: el cliente espera que refund() funcione en cualquier
 * PaymentProcessor, pero aquí explota en tiempo de ejecución.
 *
 * SOLUCIÓN: Si Crypto no soporta reembolsos, debería implementar
 * solo una interface reducida (e.g. OneWayPaymentProcessor),
 * aplicando el Principio de Segregación de Interfaces (ISP).
 */
public class CryptoProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Crypto] Enviando $" + amount + " en criptomoneda...");
        return broadcastTransaction(amount);
    }

    @Override
    public boolean refund(double amount) {
        //  VIOLA LSP: lanza excepción no declarada en el contrato
        throw new UnsupportedOperationException(
            "Las transacciones en cripto son irreversibles. No se admiten reembolsos."
        );
    }

    @Override
    public boolean isAvailable() {
        return checkBlockchainNetwork();
    }

    private boolean broadcastTransaction(double amount) {
        System.out.println("[Crypto]  Transacción enviada a la blockchain.");
        return true;
    }

    private boolean checkBlockchainNetwork() {
        System.out.println("[Crypto] Red blockchain: activa");
        return true;
    }
}
