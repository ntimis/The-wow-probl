package classes;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Object;
import java.util.Scanner;

/**
 * Created by nicoleta.timis on 18/11/16.
 */
public class Utils {
    public static void log(Object obj) {
        System.out.println(obj);

    }

    private static final String FILE_PATH = "src/CharNames.txt";
    public void arrayName(){
        String[] filearray;
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
            for(int i=0; i<filearray.length; i++) {
                System.out.println(filearray[i]);
            }
        }

    }
}


