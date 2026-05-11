package birds;

/**
 * ✅ Eagle (Águila) — otro subtipo de Bird que vuela.
 * Muestra que se pueden agregar nuevas aves sin modificar código existente.
 */
public class Eagle extends Bird implements Flyable {

    public Eagle() {
        super("Águila");
    }

    @Override
    public void fly() {
        System.out.println(name + ": Planeando alto en el cielo.");
    }

    @Override
    public void eat() {
        System.out.println(name + ": Cazando presas.");
    }
}
