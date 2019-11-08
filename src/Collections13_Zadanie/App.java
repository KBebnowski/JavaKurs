// Podane sa 2 tablice
// Do kolejnych elementow tablicy vehicles dodaj kolejno elementy z tablicy drivers
// Uzyj odpowiednich kolekcji

package Collections13_Zadanie;

import java.util.*;

public class App {

    public static String[]vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };

    public static String[][]drivers={
            {"Carol", "Steff", "Conor"},
            {"Leo", "Mia"},
            {"Jessica", "Andy"},
    };

    public static void main(String[] args) {

        Map<String, Set<String>> employee = new HashMap<>();


        for(int i=0;i<vehicles.length;i++){
            String vehicle = vehicles[i];
            Set<String>driversSet = new LinkedHashSet<>();
            for (int j=0; j<drivers[i].length;j++){
                driversSet.add(drivers[i][j]);
            }
            employee.put(vehicle,driversSet);
        }

        System.out.println(employee.get("ambulance"));
        System.out.println(employee.get("helicopter"));
        System.out.println(employee.get("lifeboat"));
    }
}
