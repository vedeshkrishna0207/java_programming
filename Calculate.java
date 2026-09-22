public class Calculate { 
 
    // Overloaded method - two integers 
    int add(int a, int b) { 
        return a + b; 
    } 
 
    // Overloaded method - two doubles 
    double add(double a, double b) { 
        return a + b; 
    } 
 
    // Overloaded method - three integers 
    int add(int a, int b, int c) { 
        return a + b + c; 
    } 
 
    public static void main(String[] args) { 
        Calculate obj = new Calculate(); 
 
        System.out.println("Sum of two integers (5, 10): " + obj.add(5, 10)); 
        System.out.println("Sum of two doubles (5.5, 2.3): " + obj.add(5.5, 2.3)); 
        System.out.println("Sum of three integers (2, 4, 6): " + obj.add(2, 4, 6)); 
    } 
}