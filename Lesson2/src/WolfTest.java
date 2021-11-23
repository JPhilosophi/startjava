public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        String name = wolf.name = "Maylo";
        String sex = wolf.sex = "male";
        String color = wolf.color = "black";
        int weight = wolf.weight = 15;
        int age = wolf.age = 5;

        System.out.println(name);
        System.out.println(sex);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(age);

        wolf.hunt();
        wolf.move();
        wolf.spark();
        wolf.seat();
        wolf.run();
    }
}
