public class LoopControl {
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i != array.length; ++ i)
        {
            if (array[i] == 7)
            {
                break; // 结束循环
            }

            if (array[i] % 2 == 0)
            {
                continue; // 跳过偶数
            }
            System.out.println(array[i]);
        }
    }
}
