package java8features;

//Turn letters order, but for special symbols is must stay the same.

//Input string: 	a!!!b.c.d,e'f,ghi
//Output string:	i!!!h.g.f,e'd,cba

public class StringReverseWithoutSpecialChar {
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char [] chararr = str.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();
        String newst="";

        for (int i=0; i <chararr.length;i++){
            if(Character.isAlphabetic (chararr[i])){
                newst = newst+chararr[i];
            }
        }

        stringBuffer.append(newst);
        String str1 = stringBuffer.reverse().toString();
        char [] chararr2 = str1.toCharArray();

        int j = 0;
        for (int i=0; i <chararr.length;i++){
            if(Character.isAlphabetic (chararr[i])){
                chararr[i] = chararr2[j];
                j++;
            }
        }

        String finalStr = "";
        for(char ch : chararr)
            finalStr  = finalStr+ch;
        System.out.println(str);
        System.out.println(finalStr);
    }
}
