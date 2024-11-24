public class ArrayInitialization 
{
    public static void main(String[] args)
    {
        // 静态初始化
        int[] staticArray = {1, 2, 3};
        // 动态初始化
        int[] dynamicArray = new int[5];
        // 部分静态初始化
        int[] partStaticArray = new int[]{1, 2, 3};
        // 匿名数组初始化
        printArray(new int[]{1, 2, 3});
        // 静态二维数组初始化
        int[][] static2DArray = {{1, 2}, {3, 4}};
        // 动态二维数组初始化
        int[][] dynamic2DArray = new int[2][3];
        // 不规则二维数组初始化
        int[][] jaggedArray = new int[2][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
    }
    
    public static void printArray(int[] array) 
    {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
