//Write a java to declare ArrayList and add 10 city names to it. Also, print all details.

import java.util.ArrayList;
import java.util.Collections;

public class Qn5 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Kathmandu");
        cities.add("Pepsicola");
        cities.add("Kadaghari");
        cities.add("Thapathali");
        cities.add("Tikathali");
        cities.add("Newroad");
        cities.add("Aashan");
        cities.add("Syambhu");
        cities.add("Chabil");
        cities.add("Tripureshwor");

        // Collections.sort(cities);
        // for (String printinfo : cities) {
        // System.out.println(printinfo);
        // }

        System.out.println(cities);
    }

}
