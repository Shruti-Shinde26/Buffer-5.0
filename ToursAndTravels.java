package Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ToursAndTravels {

    public static void main(String[] args) {
        Input in = new Input();
        in.adding();
        in.toPrint();
    }

}

class Input {
    ArrayList<String> Desti = new ArrayList<String>();
    ArrayList<String> TravelBy = new ArrayList<String>();
    Map<String, Integer> Fare = new HashMap<>();

    void adding() {
        Desti.add("Dal Lake");
        Desti.add("Vembanad Lake");
        Desti.add("Pulicat Lake");
        Desti.add("Puri Beach");
        Desti.add("Hansa Beach");
        Desti.add("Agonda Beach");
        Desti.add("Padmanabhaswamy Temple");
        Desti.add("Kamakhya Temple");
        Desti.add("Somanath Temple");

        TravelBy.add("Airways");
        TravelBy.add("Roadways");
        TravelBy.add("Airways");
        TravelBy.add("Roadways");
        TravelBy.add("Airways");
        TravelBy.add("Roadways");
        TravelBy.add("Airways");
        TravelBy.add("Airways");
        TravelBy.add("Airways");

        Fare.put("Dal Lake", 40000);
        Fare.put("Vembanad Lake", 30000);
        Fare.put("Pulicat Lake", 20000);
        Fare.put("Puri Beach", 50000);
        Fare.put("Hansa Beach", 10000);
        Fare.put("Agonda Beach", 70000);
        Fare.put("Padmanabhaswamy Temple", 80000);
        Fare.put("Kamakhya Temple", 90000);
        Fare.put("Somanath Temple", 70000);
    }

    void toPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to visit lake, beach, or temple?\n1. Lake\n2. Beach\n3. Temple");
        int ch = sc.nextInt();
        TreeMap<Integer, String> sortedFares = new TreeMap<>();

        int startIdx = 0;
        int endIdx = 0;

        switch (ch) {
            case 1: // Lake
                startIdx = 0;
                endIdx = 3;
                break;
            case 2: // Beach
                startIdx = 3;
                endIdx = 6;
                break;
            case 3: // Temple
                startIdx = 6;
                endIdx = 9;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        for (int i = startIdx; i < endIdx; i++) {
            sortedFares.put(Fare.get(Desti.get(i)), Desti.get(i) + " (" + TravelBy.get(i) + ")");
        }

        // Print the sorted fares
        for (Map.Entry<Integer, String> entry : sortedFares.entrySet()) {
            System.out.println("Destination: " + entry.getValue());
            System.out.println("Fare: " + entry.getKey());
        }
    }
}