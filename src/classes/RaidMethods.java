package classes;

import java.util.Scanner;
import classes.Hero;

import java.util.Arrays;

import static classes.Utils.log;

/**
 * Created by nicoleta.timis on 15/11/16.
 */
public class RaidMethods {
    Scanner scanner = new Scanner(System.in);
    private int tankNr;
    private int healerNr;
    private int dpsNr;
    int basedmg;

//    Utils utils = new Utils();

    public void askRaidSize() {
        log("Enter the raid size. You can choose 5, 10, 25, 30");
    }

    public void calculateRaidSize(int raidSize) {
        log("Calculating raid size for your selection:");
         tankNr = 1;
        if (raidSize > 5) {
            tankNr = 2;
        }
        log("number of tanks is: " + tankNr);
         healerNr = raidSize / 5;
        log("number of healers is: " + healerNr);
         dpsNr = raidSize - tankNr - healerNr;
        log("number of dps is: " + dpsNr);
        log("\n");
        String[] raidComposition = new String[raidSize];


        for (int i = 0; i < raidSize; i++) {
            if (i < tankNr)
                raidComposition[i] = "tank";
                else if (i < (healerNr+ tankNr)) raidComposition[i] = "healer";
                else raidComposition[i] = "dps";
            log(raidComposition[i]);
        }
        }

        public void raidDmg(Hero tank, Hero healer, Hero dps){
            basedmg = ( tank.dmg * tankNr + healer.dmg * healerNr + dps.dmg * dpsNr);
            log("raid dmg: " + basedmg);
        }

    public void assesRaidSize(int raidSize) {
        boolean valid = false;
        do {
            if (raidSize == 5 || raidSize == 10 || raidSize == 25 || raidSize == 30) {
                valid = true;
                log("You chose raid size " + raidSize);
                calculateRaidSize(raidSize);
            } else {
                log("You chose invalid composition. Possible raid size: 5, 10, 25, 30");
                askRaidSize();
                raidSize = Integer.parseInt((scanner.next()));
            }
        }
        while (!valid);
    }

    public void chooseBoss(Boss boss, int raidSize){
        if(raidSize == 5){log("You're fighting Kutulu ");
        log("Boss armor: " + boss.armor);
        log("Boss hpPoints: " + boss.hpPoints);
        log("Boss damage: "+ boss.dmg);}
        else if(raidSize == 10){}
        else if(raidSize == 25){}
        else if(raidSize ==30) {}
    }


    public void showStats(Hero hero) {
        log(hero.type + " armor: " + hero.armor);
        log(hero.type +" hpPoints: " + hero.hpPoints);
        log(hero.type +" damage: " + hero.dmg);
        log("\n");

    }




    }


