public class HomeWork {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        for (int i = string.length(); i > 0;) System.out.print(string.charAt(--i));
        System.out.println();
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        if (ints.length == 0) return;
        int buffer = ints[0];
        System.out.print(buffer);
        for (int i: ints) {
            if (i == buffer) continue;
            buffer = i;
            System.out.print(" " + i);
        }
        System.out.println();
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        if (arr.length == 0) return null;
        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        for (int i: arr){
            if (i > max) {
                preMax = max;
                max = i;
                continue;
            }
            if (i > preMax) preMax = i;
        }
        return preMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        if (string.isEmpty()) return null;
        String[] words = string.trim().split(" ");
        int idLastWord = words.length - 1;
        return words[idLastWord].length();
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        int lastId = string.length() - 1;
        int halfLen = string.length() / 2 + 1;
        for (int i = 0; i < halfLen; i++) {
            if (string.charAt(i) != string.charAt(lastId - i)) return false;
        }
        return true;
    }
}
