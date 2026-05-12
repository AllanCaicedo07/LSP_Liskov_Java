package payments;

/**
 *  CONTRATO — Interface PaymentProcessor
 *
 * Define el contrato que TODOS los procesadores de pago deben cumplir.
 * Cualquier implementación debe soportar processPayment(), refund() e isAvailable().
 *
 * Si un procesador no puede cumplir alguno de estos métodos,
 * NO debe implementar esta interface (LSP — Interface Segregation).
 */
public interface PaymentProcessor {

    /**
     * Procesa un pago por el monto indicado.
     * @param amount monto a cobrar (> 0)
     * @return true si el pago fue exitoso
     */
    boolean processPayment(double amount);

    /**
     * Emite un reembolso por el monto indicado.
     * Postcondición: el cliente debe recibir su dinero de vuelta.
     * @param amount monto a reembolsar (> 0)
     * @return true si el reembolso fue exitoso
     */
    boolean refund(double amount);

    /**
     * Verifica si el procesador está disponible para operar.
     * @return true si está disponible
     */
    boolean isAvailable();
}
