public class Person 
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void sayHello()
    {
        System.out.println("hello, my name is " + name + "and i am " + age + "years old . ");
    }

    public static void main(String[] args)
    {
        Person person = new Person("JJavva", 18);
        person.sayHello();
    }
}
