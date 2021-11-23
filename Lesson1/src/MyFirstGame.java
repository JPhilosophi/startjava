public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 0 + (int) (Math.random() * 10);
        int num = 5;

        while (hiddenNumber != num) {
            if (num > hiddenNumber){
                System.out.println("Данное число больше того, что загадал компьютер");
                num--;
            } else if (num < hiddenNumber){
                System.out.println("Данное число меньше того, что загадал компьютер");
                num++;
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}