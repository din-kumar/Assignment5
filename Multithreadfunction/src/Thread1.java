public class Thread1 implements Runnable {

    public void run()
    {
        try {
            // Displaying the thread that is running
     
        	double sum =0;
           for(int i=1;i<=50;i++)
           {
        	   sum+= i;
           }
           System.out.println("Average of firts 50 numbers "+ sum/50);
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

}