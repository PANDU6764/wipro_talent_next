package MiniProjects;

import java.util.*;

public class StringOperations {

    public static List<String> performOperations(String s1, String s2) {
        List<String> result = new ArrayList<>();

        // 1. Replace every alternate character in S1 with S2
        StringBuilder altReplace = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                altReplace.append(s2);
            } else {
                altReplace.append(s1.charAt(i));
            }
        }
        result.add(altReplace.toString());

        // 2. If S2 appears more than once in S1, replace last occurrence with reverse of S2
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder s1Modified = new StringBuilder(s1);
            s1Modified.replace(lastIndex, lastIndex + s2.length(), new StringBuilder(s2).reverse().toString());
            result.add(s1Modified.toString());
        } else {
            result.add(s1 + s2);
        }

        // 3. If S2 appears more than once in S1, remove first occurrence of S2
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder removedFirst = new StringBuilder(s1);
            removedFirst.delete(firstIndex, firstIndex + s2.length());
            result.add(removedFirst.toString());
        } else {
            result.add(s1);
        }

        // 4. Split S2 and add halves to start and end of S1
        int len = s2.length();
        int firstHalfLen = (len % 2 == 0) ? len / 2 : (len / 2) + 1;
        String firstHalf = s2.substring(0, firstHalfLen);
        String secondHalf = s2.substring(firstHalfLen);
        result.add(firstHalf + s1 + secondHalf);

        // 5. Replace all characters in S1 that are in S2 with '*'
        Set<Character> s2Chars = new HashSet<>();
        for (char c : s2.toCharArray()) {
            s2Chars.add(c);
        }

        StringBuilder masked = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2Chars.contains(c)) {
                masked.append('*');
            } else {
                masked.append(c);
            }
        }
        result.add(masked.toString());

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String S2 (smaller string): ");
        String s2 = sc.nextLine();

        List<String> output = performOperations(s1, s2);

        System.out.println("\nOutput:");
        for (String line : output) {
            System.out.println(line);
        }

        sc.close();
    }
}


