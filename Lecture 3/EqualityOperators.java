public class EqualityOperators{
    public static void main(String[] args) {
        boolean isCorrect = false;

        String cat = "Cat";
        String dog = "Cat";
        // 1 way of determining eqaulity ==
        /*
        if(1==2) {
            isCorrect = false;
        }

        if(dog == cat) {
            //isCorrect?  Doesn't matter
        }
        */
        if(dog.equals(cat)) {
            //YES
            isCorrect = true;
        }

        // Can not compare decimals
        /*
        if(1.2 == 1.2) {
            //what?
        }
        */
        double sum = 0;
        System.out.println("Sum: " + sum);
        for(int i = 0; i < 10; i++) {
            sum = sum + .1;
            System.out.println("Sum: " + sum);
        }
    }
}