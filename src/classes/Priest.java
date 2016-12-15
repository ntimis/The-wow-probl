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
        spells = new String[]{"FlashHeal", "GreaterHeal"};
    }
    public double flashHeal(){
        double spellHeal = hpPoints +(hpPoints/20);
        Utils.log(spellHeal);
        return spellHeal;

    }

    public double greaterHeal() {
        double spellHeal = hpPoints +(hpPoints/30);
        Utils.log(spellHeal);
        return spellHeal;
    }

    @Override
    public void castSpell(String spellName){
        if(spellName.equalsIgnoreCase("flashHeal")){
            flashHeal();
        }
        else if(spellName.equalsIgnoreCase("greaterHeal")) {
            greaterHeal();
        }
}
}
