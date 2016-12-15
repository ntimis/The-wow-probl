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
        spells = new String[]{"Frostbolt", "Firebolt"};
    }
    public double frostbolt(){
        double spellDmg = dmg +(dmg/25);
        Utils.log(spellDmg);
        return spellDmg;
    }

    public double firebolt(){
        double spellDmg = dmg +(dmg/30);
        Utils.log(spellDmg);
        return spellDmg;
    }
    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("frostbolt")){
            frostbolt();
        }
        else if(spellName.equalsIgnoreCase("firebolt")) {
            firebolt();
        }

    }

}
