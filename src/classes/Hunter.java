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
        spells = new String[]{"PoisonArrow", "DeadlyArrow"};
    }
    public double poisonArrow(){
        double spellDmg = dmg +(dmg/20);
        Utils.log(spellDmg);
        return spellDmg;
    }

    public double deadlyArrow(){
        double spellDmg = dmg +(dmg/30);
        Utils.log(spellDmg);
        return spellDmg;
    }
    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("poisonArrow")){
            poisonArrow();
        }
        else if(spellName.equalsIgnoreCase("deadlyArrow")) {
            deadlyArrow();
        }

    }
}
