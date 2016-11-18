package classes;

import java.util.Scanner;
import classes.Hero;

/**
 * Created by nicoleta.timis on 15/11/16.
 */
public class RaidMethods {
    Scanner scanner = new Scanner(System.in);

    public void askRaidSize() {
        System.out.println("Enter the raid size. You can choose 5, 10, 25, 30");
    }

    public void calculateRaidSize(int raidSize) {
        System.out.println("Calculating raid size for your selection:");
        int tankNr = 1;
        if (raidSize > 5) {
            tankNr = 2;
        } 
        System.out.println("number of tanks is: " + tankNr);
        int healerNr = raidSize / 5;
        System.out.println("number of healers is: " + healerNr);
        int dpsNr = raidSize - tankNr - healerNr;
        System.out.println("number of dps is: " + dpsNr);
        System.out.println("\n");
    }

    public void assesRaidSize(int raidSize) {
        boolean valid = false;
        do {
            if (raidSize == 5 || raidSize == 10 || raidSize == 25 || raidSize == 30) {
                valid = true;
                System.out.println("You chose raid size " + raidSize);
                calculateRaidSize(raidSize);
            } else {
                System.out.println("You chose invalid composition. Possible raid size: 5, 10, 25, 30");
                askRaidSize();
                raidSize = Integer.parseInt((scanner.next()));
            }
        }
        while (!valid);
    }

    public void showStats(Hero hero) {
        System.out.println(hero.type + " armor: " + hero.armor);
        System.out.println(hero.type +" hpPoints: " + hero.hpPoints);
        System.out.println(hero.type +" damage: " + hero.dmg);
        System.out.println("\n");

    }

}
