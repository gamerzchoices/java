import java.util.HashMap;

/* HASHMAP - HashMap stores data in key-value pairs. 
 

Methods	                Description
.get(name);	            To Access item.
.remove(name);	        Removes item.
.clear();	            Clear all items
.size();	            Get size of HashMap

*/

public class HashMapWork {
    public static void main(String[] args) {
        HashMap<String, Integer> product = new HashMap<String, Integer>();

        product.put("Alexa", 10000);
        product.put("Leather Chair", 4000);
        product.put("Rakhi", 100);

        System.out.println(product);

        System.out.println(product.get("Rakhi"));

        System.out.println(product.size());

        // PRINT KEYS ONLY
        for (String keys : product.keySet()) {
            System.out.println(keys);
        }

        // PRINT VALUES ONLY
        for (Integer i : product.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : product.keySet()) {
            System.out.println("key is: " + i + " value is: " + product.get(i));
        }
    }
}
