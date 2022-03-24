package Semestrovka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CreationMassive {


    public static int[] creationMassive(File field) throws FileNotFoundException {
        FileReader fr = new FileReader(field);
        Scanner sc = new Scanner(fr);
        String[] array = sc.nextLine().split(" ");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                array2[i] = Integer.parseInt(array[i]);
            }
            catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
        }
        return array2;
    }

}