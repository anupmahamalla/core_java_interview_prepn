package leetcodeExample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_valid_Anagram {
    public static void main(String[] args) {
        String s1 = "anupp";
        String s2 = new String("punap");

        Map<String, Long> tempMap2 = Arrays.stream(s1.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String, Long> tempMap1 = Arrays.stream(s2.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        if(tempMap1.equals(tempMap2)){
                System.out.println("all content are same");
        }
        boolean result =  extracted(s1, s2);
    }

    private static boolean extracted(String s1, String s2) {
        if(s2.length()!= s1.length())
            return false;
        int[] alpMap = new int[27];
        for(int i = 0; i< s2.length(); i++){
            char temp= s2.charAt(i);
            int newtemp=(temp-'a');
            System.out.println(newtemp);

            char temps1= s1.charAt(i);
            int newtemps1=(temps1-'a');
            System.out.println(newtemps1);

            alpMap[s2.charAt(i)-'a']++;
            alpMap[s1.charAt(i)-'a']--;
        }
        for(int n : alpMap){
            if(n!=0)
                return false;
        }
        return true;
    }
}
