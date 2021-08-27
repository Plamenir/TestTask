import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        line = sc.nextLine();
        if(hasDuplicateWords(line)) {
            System.out.println("Строка содержит дубликаты!");
        } else {
            System.out.println("Строка не содержит дубликаты!");
        }
    }

    static private boolean hasDuplicateWords(String line) {
        String[] words = line.split(" ");
        Map<String,String> wordsMap = new HashMap<>();
        for(String word : words) {
            word = word.toUpperCase();
            if(wordsMap.get(word) != null) {
                return true;
            } else {
                wordsMap.put(word, word);
            }
        }
        return false;
    }
}
