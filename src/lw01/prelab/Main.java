package lw01.prelab;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/lw01/prelab/Jobs.txt"));

        List<PrintJob> jobs = new ArrayList<>();
        while (sc.hasNext()) {
            String type = sc.next();
            String id = sc.next();
            int pages = sc.nextInt();
            if (type.equals("MONO")) {
                jobs.add(new MonoPrint(id, pages));
            } else if (type.equals("COLOUR")) {
                jobs.add(new ColourPrint(id, pages));
            }
        }
        sc.close();

        for (PrintJob job : jobs) {
            System.out.println(job.summary());
        }
    }
}
