public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        int sum1 = mathOps.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);
        double sum2 = mathOps.add(10.5, 20.7, 30.3);
        System.out.println("Sum of three doubles: " + sum2);
        String concat = mathOps.add("Hello ", "World");
        System.out.println("Concatenated string: " + concat);
    }
}