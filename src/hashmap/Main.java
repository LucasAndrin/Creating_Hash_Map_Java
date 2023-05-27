package hashmap;

import utils.RandomStringGenerator;

import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        Random random = new Random();

        System.out.print("Creating people... ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String name = RandomStringGenerator.generateRandomString(3);
            int age = random.nextInt(100);
            people.put(name, age);
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Reading people... ");
        start = System.currentTimeMillis();
        for (String name : people.keySet()) {
            int age = people.get(name);
        }
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Updating people... ");
        start = System.currentTimeMillis();
        people.replaceAll((n, v) -> random.nextInt(100));
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");

        System.out.print("Deleting people... ");
        start = System.currentTimeMillis();
        people.clear();
        System.out.print(System.currentTimeMillis() - start);
        System.out.println("ms");
    }

}