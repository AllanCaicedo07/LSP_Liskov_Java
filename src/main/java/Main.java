import violation.LSPViolationTest;
import solution_shapes.ShapeTest;
import payments.PaymentTest;
import birds.BirdTest;

/**
 * ╔══════════════════════════════════════════════════════════╗
 * ║         SOLID — Principio de Sustitución de Liskov       ║
 * ║                     (LSP en Java)                        ║
 * ╚══════════════════════════════════════════════════════════╝
 *
 * Ejecuta todos los ejemplos del curso en secuencia:
 *
 *  1. Violación LSP — Square / Rectangle
 *  2. Solución correcta — Jerarquía Shape
 *  3. Ejemplo práctico — Sistema de Pagos
 *  4. Ejemplo práctico — Jerarquía de Aves
 */
public class Main {

    static void separator(String title) {
        System.out.println("\n" + "═".repeat(55));
        System.out.println("  " + title);
        System.out.println("═".repeat(55) + "\n");
    }

    public static void main(String[] args) {
        separator("EJEMPLO 1 — Violación LSP: Cuadrado/Rectángulo");
        LSPViolationTest.main(args);

        separator("EJEMPLO 2 — Solución LSP: Jerarquía Shape");
        ShapeTest.main(args);

        separator("EJEMPLO 3 — Pagos con LSP");
        PaymentTest.main(args);

        separator("EJEMPLO 4 — Jerarquía de Aves con LSP");
        BirdTest.main(args);

        System.out.println("\n" + "═".repeat(55));
        System.out.println("  Fin de los ejemplos LSP");
        System.out.println("═".repeat(55));
    }
}
