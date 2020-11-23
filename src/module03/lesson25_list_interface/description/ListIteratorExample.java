package module03.lesson25_list_interface.description;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Класс ListIteratorExample
 *
 * @author Kamila Meshcheryakova
 * created 26.09.2020
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "tenet";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
