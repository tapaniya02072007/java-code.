// Java program to demonstrate 
// object cloning (shallow copy)

class Person implements Cloneable 
{
    String name;
    int age;

    // Constructor
    public Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    // Overriding clone() method
    @Override
    public Object clone() throws CloneNotSupportedException 
	{
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() 
	{
        return "Person{name:'" + name + "', age:" + age + "}";
    }
}

public class shallo_clo_method 
{
    public static void main(String[] args) 
	{
        try 
		{
            // Create original object
            Person p1 = new Person("Ram", 24);

            // Clone the object
            Person p2 = (Person) p1.clone();

            // Print both objects
            System.out.println("Original: " + p1);
            System.out.println("Cloned: " + p2);

        } 
		catch (CloneNotSupportedException e) 
		{
            e.printStackTrace();
        }
    }
}



