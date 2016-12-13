package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Druid extends Hero {
    public Druid(){
        super.armor = 130;
        hpPoints = 550;
        dmg = 200;
        type = "healer";
    }
    public double HealingTouch(){
        return (20 * hpPoints)/100;
    }

    public double Regrowth(){
        return (30 * hpPoints)/100;
    }
}
