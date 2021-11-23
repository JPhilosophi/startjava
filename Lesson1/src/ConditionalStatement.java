public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("age more then 20");
        }

        double heigt = 1.6;

        if (heigt < 1.80) {
            System.out.println("height more 1.80");
        } else {
            System.out.println("height less 1.80");
        }

        char firstLetterName = 'M';
        if (firstLetterName == 'M') {
            System.out.println("first names letter start with M");
        } else if (firstLetterName == 'I') {
            System.out.println("first names letter start with I");
        } else {
            System.out.println("note mutch");
        }

        boolean male = true;
        if (male) {
            System.out.println("male");
        } else {
            System.out.println("Not male");
        }
        
        System.out.println("test change");
    }
}