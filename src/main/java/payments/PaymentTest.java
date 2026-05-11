package payments;

import java.util.List;

/**
 * TEST — Sistema de Pagos con LSP
 *
 * Demuestra cómo el cliente (processOrder) trabaja con PaymentProcessor
 * sin conocer la implementación concreta (✅ LSP correcto),
 * y qué ocurre cuando una implementación viola el contrato (❌ LSP roto).
 */
public class PaymentTest {

    /**
     * Simula el procesamiento de un pedido.
     * El cliente no sabe si es CreditCard, PayPal o cualquier otro — solo usa la interface.
     */
    static void processOrder(PaymentProcessor processor, double amount) {
        System.out.println("  Verificando disponibilidad: " + processor.isAvailable());
        boolean paid = processor.processPayment(amount);
        if (paid) {
            System.out.println("  Pago exitoso. Procesando envío...");
        }
    }

    /**
     * Simula una devolución. Con LSP, cualquier PaymentProcessor debería manejarla.
     */
    static void processRefund(PaymentProcessor processor, double amount) {
        try {
            boolean refunded = processor.refund(amount);
            if (refunded) System.out.println("  ✅ Reembolso exitoso.");
        } catch (UnsupportedOperationException e) {
            System.out.println("  ❌ LSP VIOLADO — " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGOS — LSP ===\n");

        List<PaymentProcessor> processors = List.of(
            new CreditCardProcessor(),
            new PayPalProcessor()
        );

        // ✅ Estos procesadores cumplen el contrato completo
        for (PaymentProcessor p : processors) {
            System.out.println("--- " + p.getClass().getSimpleName() + " ---");
            processOrder(p, 99.99);
            processRefund(p, 99.99);
            System.out.println();
        }

        // ❌ CryptoProcessor viola LSP — refund() lanza excepción
        System.out.println("--- CryptoProcessor (VIOLACIÓN LSP) ---");
        PaymentProcessor crypto = new CryptoProcessor();
        processOrder(crypto, 50.00);
        processRefund(crypto, 50.00); // ❌ Explota aquí
    }
}
