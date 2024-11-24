public class ThreadExample extends Thread 
{
    public void run() 
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
            try {
                Thread.sleep(1000); // 等待1秒
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) 
    {
        ThreadExample thread = new ThreadExample();
        thread.start();
    }
}