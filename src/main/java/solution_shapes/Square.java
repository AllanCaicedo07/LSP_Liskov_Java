package solution_shapes;

/**
 * ✅ Square correcto — hereda de Shape de forma independiente.
 * No depende de Rectangle. Tiene su propio estado (side)
 * y cumple el contrato de Shape sin efectos secundarios.
 */
public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() { return side; }
    public void setSide(int side) { this.side = side; }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[side=" + side + "] area=" + getArea();
    }
}
