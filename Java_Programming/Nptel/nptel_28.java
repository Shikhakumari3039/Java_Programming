// Interface A is defined with an abstract method run()
interface A {
	public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class B implements A {
	public void run() {}
}
// Class MyThread is defined which extends class B
class MyThread extends B {
	// run() is overriden and 'NPTEL Java' is printed.
	public void run() {
			System.out.print("NPTEL Java");
	}
}
public class nptel_28 {
    public static void main(String[] args) {
        // An object of MyThread class is created
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();
    }
    
}
