public class TestCar{
    public static void main(String[] args) {
        Car toyota = new Car();
        Car jeep = new Car();

        System.out.println("Our Toyota has this many wheels: " + toyota.getWheels());
        System.out.println("Our Jeep has this many wheels: " + jeep.getWheels());

        jeep.flatTire();

        System.out.println("Our Jeep gets a flat tire!");
        System.out.println("Our Toyota has this many wheels: " + toyota.getWheels());
        System.out.println("Our Jeep has this many wheels: " + jeep.getWheels());

        // CAN NOT DO THE FOLLOWING:
        // Measurable measure = new Measurable();

        System.out.println("Hello world");
        // Fact 1: You can have infinite interfaces
        // Fact 2: In Java, you can only have one parent/superclass
        // So, just like if you do not write a constructor, Java writes one for you, but if you do not write a superclass extends?  Java does this for you too!
        // The object class is the biggest class
        // It's the reason you can do silly thing without writing code for it
        Chicken ck = new Chicken();
        ck.equals("");
        // Object contains toString and.equals()
        
    }
}