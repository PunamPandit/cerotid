package assignment2;

public class TableByDoWhile {
    public static void main(String[] args) {
        int i = 2;
        do {
            int a = 1;
            do {
                int mul = i * a;
                System.out.println(i + " * " + a + " = " + mul);
                a++;
            } while (a <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
