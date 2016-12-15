package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Druid extends Hero {
    public Druid(){
        super.armor = 130;
        hpPoints = 550;
        dmg = 200;
        type = "healer";
        spells = new String[]{"HealingTouch", "Regrowth"};
    }
    public double healingTouch(){
        double spellHeal = hpPoints +(hpPoints/30);
        Utils.log(spellHeal);
        return spellHeal;
    }

    public double regrowth(){
        double spellHeal = hpPoints +(hpPoints/50);
        Utils.log(spellHeal);
        return spellHeal;
    }
    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("healingTouch")){
            healingTouch();
        }
        else if(spellName.equalsIgnoreCase("regrowth")) {
            regrowth();
        }
}
}
