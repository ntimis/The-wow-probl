package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Hunter extends Hero {
    public Hunter(){
        super.armor = 280;
        hpPoints = 550;
        dmg = 450;
        type = "dps";
    }
    public double PoisonArrow(){
        return (20 * dmg)/100;
    }

    public double DeadlyArrow(){
        return (30 * dmg)/100;
    }
}
