package classes;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Object;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
import java.util.ArrayList;

/**
 * Created by nicoleta.timis on 18/11/16.
 */
public class Utils {
    public static void log(Object obj) {
        System.out.println(obj);

    }

    private static final String FILE_PATH = "src/CharNames.txt";

    public static String[] arrayName() {
        String[] filearray = new String[30];
        File file = new File(FILE_PATH);
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("file exists: " + file.exists());
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
            filearray = line.split(" ");
        }
        return filearray;
    }


    public static String[] randNames(String[] array,int nr) {
        log("Random geneerated list of name for your raid");
        for(int i=1; i<=nr; i++) {
            int randNr =new Random().nextInt(array.length - i);
            String randomElement = (array[randNr]);
            String aux = array[array.length - i];
            array[array.length - i] = randomElement;
            array[randNr] = aux;
            log(randomElement);

        }
        return array;
    }

}


