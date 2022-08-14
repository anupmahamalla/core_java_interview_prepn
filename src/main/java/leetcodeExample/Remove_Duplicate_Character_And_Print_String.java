package leetcodeExample;

import java.util.LinkedHashMap;

public class Remove_Duplicate_Character_And_Print_String{
    public static void main(String[] args) {
        String s = "Anupkumar Mahamalla";

        //s = "Anupkmr hl"
        //collection
        LinkedHashMap<String,Integer> ma = new LinkedHashMap<>();

        String [] strArr = s.split( " ");

        for( int i=0; i <strArr.length;i++) {
            String tempStr = strArr[i];
            for (int j = 0; j < tempStr.length(); j++) {

                String strValue = String.valueOf(tempStr.charAt(j)).toLowerCase();
                if ( ma.size() > 0 &&  ma.get(strValue) != null) {

                } else {
                    ma.put(strValue, 1);
                    System.out.print(tempStr.charAt(j));
                }
            }
            System.out.print(" ");
        }

        //

    }
}
