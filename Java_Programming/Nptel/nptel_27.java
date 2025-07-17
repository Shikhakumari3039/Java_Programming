class ThreadRun implements Runnable {
    public void run(){ 
        System.out.print("Thread using Runnable interface."); 
    } 
}
public class nptel_27{ 
public static void main(String[] args){ 
    ThreadRun tr = new ThreadRun();
    Thread t = new Thread(tr);
    t.start();  
} 
}
