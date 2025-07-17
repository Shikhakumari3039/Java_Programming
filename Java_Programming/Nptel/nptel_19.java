interface First{ 
    default void show(){ 
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    default void show(){ 
        System.out.println("Default method implementation of Second interface."); 
    } 
} 
public class nptel_19 implements First, Second{
    public void show(){
        First.super.show();
        Second.super.show();
    }
    public static void main(String args[]) {
        nptel_19 q = new nptel_19();
        q.show();
    }
    
}
