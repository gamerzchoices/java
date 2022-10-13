//Write a java program to create a HashMap of the country name and capital city and print them all.

import java.util.HashMap;

public class Qn7 {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("Nepal", "Kathmandu");
        names.put("Brazil", "Rio De Jenerio");
        names.put("Germany", "Berlin");
        names.put("Argentina", "Buenos Aires");

        for (String printinfo : names.keySet()) {
            System.out.println("Capital of " + printinfo + " is " + names.get(printinfo));
        }

    }

}
