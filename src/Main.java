public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    public static int calc(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculateAvrage(int[] values){
        double a = 0;
        for (int value : values) {
            a += value;
        }
        return a / values.length;
    }
}
