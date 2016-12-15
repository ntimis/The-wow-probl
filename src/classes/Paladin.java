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
        spells = new String[]{"Devastate", "SacredShield"};
    }
    public double devastate(){
        double spellDmg = dmg +(dmg/15);
        Utils.log(spellDmg);
        return spellDmg;
    }

    public double sacredShield(){
        double spellDmg = dmg +(dmg/13);
        Utils.log(spellDmg);
        return spellDmg;
    }
    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("devastate")){
            devastate();
        }
        else if(spellName.equalsIgnoreCase("sacredShield")) {
            sacredShield();
        }

}}
