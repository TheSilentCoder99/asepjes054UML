/**
 * 
 */
public class Elipse extends Conica {
    private float radioMenor;
    private float radioMayor;

    /**
     * Default constructor
     */
    public Elipse() {
    }

    public Elipse(float radioMenor, float radioMayor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }
}