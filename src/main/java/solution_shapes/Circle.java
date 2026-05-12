package solution_shapes;

/**
 *  Circle — otro subtipo de Shape que cumple el LSP.
 * Demuestra que se pueden agregar nuevas figuras sin modificar
 * código existente (OCP) y sin romper sustitución (LSP).
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "] area=" + getArea();
    }
}
