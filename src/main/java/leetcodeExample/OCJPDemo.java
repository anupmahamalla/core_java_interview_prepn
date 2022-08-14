package leetcodeExample;

class FirstNonRepeatedCharFirst1 {
    public static void main(String args[]) {
     
        String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }





    }
}

class Racer {
    protected int number;
    protected void setNumber(int val) { number = val; }
    protected int getNumber() { return number; }
}
class Sprinter extends Racer {
    String spec;

    Sprinter(String val) {
        spec = val;
    }

    String getSpec() {
        return spec;
    }
}

class Meet {
    public static void main(String args[]) {
        Sprinter s1 = new Sprinter("50 Yard Dash");
        Sprinter s2 = new Sprinter("100 Yard Dash");
        s1.number = 125;
        System.out.println(s2.number + ":" + s1.getSpec());
    }
}


class Exam {
    public static void main(String[] args) {
        double grade = 80;

        String result;
        if (grade >= 70)
            result = "Pass";
        else
            result = "Fail";
        System.out.println(result);
    }
}

class Q28fd {
    public static void main(String[] args) {
        int counter = 0;
        l1:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            l2:
            while (j++ < 10) {
                if (j > i) break l2;
                if (j == i) {
                    counter++;
                    continue l1;
                }
            }
        }
        System.out.println(counter);
    }
}

class MyClass {
    public static void main(String[] args) {
        int i = 0;
        int j;
        for (j = 0; j < 10; ++j) { i++; }
        System.out.println(i + " " + j);
    }
}

class MyClass2 {
    public static void main(String[] args) {
        String [][] arr = {{"red","green","blue"}, {"yellow","orange"},{"yellow","orange","raju", "raja", "ram"}};
        for ( int x = 0; x < arr.length; x++){
            for ( int y = 0; y < arr[x].length; y++ ) {
                System.out.print(arr[x][y] + " ");
                if (arr[x][y].equals("green")) {
                    break;
                }
            }
            continue;
        }



       /* int j = 10; for (int i = 0, int j += >90; i < j; i++) { j--; }

        for (int i = 10; i = 0; i--) {}

        for (int i = 0, j = 100; i < j; i++, --j) {;}

        int i, j; for (j = 100; i < j; j--) { i += 2; }

        int i = 100; for ((i > 0); i--) {}*/
    }
}