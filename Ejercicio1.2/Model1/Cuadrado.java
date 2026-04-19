/**
 * 
 */
public class Cuadrado extends Cuadrilatero {
private float lado;
    /**
     * Default constructor
     */
    public Cuadrado() {
    }


    public Cuadrado(float longitudLados,float lado){
        super(longitudLados);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}