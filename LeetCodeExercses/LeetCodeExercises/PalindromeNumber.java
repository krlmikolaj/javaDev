
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);

        char[] digits = number.toCharArray();
        List<Character> digitsList = new ArrayList<>();
        for (char digit : digits) {
            digitsList.add(digit);
        }
        List<Character> reverseDigits = new ArrayList<>(digitsList);
        Collections.reverse(reverseDigits);

        if(digitsList.equals(reverseDigits)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean isTrue = isPalindrome(121333);
        System.out.println(isTrue);
    }
}


