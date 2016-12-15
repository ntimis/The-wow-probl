package classes;

import java.util.EmptyStackException;

/**
 * Created by nicoleta.timis on 15/11/16.
 */
public abstract class Hero {
    public  int armor;
    public int hpPoints;
    public String type;
    public int dmg;

    public String name;

    public String[] spells;

    public Hero(){

    }

    public void castSpell(String spellName) {
            throw new EmptyStackException();

    }
//    public int getDmg() {
//        return dmg;
//    }
//
//    public void setDmg(int dmg) {
//        this.dmg = dmg;
//    }
//
//    public void setArmor(int armor){
//        this.armor = armor;
//    }
//     public int getArmor(){
//        return armor;
//    }
//
//    public void setHpPoints(int hp){
//        this.hpPoints = hp;
//    }
//    public int getHpPoints(){
//        return hpPoints;
//    }



}

