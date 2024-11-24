public class SecurityExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class<?> clazz = Class.forName("java.lang.String");
            System.out.println("Class loaded: " + clazz.getName());
        } catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}