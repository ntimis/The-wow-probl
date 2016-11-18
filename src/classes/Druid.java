package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Druid extends Hero {
    public double HealingTouch(){
        return (20 * hpPoints)/100;
    }

    public double Regrowth(){
        return (30 * hpPoints)/100;
    }
}
