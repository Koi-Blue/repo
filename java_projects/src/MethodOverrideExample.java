class Parent
{
    public void method()
    {
        System.out.println("Parent method");
    }

}

class Child extends Parent
{
    @Override
    public void method()
    {
        System.out.println("Child method");
    }
}

public class MethodOverrideExample {
    public static void main(String[] args)
    {
        Parent parent = new Parent();
        Child child = new Child();
        
        parent.method();
        child.method();
        
        Parent obj = new Child();
        obj.method();
    }
    
}
