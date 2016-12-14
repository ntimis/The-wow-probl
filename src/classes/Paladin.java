package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Paladin extends Hero {
    public Paladin(){

        super.armor = 170;
        hpPoints = 650;
        dmg = 500;
        type = "dps";
    }
    public double Devastate(){
        return (15 * dmg)/100;
    }

    public double SacredShield(){
        return (13 * dmg)/100;
    }
}
