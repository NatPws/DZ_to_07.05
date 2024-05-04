import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<>(List.of("123456789", "987654321")));
        phoneBook.put("Петров", new ArrayList<>(List.of("456789123")));
        phoneBook.put("Сидоров", new ArrayList<>(List.of("789123456", "666666", "7777777")));

        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

// при добавлении или удалении телефонного номера выше, в output выводятся значения в порядке убывания
// по количеству номеров телефона:
// Сидоров: [789123456, 666666, 7777777]
// Иванов: [123456789, 987654321]
// Петров: [456789123]