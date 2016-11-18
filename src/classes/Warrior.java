package classes;

/**
 * Created by nicoleta.timis on 16/11/16.
 */
public class Warrior extends Hero{
        public double Pummel(){
          return (10 * dmg)/100;
        }

    public double FuriousSlash(){
        return (15 * dmg)/100;
    }
}

