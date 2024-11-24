public class ExceptionHandling {
    public static void main(String[] args)
    {
        try
        {
            int[] arr = new int[2];
            System.out.println(arr[5]); // 这里有明显的超出异常
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds !! ");
        }
        catch (Exception e)
        {
            System.out.println("General exception ~ ");
        }
        finally
        {
            System.out.println("Finally block executed . ");
        }
    }
}
