package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class DeathKnight extends Hero {
    public DeathKnight(){
        super.armor = 300;
        hpPoints = 1000;
        dmg = 200;
        type = "tank";
        spells = new String[]{"DeathGrip", "FrostTouch"};
    }
    public double deathGrip(){

        Utils.log((13 * dmg)/100);
        return (13 * dmg)/100;
    }

    public double frostTouch(){
        Utils.log((15 * dmg)/100);
        return (15 * dmg)/100;
    }

    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("deathGrip")){
            deathGrip();
        }
        else if(spellName.equalsIgnoreCase("frostTouch")) {
            frostTouch();
        }

    }
}
