public class StudentDemo {

    // Inner Student class
    static class Student {

        // Data members
        int rollNo;
        String name;

        // Parameterized constructor
        Student(int r, String n) {
            rollNo = r;
            name = n;
            System.out.println("Constructor called for Roll No: " + rollNo);
        }

        // Method to display student details
        void display() {
            System.out.println("Roll No: " + rollNo + "\tName: " + name);
        }

        // Destructor-equivalent in Java
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Destructor(finalize) called for Roll No: " + rollNo);
            super.finalize();
        }
    }

    // Main method
    public static void main(String[] args) throws InterruptedException {

        System.out.println("----- Creating array of objects -----");

        // Creating an array of Student objects
        Student[] s = new Student[3];

        s[0] = new Student(101, "Arun");
        s[1] = new Student(102, "Bala");
        s[2] = new Student(103, "Chitra");

        System.out.println("\n----- Displaying Student Details -----");

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

        System.out.println("\n----- Dereferencing Objects and Requesting Garbage Collection -----");

        // Dereference objects
        for (int i = 0; i < s.length; i++) {
            s[i] = null;
        }

        // Request garbage collection
        System.gc();

        // Give the garbage collector some time
        Thread.sleep(500);

        System.out.println("End of main method.");
    }
}