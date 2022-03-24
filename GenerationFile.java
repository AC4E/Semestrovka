package Semestrovka;

import java.io.*;
import java.util.Random;

public class GenerationFile {

    static Random r = new Random();

    public static void createFile() throws IOException {
        int a = 100;
        int b = 10_000;
        int countFields = 50;
        for (int i = 0; i <= countFields ; i++) {
            File file = new File("elements\\Data" + i + ".txt");
                int rndCount = a + (int) (Math.random() * ((b - a) + 1));
                write(file, rndCount);
        }
    }

    public static void write(File field, int rndCount) throws IOException {
        FileWriter writer = new FileWriter(field);
        for (int i = 0; i < rndCount ; i++) {
            writer.write( r.nextInt() + " ");
        }
        writer.close();
    }

    public static void main(String[] args) {

    }
}