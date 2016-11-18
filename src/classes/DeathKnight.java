package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class DeathKnight extends Hero {
    public double DeathGrip(){
        return (13 * dmg)/100;
    }

    public double FrostTouch(){
        return (15 * dmg)/100;
    }
}
