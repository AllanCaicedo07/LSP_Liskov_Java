package solution_shapes;

/**
 * ✅ SOLUCIÓN LSP — Abstracción correcta con Shape
 *
 * En lugar de hacer que Square herede de Rectangle,
 * ambos heredan de Shape. Cada uno define su propia
 * implementación sin romper el contrato de la otra.
 *
 * Regla: la herencia debe modelar IS-A desde el punto
 * de vista del COMPORTAMIENTO, no solo del concepto matemático.
 */
public abstract class Shape {
    public abstract int getArea();
    public abstract int getPerimeter();
}
