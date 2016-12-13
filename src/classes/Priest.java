package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Priest extends Hero {
    public Priest(){
        super.armor = 130;
        hpPoints = 550;
        dmg = 200;
        type = "healer";
    }
    public double FlashHeal(){
        return (20 * hpPoints)/100;
    }

    public double GreaterHeal() {
        return (30 * hpPoints) / 100;
    }
}
