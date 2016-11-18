/**
 * Created by nicoleta.timis on 15/11/16.
 */

import classes.Hero;
import classes.RaidMethods;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Composition {
    public static void main(String[] args) {

        RaidMethods methods = new RaidMethods();
        Scanner scanner = new Scanner(System.in);
        methods.askRaidSize();
        int raidSize = Integer.parseInt((scanner.next()));
        methods.assesRaidSize(raidSize);

        Hero tank = new Hero();
        Hero healer = new Hero();
        Hero dps = new Hero();
        tank.armor = 300;
        tank.hpPoints = 1000;
        tank.dmg = 200;
        tank.type = "tank";


//       System.out.println("tank armor: " + tank.getArmor());
//       System.out.println("tank hpPoints: " + tank.getHpPoints());
//       System.out.println("tank damage: " + tank.getDmg());


        healer.armor = 100;
        healer.hpPoints = 600;
        healer.dmg = 200;
        healer.type = "healer";

        dps.armor = 100;
        dps.hpPoints = 400;
        dps.dmg = 500;
        dps.type = "dps";
        methods.showStats(healer);
        methods.showStats(dps);
        methods.showStats(tank);

        try {
            File CharNameFile = new File("CharName.txt");
            Scanner inventoryScanner = new Scanner(CharNameFile);
        } catch(FileNotFoundException) {
            Logger.getLogger()
        }
    }
}
