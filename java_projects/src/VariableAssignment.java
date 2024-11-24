public class VariableAssignment {
    // 成员变量
    int intMember;
    float floatMember;
    boolean booleanMember;
    String stringMember;

    public static void main(String[] args) {
        VariableAssignment obj = new VariableAssignment();

        // 输出成员变量的默认值
        System.out.println("intMember: " + obj.intMember); // 输出 0
        System.out.println("floatMember: " + obj.floatMember); // 输出 0.0
        System.out.println("booleanMember: " + obj.booleanMember); // 输出 false
        System.out.println("stringMember: " + obj.stringMember); // 输出 null

        // 局部变量
        // int localVar; // 编译错误：局部变量必须初始化
        // System.out.println(localVar); // 编译错误

        // 综上，类的成员变量可以只声明，不赋值；但是局部变量必须赋初值
    }
}