public class Car implements Measurable{
    // 1 - Never use Static
    // 2 - If you need to for some reason, here are some places: 1. Constants (a quarter should always be 0.25)
    private static int wheels;
    public Car() {
        wheels = 4;
    }

    // What about static methods?
    // NO. Never use static methods.
    // If you have to for some reason: Never have it affect a global variable
    // Why would you use it?  You can use it to calculate something that doesn't change any global variables.
    public void setWheels(int inputWheels) {
        wheels = inputWheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void flatTire() {
        wheels--;
    }

    // This is an overriden method
    @Override
    public void measure() {
        System.out.println("Wheels");
    }
}