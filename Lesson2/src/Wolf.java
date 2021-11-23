public class Wolf {
    private String sex;
    private String name;
    private String color;
    private int weight;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8){
            System.out.println("Некорректный возраст");
        } else this.age = age;
    }

    public void move (){
        System.out.println("moving");
    }

    public void seat (){
        System.out.println("seating");
    }

    public void run (){
        System.out.println("runing");
    }

    public void spark (){
        System.out.println("sparking");
    }

    public void hunt (){
        System.out.println("hunting");
    }
}
