

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class IteratorExample {
    static Random random = new Random();

    /**
     * 1. Написать класс который содержит ArrayList и методы:
     * - заполняют лист рандомными цифрами
     * - перебирают Итератором и выводят на экран все четные
     * - перебирают итератором и выводят на экран все нечетные
     * - генерируют рандомную стрингу длиной 5
     * - перебираю итератором эту стрингу с конца и
     * выводит тот символ который нужен если он есть,
     * если нет то выдает сообщение
     */
    public static void main(String[] args) {
        System.out.println(createArray());
        ArrayList<Integer> array = createArray();
        System.out.println(evenNumber(array));
        System.out.println(addNumber(array));
        System.out.println(createRandomOfString(5));
        String str = createRandomOfString(5);
        searchOfChar(str, 'e');
    }
    public static ArrayList<Integer> createArray() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(10);
            list.add(a);
        }
        return list;
    }
    public static ArrayList<Integer> evenNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
    public static ArrayList<Integer> addNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        return result;
    }
    public static String createRandomOfString(int length) {

        String str = "erugherogherojghknvbskljdfkeejebgvf";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(10);
            sb.append(str.charAt(num));
        }
        return sb.toString();
    }
    public static void searchOfChar(String str, char s) {
        char[] chars = str.toCharArray();
        ArrayList<Character> listChars = new ArrayList<>();
        for (char c : chars) {
            listChars.add(c);
        }
        ListIterator<Character> it = listChars.listIterator(listChars.size());
        while (it.hasPrevious()) {
            char element = it.previous();
            if (element == s) {
                System.out.println(" find symbol  " + element);
                return;
            }
        }
        System.out.println(" symbol  " + s + " not found");
    }
}//этот метод не всегда срабатывет почему-то......