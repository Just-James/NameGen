package Prac.NameGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String> firstNames = new ArrayList<>();
        firstNames.add("Bob");
        firstNames.add("Bill");
        firstNames.add("Ben");
        firstNames.add("Beth");
        firstNames.add("Beatrix");
        List<String> surNames = new ArrayList<>();
        surNames.add("Bullworth");
        surNames.add("BeanShallow");
        surNames.add("Bagton");
        surNames.add("Batmyth");
        surNames.add("Byson");

        Random randomgen = new Random();

        int rand1 = randomgen.nextInt(4);
        int rand2 = randomgen.nextInt(4);

        System.out.println(firstNames.get(rand1));
        System.out.println(surNames.get(rand2));






    }
}
