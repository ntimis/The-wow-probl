package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Paladin extends Hero {
    public Paladin(){
        type = "tank";
    }
    public double Devastate(){
        return (15 * dmg)/100;
    }

    public double SacredShield(){
        return (13 * dmg)/100;
    }
}
