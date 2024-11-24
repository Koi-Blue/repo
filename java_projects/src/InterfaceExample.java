interface MyInterface
{
    int CONSTANT = 100; // 等价于 public static final int CONSTANT = 100;
    void method(); // 等价于 public abstract void method();
}

class MyClass implements MyInterface
{
    @Override
    public void method()
    {
        System.out.println("Implementing interface ~ ");
    }
}


public class InterfaceExample {
    public static void main (String[] args)
    {
        MyClass obj = new MyClass(); // 也可以用 MyInterface obj = new MyClass();
        obj.method();
    }
}
