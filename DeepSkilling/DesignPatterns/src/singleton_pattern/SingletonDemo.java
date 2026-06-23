package singleton_pattern;

public class SingletonDemo {
    
    public static void run()
    {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("Different objects created");
        }
    }
}
