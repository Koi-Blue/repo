public class AccessModifier {
    public int publicVar = 0; // 公有变量
    protected int protectedVar = 1; // 保护变量
    private int privateVar = 2; // 私有变量
    int defaultVar = 3; // 默认访问权限变量

    public void publicMethod()
    {
        // 可以访问所有变量和方法
        System.out.println("Public method: " + publicVar + ", " + protectedVar + ", " + privateVar + ", " + defaultVar);
    }

    protected void protectedMethod()
    {
        // 可以访问所有变量和方法，包括私有变量
        System.out.println("Protected method: " + publicVar + ", " + protectedVar + ", " + privateVar + ", " + defaultVar);
    }

    private void privateMethod()
    {
        // 只能访问私有变量
        System.out.println("Private method: " + privateVar);
    }

    void defaultMethod()
    {
        // 可以访问默认访问权限的变量和方法，但不包括私有变量
        System.out.println("Default method: " + publicVar + ", " + protectedVar + ", " + defaultVar);
    }

    public static void main(String[] args)
    {
        AccessModifier obj = new AccessModifier();
        obj.publicMethod();
        obj.protectedMethod();
        obj.privateMethod();
        obj.defaultMethod();
    }
}
