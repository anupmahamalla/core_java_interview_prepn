package leetcodeExample;

public class FindMostWordsinArray {
    public static void main (String [] args){
       String [] sentences = {"alice and bob love leetcode","this is great thanks very much much", "i think so too", "this is great thanks very much"};


        int maxWords = -1, currLength;

        for(int i=0; i<sentences.length; i++){

            int len1 = sentences[i].length();
            int len2 = sentences[i].replace(" ", "").length();

            currLength = len1 -len2;
            maxWords = Math.max(maxWords, currLength);
        }
        System.out.println(maxWords+1);

       int maxlen= 0;
        for (int x=0; x < sentences.length; x++){
            String val =sentences[x];
           String [] temp = val.split(" ");
           int len = temp.length;

           maxlen = Math.max(maxlen, len);
       }
        System.out.println(maxlen);
    }
}
