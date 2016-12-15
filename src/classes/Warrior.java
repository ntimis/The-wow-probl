package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Warrior extends Hero{
public Warrior(){
    super.armor = 230;
    hpPoints = 9500;
    dmg = 220;
    type = "tank";
    spells = new String[]{"Pummel", "FuriousSlash"};
}
        public double pummel(){
            double spellDmg = dmg+(dmg/10);
            Utils.log("dmg " + spellDmg);
            return spellDmg;
        }

    public double furiousSlash(){
        double spellDmg = dmg +(dmg/15);
        Utils.log("dmg" + spellDmg);
        return spellDmg;
    }

    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("Pummel")){
            pummel();
        }
        else if(spellName.equalsIgnoreCase("FuriousSlash")) {
            furiousSlash();
        }

    }
}

