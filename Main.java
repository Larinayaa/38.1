import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Малина", "Апельсин", "Киви", "Малина", "Банан", "Киви");
        Map<String, Boolean> result = poiskPovtora(strings);
        System.out.println(result);
    }
    public static Map<String, Boolean> poiskPovtora(List<String> strings) {
        Map<String, Integer> countMap = new HashMap<>(); //для хранения количества вхождений
        for (String str : strings) {//подсчет вохождений
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        Map<String, Boolean> resultatMap = new HashMap<>();//создали мап результ
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {//проверка, повторы есть или нет
            resultatMap.put(entry.getKey(), entry.getValue() > 1);
        }
        return resultatMap;
    }
}
