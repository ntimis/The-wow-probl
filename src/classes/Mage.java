package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Mage extends Hero {
    public Mage(){
        super.armor = 180;
        hpPoints = 450;
        dmg = 500;
        type = "dps";

    }
    public double Frostbolt(){
        return (25 * dmg)/100;
    }

    public double Firebolt(){
        return (30 * dmg)/100;
    }


}
