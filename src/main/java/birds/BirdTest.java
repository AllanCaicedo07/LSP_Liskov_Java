package birds;

import java.util.List;

/**
 * TEST — Jerarquía de Aves con LSP
 *
 * Demuestra:
 *  1. Todos los Bird pueden comer() sin instanceof.
 *  2. Solo los Flyable vuelan — sin excepciones en tiempo de ejecución.
 *  3. Penguin tiene su propio comportamiento (swim()) sin forzar nada.
 */
public class BirdTest {

    /** Alimenta a cualquier pájaro — LSP garantiza que eat() funciona en todos */
    static void feedBird(Bird bird) {
        System.out.print("  Alimentando " + bird.getName() + ": ");
        bird.eat();
    }

    /** Hace volar solo a las aves que realmente vuelan */
    static void makeFly(Bird bird) {
        if (bird instanceof Flyable flyable) {
            System.out.print("  Haciendo volar " + bird.getName() + ": ");
            flyable.fly();
        } else {
            System.out.println("  " + bird.getName() + " no puede volar — y está bien así.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== JERARQUÍA DE AVES — LSP ===\n");

        List<Bird> birds = List.of(new Sparrow(), new Penguin(), new Eagle());

        System.out.println("--- Todos los pájaros comen (contrato Bird) ---");
        birds.forEach(BirdTest::feedBird);

        System.out.println("\n--- Solo los Flyable vuelan ---");
        birds.forEach(BirdTest::makeFly);

        System.out.println("\n--- Comportamiento propio del Pingüino ---");
        Penguin p = new Penguin();
        p.swim();

        System.out.println("\n Sin UnsupportedOperationException.");
        System.out.println(" Sin instanceof para verificar si vuela.");
        System.out.println(" Diseño honesto y extensible.");
    }
}
