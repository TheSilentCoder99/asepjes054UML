/**
 * 
 */
public class Triangulo extends Forma {
    private float base;
    private float altura;
    /**
     * Default constructor
     */
    public Triangulo() {
    }

    public Triangulo(String color, float base, float altura) {
        super(color);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}