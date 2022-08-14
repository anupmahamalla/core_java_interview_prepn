package oopsconcept;

class StaticBindingAndDynamicBindingExample {

    // Static nested inner class
    // Class 1
    public static class Superclass {
        // Method of inner class
        static void print()
        {
            // Print statement
            System.out.println(  "print() in superclass is called");
        }

        // Method of inner class
        public String  printDynamic()
        {
            // Print statement
            System.out.println("printDynamic() in superclass is called");
            return null;
        }
    }

    // Static nested inner class
    // Class 2
    public static class Subclass extends Superclass {

        // Method of inner class
        public String printDynamic()
        {
            // print statement
            System.out.println("print() in subclass is called");
            return null;
        }

        // Method of inner class
        static void print()
        {
            // print statement
            System.out.println(
                    "print() in subclass is called");
        }
    }

    // Method of main class
    // Main driver method
    public static void main(String[] args)
    {
        // Creating objects of static inner classes
        // inside main() method
        Superclass super1 = new Superclass();
        Superclass super2 = new Subclass();

        Subclass.print();
        Superclass.print();

        // Calling method over above objects
        super1.print();
        super2.print();


        Subclass.print();
        Superclass.print();

        // Calling method over above objects
        super1.printDynamic();
        super2.print();
        super2.printDynamic();

    }
}