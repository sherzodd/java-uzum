package org.uzum.iggytoto.javacore_files;

import java.io.File;
import java.util.Scanner;

public class Homework2Template {

    public static void main(String[] args){
        // тут пишем код домашки =)

        while (true) {
            System.out.print("Enter folder path: ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            File folder = new File(s);

            if (!folder.exists() || !folder.isDirectory()) {
                System.out.println("Error: Folder '" + s + "' does not exist.");
                continue;
            }

            findLargeFiles(folder);

            System.out.print("Search another folder? (y/n): ");
            String answer = in.nextLine().toLowerCase();
            if (!answer.equals("y")) {
                break;
            }
        }

    }

    private static void findLargeFiles(File folder) {
        for (File file : folder.listFiles()) {
            if (file.isFile() && file.length() > 10 * 1024 * 1024) {
                double sizeInMB = file.length() / (1024.0 * 1024.0);
                System.out.println(file.getAbsolutePath() + " (" + sizeInMB + ")");
            } else if (file.isDirectory()) {
                findLargeFiles(file);
            }
        }
    }
}


