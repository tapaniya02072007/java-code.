// protected access specifier

class vehicle
{
    protected int Speed;
}

class Bike extends vehicle   // inheritance added
{
    void setSpeed(int s)
    {
        Speed = s;
    }

    int getSpeed()
    {
        return Speed;
    }
}

public class prot_aces_speci
{
    public static void main(String[] args)
    {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Access via subclass method: " + b.getSpeed());

        vehicle v = new vehicle();
        
    }
}