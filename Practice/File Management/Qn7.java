//Write a java program to create 100 files and delete them.

import java.io.File;

public class Qn7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            dFiles("Text " + i + ".txt");
        }
    }

    public static void mFiles(String fileNames) {
        try {
            File f = new File(fileNames);
            if (f.createNewFile()) {
                System.out.println("File created sucessfully.");

            } else {
                System.out.println("File already exist.");
            }

        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }

    }

    public static void dFiles(String fileNames) {
        try {
            File f = new File(fileNames);
            if (f.delete()) {
                System.out.println("File created sucessfully.");

            } else {
                System.out.println("File already exist.");
            }

        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}
