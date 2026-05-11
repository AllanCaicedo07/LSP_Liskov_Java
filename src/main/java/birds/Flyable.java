package birds;

/**
 * ✅ Interface Flyable — contrato SOLO para aves voladoras
 *
 * Al separar el comportamiento de volar en una interface,
 * el Pingüino no se ve forzado a implementarla (ISP + LSP).
 * Solo las aves que realmente vuelan implementan Flyable.
 */
public interface Flyable {
    void fly();
}
