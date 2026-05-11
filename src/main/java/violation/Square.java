package violation;

/**
 * ❌ VIOLACIÓN DEL LSP — Square extiende Rectangle
 *
 * Aunque matemáticamente un cuadrado ES un rectángulo,
 * esta herencia ROMPE el principio de sustitución de Liskov.
 *
 * Problema: Square sobreescribe setWidth() y setHeight() de forma
 * que cambia el comportamiento esperado por el cliente de Rectangle.
 * Cuando el cliente llama r.setWidth(5); r.setHeight(3), espera area=15,
 * pero si 'r' es en realidad un Square, obtiene area=9. ¡Sorpresa!
 */
public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        // ❌ VIOLA LSP: al cambiar ancho, también fuerza el alto
        this.width = width;
        this.height = width; // fuerza igualdad de lados
    }

    @Override
    public void setHeight(int height) {
        // ❌ VIOLA LSP: al cambiar alto, también fuerza el ancho
        this.width = height;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square[side=" + width + ", area=" + getArea() + "]";
    }
}
