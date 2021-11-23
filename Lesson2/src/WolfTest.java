public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(5);
        wolf.setColor("black");
        wolf.setName("Joy");
        wolf.setSex("male");
        wolf.setWeight(15);

        System.out.println(wolf.getSex());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());

        wolf.hunt();
        wolf.move();
        wolf.spark();
        wolf.seat();
        wolf.run();
    }
}
