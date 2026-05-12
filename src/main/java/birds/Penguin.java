package birds;

/**
 *  Penguin (Pingüino) — come y nada, pero NO vuela.
 *
 * No implementa Flyable — eso sería mentira.
 * Puede tener comportamientos propios (swim()) sin romper ningún contrato.
 * El diseño es honesto: el compilador mismo garantiza que nadie
 * llamará fly() en un Penguin.
 */
public class Penguin extends Bird {

    public Penguin() {
        super("Pingüino");
    }

    @Override
    public void eat() {
        System.out.println(name + ": Comiendo peces del océano.");
    }

    /** Comportamiento propio del pingüino — no forzado desde la clase base */
    public void swim() {
        System.out.println(name + ": ¡Nadando a gran velocidad!");
    }
}
