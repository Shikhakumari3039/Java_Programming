public class nptel_26 extends Thread{
    public void run(){
		System.out.print("Thread is Running.");
	}
public static void main(String args[]){  

		// Creating object of thread class
		nptel_26 thread=new nptel_26();  

                // Start the thread
		thread.start();
	}   
}