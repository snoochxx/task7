import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }

        System.out.print("Массив: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        Integer majority = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                majority = entry.getKey();
                break;
            }
        }

        if (majority != null) {
            System.out.println("Мажоритарный элемент: " + majority);
        } else {
            System.out.println("Мажоритарного элемента нет");
        }
    }
}
