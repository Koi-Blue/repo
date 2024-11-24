public class GCExample 
{
    public static void main(String[] args) 
    {
        byte[] bigArray = new byte[1024 * 1024 * 10]; // 10MB
        System.out.println("Big array created.");
        try 
        {
            Thread.sleep(5000); // 等待5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bigArray = null; // 清空引用
        System.gc(); // 建议进行垃圾回收
        System.out.println("Requested garbage collection.");
        try
         {
            Thread.sleep(5000); // 等待5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}