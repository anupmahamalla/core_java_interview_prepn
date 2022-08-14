package java8features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Vowels_And_consonants_From_Given_Sentence {
    public static void main(String[] args) {
        String str = "my name is Anupkumar Mahamalla";

        str = str.toLowerCase();

        Set<Character> charSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        List<Character> charList = Arrays.asList('a','e','i','o','u');

        System.out.println(str.chars().filter(ele -> charList.contains((char)ele)).count());

        System.out.println(str.chars().filter(ele -> charSet.contains((char)ele)).count());

        System.out.println("\n");


    }
}

