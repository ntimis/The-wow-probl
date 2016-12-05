/**
 * Created by nicoleta.timis on 15/11/16.
 */

import classes.*;

import java.util.Scanner;

public class Composition {
    public static void main(String[] args) {

        RaidMethods methods = new RaidMethods();
        Scanner scanner = new Scanner(System.in);
        methods.askRaidSize();
        int raidSize = Integer.parseInt((scanner.next()));
        methods.assesRaidSize(raidSize);

        Hero tank = new DeathKnight();
        Hero healer = new Druid();
        Hero dps = new Mage();
        tank.armor = 300;
        tank.hpPoints = 1000;
        tank.dmg = 200;
        tank.type = "tank";

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

//        Utils.arrayName();
        Utils.randNames(Utils.arrayName());
    }
}
