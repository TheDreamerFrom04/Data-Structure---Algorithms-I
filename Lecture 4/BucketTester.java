public class BucketTester
{
    public static void main(String[] args) {
        TylerHolder test = new TylerHolder();
        for (int i = 0; i<11; i++) {
            test.addToBucket("Number " + i);
            System.out.println("Size = " + test.size());
            test.printer();
        }
        System.out.println("The array's fifth element is: " + test.getPos(5));
        test.clear();
        test.printer();
    }
}