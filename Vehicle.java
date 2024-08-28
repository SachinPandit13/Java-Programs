class Vehicle
{
    int mwxspeed=120;

    public static void drive()
    {
        System.out.println("Theé vehice is running");
    }

    public void race()
    {
        System.out.print("The vehicle speed"+mwxspeed);
    }

}
class car extends Vehicle{
    int mwxspeed=100;

    public static void drive()
    {
        System.out.println("Car is driven");
    }

    public void race()
    {
        System.out.print("Car speed"+mwxspeed);
    }

    public static void main(String args[])
    {
        Vehicle v= new car();
        v.race();
        v.drive();
        System.out.println("The max speed is "+v.mwxspeed);
    }
}
