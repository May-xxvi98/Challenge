public class Multiplication {
    public static void main(String[] args) {
        System.out.println(" Multiplication Table 10x10 ");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}