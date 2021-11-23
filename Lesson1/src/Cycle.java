public class Cycle {
    public static void main(String[] args) {
        for (int i =0; i < 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i != -8) {
            System.out.println(i);
            i -= 2;
        }

        int j = 20;
        int sum = 0;
        do {
            if (j % 2 != 0) {
                sum += j;
                System.out.println(sum);
            }
            j--;
        } while (j != 10);
    }
}