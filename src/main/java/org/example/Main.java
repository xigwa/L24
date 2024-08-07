package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


    }

    //Написати функцію, яка підраховує кількість слів у рядку.
    public static int task1(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        String[] wordsAr = text.trim().split("\\s+");
        return wordsAr.length;
    }

    //Напишіть метод, який приймає на вхід рядок і повертає його обернену версію.
    public static String task2(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }

    //Напишіть метод, який приймає рядок і повертає кількість голосних літер (a, e, i, o, u) у цьому рядку.
    public static int task3(String text) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    //Напишіть метод, який перевіряє, чи є заданий рядок паліндромом.
    public static boolean task4(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    //Напишіть метод, який приймає рядок і повертає новий рядок без дублікатів.
    public static String task5(String text) {
        if (text == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}