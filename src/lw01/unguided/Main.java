package lw01.unguided;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc2 = new Scanner(Main.class.getResourceAsStream("washes.txt"));

        int record = sc2.nextInt();
        
        WashService[] wash = new WashService[16];

        for (int i = 0; i < record; i++) {
            String type = sc2.next();
            String id = sc2.next();
            int days = sc2.nextInt();
            int units = sc2.nextInt();

            if (type.equals("MOTORCYCLE")) {
                wash[i] = new MotorcycleWash(id, days);
            } else if (type.equals("CAR")) {
                wash[i] = new CarWash(id, days, units);
            }
        }
        sc2.close();

    for (int i  = 0; i < wash.length; i++) {
        WashService service = wash[i];
        System.out.println(service.summary());
    }
}
}