public class ConstructorExample {
    private int value;

    public ConstructorExample() {
        this.value = 0; // 无参构造，内部赋值
        System.out.println("Default constructor called. value : " + value);
    }

    public ConstructorExample(int value) {
        this.value = value;
        System.out.println("Constructor called with value : " + value);
    }

    public static void main(String[] args) {
        ConstructorExample example1 = new ConstructorExample();

        ConstructorExample example2 = new ConstructorExample(5);
    }
}
