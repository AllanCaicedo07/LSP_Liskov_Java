package birds;

/**
 * ✅ Sparrow (Gorrión) — puede volar y comer.
 * Implementa Flyable porque realmente vuela.
 * Cumple el contrato de Bird sin efectos inesperados.
 */
public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        super("Gorrión");
    }

    @Override
    public void fly() {
        System.out.println(name + ": ¡Volando entre las ramas!");
    }

    @Override
    public void eat() {
        System.out.println(name + ": Comiendo semillas.");
    }
}
