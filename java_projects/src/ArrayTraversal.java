public class ArrayTraversal {
    public static void main (String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        // 传统for
        for (int i = 0; i < array.length; ++ i)
        {
            System.out.println(array[i]);
        }

        // 增强for
        for (int num : array)
        {
            System.out.println(num);
        }
    }
}
