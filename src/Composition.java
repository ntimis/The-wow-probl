/**
 * Created by nicoleta.timis on 15/11/16.
 */

import classes.*;

import java.util.Scanner;

import static classes.Utils.log;

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


//        methods.showStats(tank);
//        methods.showStats(healer);
//        methods.showStats(dps);

        methods.raidDmg(tank, healer, dps);

        methods.createTank();
        methods.createHealers();

        methods.createDps(raidSize);

        methods.assignNames(raidSize, Utils.randNames(Utils.arrayName(), raidSize));
        methods.heroStats(raidSize);
        methods.heroSpell(raidSize);
    }
}
