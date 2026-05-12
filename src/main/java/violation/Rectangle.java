package violation;

/**
 * EJEMPLO DE VIOLACIÓN LSP — Clase Base Rectangle
 *
 * Esta clase define el comportamiento esperado de un rectángulo.
 * El contrato implícito es:
 *   - setWidth() solo cambia el ancho
 *   - setHeight() solo cambia la altura
 *   - getArea() = width * height
 */
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + ", area=" + getArea() + "]";
    }
}
