package classes;

import java.util.NoSuchElementException;
import java.util.Scanner;

import classes.Hero;

import java.util.Arrays;




/**
 * Created by nicoleta.timis on 15/11/16.
 */
public class RaidMethods {
    private Scanner scanner = new Scanner(System.in);
    private int tankNr;
    private int healerNr;
    private int dpsNr;
    private int basedmg;
    private Hero[] raidComposition;


    public void askRaidSize() {
        Utils.log("Enter the raid size. You can choose 5, 10, 25, 30");
    }

    public void askHeroStats() {
        Utils.log("Do you want to see details for a hero?. Write his name");
    }

    public void askSpellDetails() {Utils.log("Enter spell name to get details");}

    public void calculateRaidSize(int raidSize) {
        Utils.log("Calculating raid size for your selection:");
        tankNr = 1;
        if (raidSize > 5) {
            tankNr = 2;
        }
        Utils.log("number of tanks is: " + tankNr);
        healerNr = raidSize / 5;
        Utils.log("number of healers is: " + healerNr);
        dpsNr = raidSize - tankNr - healerNr;
        Utils.log("number of dps is: " + dpsNr);
        Utils.log("\n");
        raidComposition = new Hero[raidSize];

        for (int i = 0; i < raidSize; i++) {
            if (i < tankNr)
                raidComposition[i] = new Warrior();
            else if (i < (healerNr + tankNr))
                raidComposition[i] = new Priest();
            else
                raidComposition[i] = new Mage();
        }

    }

    public void raidDmg(Hero tank, Hero healer, Hero dps) {
        basedmg = (tank.dmg * tankNr + healer.dmg * healerNr + dps.dmg * dpsNr);
        Utils.log("raid dmg: " + basedmg);
    }


    public void createTank() {
        if (tankNr == 1) raidComposition[0] = new Warrior();
        else if (tankNr > 1) raidComposition[1] = new DeathKnight();

    }

    public void createHealers() {
        if (healerNr == 1) raidComposition[1] = new Druid();
        else if (healerNr > 1)
            for (int i = 1; i <= healerNr; i++)
                raidComposition[i + 1] = new Priest();

    }

    public void createDps(int raidSize) {
        if (dpsNr == 3) {
            raidComposition[2] = new Mage();
            raidComposition[3] = new Hunter();
            raidComposition[4] = new Paladin();
        } else if (dpsNr > 3) {
            for (int i = 1; i <= dpsNr; i++) {
                raidComposition[raidSize - dpsNr] = new Mage();
            }
        }
    }

    public void assignNames(int raidSize, String[] array) {
        for (int i = 0; i < raidSize; i++) {
            raidComposition[i].name = array[i];
            Utils.log(raidComposition[i].type + " " + raidComposition[i].name);
        }
    }

    public void assesRaidSize(int raidSize) {
        boolean valid = false;
        do {
            if (raidSize == 5 || raidSize == 10 || raidSize == 25 || raidSize == 30) {
                valid = true;
                Utils.log("You chose raid size " + raidSize);
                calculateRaidSize(raidSize);
            } else {
                Utils.log("You chose invalid composition. Possible raid size: 5, 10, 25, 30");
                askRaidSize();
                raidSize = Integer.parseInt((scanner.next()));
            }
        }
        while (!valid);
    }

    public void heroStats(int raidSize) {
        boolean valid = false;
        do {
            askHeroStats();
            String heroName = scanner.nextLine();
            for (int i = 0; i < raidSize; i++) {
                if (raidComposition[i].name.equalsIgnoreCase(heroName)) {
                    valid = true;
                    Utils.log("Hero details: " + raidComposition[i].name + " type " + raidComposition[i].type + " armor " + raidComposition[i].armor + " hp " + raidComposition[i].hpPoints + " dmg " + raidComposition[i].dmg + " ");
                    Utils.log("spells: " + raidComposition[i].spells[0] + " and " + raidComposition[i].spells[1]);
                }

            }
        }
        while (!valid);
    }
    public void heroSpell(int raidsize){
        askSpellDetails();
        String spellName = scanner.nextLine();
        for(int i= 0; i< raidsize; i++) {
                raidComposition[i].castSpell(spellName);
        }
        }


    public void chooseBoss(Boss boss, int raidSize) {
        if (raidSize == 5) {
            Utils.log("You're fighting Kutulu ");
            Utils.log("Boss armor: " + boss.armor);
            Utils.log("Boss hpPoints: " + boss.hpPoints);
            Utils.log("Boss damage: " + boss.dmg);
        } else if (raidSize == 10) {
        } else if (raidSize == 25) {
        } else if (raidSize == 30) {
        }
    }


    public void showStats(Hero hero) {
        Utils.log(hero.type + " armor: " + hero.armor);
        Utils.log(hero.type + " hpPoints: " + hero.hpPoints);
        Utils.log(hero.type + " damage: " + hero.dmg);
        Utils.log("\n");

    }


}


