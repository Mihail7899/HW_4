import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dor", "pone", "world", "map", "log", "book", "pone", "song", "wolf", "dor", "game",
                "ready", "world", "script", "street"};

        // Задание 1.1
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // Задание 1.2
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");



        // Задание 2
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "915-236-76-48");
        pb.add("Petrov", "912-549-96-32");
        pb.add("Sidorov", "920-438-65-84");
        pb.add("Sidorov", "922-385-56-38");

        System.out.println(pb.get("Sidorov"));
    }
}