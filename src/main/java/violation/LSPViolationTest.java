package violation;

/**
 * ❌ TEST QUE DEMUESTRA LA VIOLACIÓN DEL LSP
 *
 * Este test muestra cómo Square rompe el contrato de Rectangle.
 * El método testRectangleArea() espera que cualquier Rectangle
 * funcione correctamente, pero falla con Square.
 */
public class LSPViolationTest {

    /**
     * Este método trabaja con Rectangle.
     * DEBERÍA funcionar con cualquier subtipo de Rectangle (por LSP),
     * pero falla con Square — eso es exactamente la violación.
     */
    static void testRectangleArea(Rectangle r) {
        r.setWidth(5);
        r.setHeight(3);
        int area = r.getArea();

        System.out.println("Objeto recibido: " + r);
        System.out.println("Área esperada  : 15 (5 x 3)");
        System.out.println("Área obtenida  : " + area);

        if (area == 15) {
            System.out.println("✅ Correcto\n");
        } else {
            System.out.println("❌ INCORRECTO — ¡Violación del LSP detectada!\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TEST DE VIOLACIÓN LSP: Cuadrado / Rectángulo ===\n");

        System.out.println("--- Caso 1: Rectangle normal ---");
        testRectangleArea(new Rectangle()); // ✅ funciona bien

        System.out.println("--- Caso 2: Square (subtipo incorrecto) ---");
        testRectangleArea(new Square());    // ❌ ¡rompe el contrato!

        System.out.println("Conclusión: Square NO puede sustituir a Rectangle.");
        System.out.println("Aunque matemáticamente 'cuadrado ES rectángulo',");
        System.out.println("en OOP esta herencia viola el LSP.");
    }
}
