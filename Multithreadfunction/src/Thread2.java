public class Thread2 implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            for(int i=0;i<=50;i++)
        	System.out.println(i*i);
            
            }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

}