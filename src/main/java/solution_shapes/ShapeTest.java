package solution_shapes;

import java.util.List;

/**
 * ✅ TEST DE LA SOLUCIÓN LSP CON SHAPES
 *
 * Demuestra uso polimórfico correcto: el cliente trabaja con Shape
 * sin conocer el tipo concreto. Cualquier Shape puede sustituirse
 * por otra sin sorpresas.
 */
public class ShapeTest {

    /**
     * Calcula el área total de cualquier colección de figuras.
     * El cliente no sabe si son Rectangles, Squares o Circles — ¡ni le importa!
     */
    static int totalArea(List<Shape> shapes) {
        return shapes.stream().mapToInt(Shape::getArea).sum();
    }

    /**
     * Imprime información de cualquier Shape. LSP garantiza que
     * todos los subtipos responden correctamente a getArea() y getPerimeter().
     */
    static void printShapeInfo(Shape s) {
        System.out.println("  " + s + " | perímetro=" + s.getPerimeter());
    }

    public static void main(String[] args) {
        System.out.println("=== SOLUCIÓN LSP: Jerarquía correcta de Shapes ===\n");

        List<Shape> shapes = List.of(
            new Rectangle(5, 3),
            new Square(4),
            new Circle(3)
        );

        System.out.println("Figuras y sus áreas:");
        shapes.forEach(ShapeTest::printShapeInfo);

        System.out.println("\nÁrea total: " + totalArea(shapes));

        System.out.println("\n✅ Todos los subtipos cumplen el contrato de Shape.");
        System.out.println("✅ El cliente (totalArea) puede usarlos sin instanceof.");
        System.out.println("✅ Agregar nuevas figuras no modifica código existente (OCP).");
    }
}
