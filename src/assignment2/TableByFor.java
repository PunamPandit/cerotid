package assignment2;

public class TableByFor {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("table of " + i + " are as follows");
            for (int a = 1; a <= 10; a++) {
                int mul = i * a;
                System.out.println(i + "*" + a + "=" + mul);
            }
            System.out.println();
        }
    }
}


