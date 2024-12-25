public class mainClass {
    public static void main(String[] args) {

        String word = "I love Java";
        HomeWork.turnString(word);

        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        HomeWork.getDistinctNumbers(ints);

        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println(HomeWork.findSecondMaxElement(arr));

        String word1 = "    fly me    to the    moon    ";
        System.out.println(HomeWork.lengthOfLastWord(word1));

        String word2 = "abba";
        System.out.println(HomeWork.isPalindrome(word2));

    }
}
