package _1_Arrays_Hashing;

import java.util.HashMap;

public class _2_ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean  isAnagram(String s, String t) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        int count = 0;
        char[] charArray = s.toCharArray();

        if(s.length() == t.length()){
            for(char perChar: charArray){
                count = dictionary.containsKey(perChar) ? dictionary.get(perChar) + 1 : 0;
                dictionary.put(String.valueOf(perChar),count);
            }
        }

        System.out.println(dictionary);

        return false;
    }
}
