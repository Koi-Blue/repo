class Parent
{
    public String name = "Parent";

    public void method()
    {
        System.out.println("Parent method");
    }

    public void showName()
    {
        System.out.println("Name : " + name);
    }
}

class Child extends Parent
{
    public String name = "Child";

    @Override
    public void method()
    {
        System.out.println("Child method");
    }

    public void childOnlyMethod() {
        System.out.println("This is a child-only method");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // 父类引用指向子类对象（多态）
        Parent obj = new Child();
        // 或直接new Child对象
        // Child obj = new Child();
        obj.method(); // 输出: Child method
        obj.showName(); // 输出: Name: Parent
        // obj.childOnlyMethod(); // 编译报错：Parent类中无此方法
        // 因为在 Java 中使用父类引用指向子类对象时，只能访问父类中定义的方法和属性。这是因为编译器根据引用类型（即父类类型）来决定可以访问哪些方法和属性。具体来说，即使实际对象是子类的实例，编译器也只会允许调用父类中声明的方法。
        // 如果想访问子类特有方法，需强制类型转换
        Child child = (Child) obj;
        child.childOnlyMethod(); // 输出: This is a child-only method
    }
}
