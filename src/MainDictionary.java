import utils.RandomStringGenerator;
import utils.hashtable.Dictionary;

import java.util.Random;

public class MainDictionary {
    public static void main(String[] args) {
        Dictionary<String, Integer> people = new Dictionary<>();
        int size = 10000;
        String[] names = new String[size];
        Random random = new Random();

        System.out.print("Creating people... ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            names[i] = RandomStringGenerator.generateRandomString(3);
            people.put(names[i], random.nextInt(100));
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Reading people... ");
        start = System.currentTimeMillis();
        for (String name: names) {
            people.get(name);
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Updating people... ");
        start = System.currentTimeMillis();
        for (String name: names) {
            people.put(name, random.nextInt(100));
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Deleting people... ");
        start = System.currentTimeMillis();
        for (String name : names) {
            people.remove(name);
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");
    }
}
