package clases;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Eclipse {

    private float radioMenor;
    private float radioMayor;

    /**
     * Default constructor
     */
    public Eclipse() {
    }

    public Eclipse(float radioMayor, float radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }
}